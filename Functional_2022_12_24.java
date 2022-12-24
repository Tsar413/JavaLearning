package com.company.javaRelearn;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

interface Combiner<T> {
    T combine(T x, T y);
}
interface UnaryFunction<R,T> {
    R function(T x);
}
interface Collector<T> extends UnaryFunction<T,T> {
    T result(); //提取收集参数的结果
}
interface UnaryPredicate<T> {
    boolean test(T x);
}

public class Functional_2022_12_24 {
    //在每个元素上调用Combiner对象，将其与运行结果相结合，最后返回。
    public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next();
            while (it.hasNext())
                result = combiner.combine(result,it.next());
            return result;
        }
        //如果seq为空
        return null;
    }
    // 取一个函数对象并在列表中的每个对象上调用它，忽略返回值。该函数对象可以作为
    // 一个收集参数，所以它在最后被返回。
    public static <T> Collector<T> forEach(Iterable<T> seq, Collector<T> func) {
        for (T t: seq)
            func.function(t);
        return func;
    }
    //通过为列表中的每个对象调用一个函数对象来创建一个结果列表
    public static <R,T> List<R> transform(Iterable<T> seq, UnaryFunction<R,T> func) {
        List<R> result = new ArrayList<R>();
        for (T t : seq)
            result.add(func.function(t));
        return result;
    }
    //将一个单数谓词应用于一个序列中的每一个项目。并返回一个产生 "真 "的项目列表。
    public static <T> List<T> filter(Iterable<T> seq, UnaryPredicate<T> pred) {
        List<T> result = new ArrayList<T>();
        for (T t : seq)
            if (pred.test(t))
                result.add(t);
        return result;
    }
    //为了使用上述通用方法，我们需要创建函数对象来适应我们的特殊需要。
    static class IntegerAdder implements Combiner<Integer> {
        @Override
        public Integer combine(Integer x, Integer y) {
            return x + y;
        }
    }
    static class IntegerSubtracter implements Combiner<Integer> {
        @Override
        public Integer combine(Integer x, Integer y) {
            return x - y;
        }
    }
    static class BigDecimalAdder implements Combiner<BigDecimal> {
        @Override
        public BigDecimal combine(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    }
    static class BigIntegerAdder implements Combiner<BigInteger> {
        @Override
        public BigInteger combine(BigInteger x, BigInteger y) {
            return x.add(y);
        }
    }
    static class AtomicLongAdder implements Combiner<AtomicLong> {
        @Override
        public AtomicLong combine(AtomicLong x, AtomicLong y) {
            return new AtomicLong(x.addAndGet(y.get()));
        }
    }
    static class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal> {
        //Ulp: Units in the last place
        @Override
        public BigDecimal function(BigDecimal x) {
            return x.ulp();
        }
    }
    static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T> {
        private T bound;
        public GreaterThan(T bound) {
            this.bound = bound;
        }
        @Override
        public boolean test(T x) {
            return x.compareTo(bound) > 0;
        }
    }
    static class MultiplyingIntegerCollector implements Collector<Integer> {
        private Integer val = 1;
        @Override
        public Integer function(Integer x) {
            val *= x;
            return val;
        }

        @Override
        public Integer result() {
            return val;
        }
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
        Integer result = reduce(li,new IntegerAdder());
        System.out.println(result);

        result = reduce(li, new IntegerSubtracter());
        System.out.println(result);

        System.out.println(filter(li,new GreaterThan<Integer>(4)));

        System.out.println(forEach(li,new MultiplyingIntegerCollector()).result());

        System.out.println(forEach(filter(li,new GreaterThan<Integer>(4)),
                new MultiplyingIntegerCollector()).result());

        MathContext mc = new MathContext(7);
        List<BigDecimal> lbd = Arrays.asList(
                new BigDecimal(BigInteger.valueOf(1),1,mc),
                new BigDecimal(BigInteger.valueOf(2),2,mc),
                new BigDecimal(BigInteger.valueOf(3),3,mc),
                new BigDecimal(BigInteger.valueOf(4),4,mc));
        BigDecimal rbd = reduce(lbd,new BigDecimalAdder());
        System.out.println(rbd);

        System.out.println(filter(lbd, new GreaterThan<BigDecimal>(new BigDecimal(3))));

        List<BigInteger> lbi = new ArrayList<BigInteger>();
        BigInteger bi = BigInteger.valueOf(11);
        for (int i = 0; i < 11; i++) {
            lbi.add(bi);
            bi = bi.nextProbablePrime();
        }
        System.out.println(lbi);

        BigInteger rbi = reduce(lbi,new BigIntegerAdder());
        System.out.println(rbi);
        System.out.println(rbi.isProbablePrime(5));

        List<AtomicLong> lal = Arrays.asList(
                new AtomicLong(11), new AtomicLong(47),
                new AtomicLong(74), new AtomicLong(133));
        AtomicLong ral = reduce(lal,new AtomicLongAdder());
        System.out.println(ral);

        System.out.println(transform(lbd, new BigDecimalUlp()));
    }
}
