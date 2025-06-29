package com.company.javaRelearn.NIIT3.Week5;

class Math{
    int divide(int valA, int valB) {
        return valA/valB;
    }

    public static void main(String[] args) {
        Math math = new Math();
        int result = math.divide(10, 0);
    }
}

class ArrayException{
    public void arrayException(){
        try {
            int[] array = new int[5];
            int result = array[5];
            System.out.println("result value : " + result);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayException arrayException = new ArrayException();
        arrayException.arrayException();
    }
}

class NullPointerException{
    public void nullException(Integer num){
        System.out.println(num + 1);
    }

    public static void main(String[] args) {
        NullPointerException nullPointerException = new NullPointerException();
        nullPointerException.nullException(null);
    }
}

class ThrowException{
    public static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        divide(1, 0);
    }
}

class ThrowsException{
    public static String verification(String code, String verification){
        try {
            if(!code.equals(verification)) throw new RuntimeException("验证码错误");
        } catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
        return "Right";
    }

    public static void main(String[] args) {
        verification("a", "b");
    }
}

class AssertsLearning{
    public void method(){
        String str = "Hello";
        assert str.length() == 4 : "长度不符";
        System.out.println(str);
    }

    public static void main(String[] args) {
        new AssertsLearning().method();
    }
}

public class ErrorException {
}
