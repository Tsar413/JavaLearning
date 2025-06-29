package com.company.javaRelearn.NIIT3.Week8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ForEachLearning{
    public void forEachLearning(){
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        Stream<Integer> stream = list.stream();
        stream.forEach(num -> {
            System.out.print(num + " ");
        });
    }

    public static void main(String[] args) {
        new ForEachLearning().forEachLearning();
    }
}

class FilterLearning{
    public void filterLearning(){
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        Stream<Integer> stream = list.stream();
        stream.filter(num -> {
            return num >= 5;
        }).forEach(num -> {
            System.out.print(num + " ");
        });
    }

    public static void main(String[] args) {
        new FilterLearning().filterLearning();
    }
}

class SkipLearning{
    public void skipLearning(){
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        Stream<Integer> stream = list.stream();
        stream.skip(3).forEach(num -> {
            System.out.print(num + " ");
        });
    }

    public static void main(String[] args) {
        new SkipLearning().skipLearning();
    }
}

class LimitLearning{
    public void limitLearning(){
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        Stream<Integer> stream = list.stream();
        stream.limit(4).forEach(num -> {
            System.out.print(num + " ");
        });
    }

    public static void main(String[] args) {
        new LimitLearning().limitLearning();
    }
}

class MapLearning{
    public void mapLearning(){
        List<String> list = Arrays.asList("11", "12", "13", "14", "15");
        Stream<String> stream = list.stream();
        Stream<Integer> stream1 = stream.map(Integer::parseInt);
        stream1.forEach(num -> System.out.print(num + " "));
        Stream<String> stream2 = list.stream();
        Stream<Integer> stream3 = stream2.map(s -> s.length());
        stream3.forEach(System.out::print);
    }

    public static void main(String[] args) {
        new MapLearning().mapLearning();
    }
}

class SortLearning{
    public void sortLearning1(){
        List<String> list = Arrays.asList("13", "18", "11", "15", "20");
        list.stream().map(Integer::parseInt).sorted().forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    public void sortLearning2(){
        List<String> list = Arrays.asList("13", "18", "11", "15", "20");
        list.stream().map(Integer::parseInt).sorted(((o1, o2) -> {
            return o2 - o1;
        })).forEach(num -> System.out.print(num + " "));
    }

    public static void main(String[] args) {
        new SortLearning().sortLearning1();
        new SortLearning().sortLearning2();
    }
}

class ReduceLearning{
    public void reduceLearning(){
        List<String> list = Arrays.asList("11", "12", "13", "14", "15");
        Stream<String> stream = list.stream();

        Integer sum = stream.map(Integer::parseInt)
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new ReduceLearning().reduceLearning();
    }
}

class CollectLearning{
    public void collectLearning1(){
        List<String> list = Arrays.asList("11", "12", "13", "14", "15");
        List<Integer> list1 = list.stream().map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list1);
    }

    public void collectLearning2(){
        List<String> list = Arrays.asList("11", "12", "13", "14", "13");
        HashSet<Integer> set1 = list.stream().map(Integer::valueOf).collect(Collectors.toCollection(HashSet::new));
        System.out.println(set1);
    }
}

public class StreamLearning {
}
