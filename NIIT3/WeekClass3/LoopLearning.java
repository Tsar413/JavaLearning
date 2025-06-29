package com.company.javaRelearn.NIIT3.WeekClass3;

import java.util.Arrays;

enum Fruit{
    Apple, Pear, Orange;
}

//使用while循环 输出1-20的奇数
class WhileLoop{
    public void getOdd(){
        int i = 1;
        while (i <= 20){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        WhileLoop whileLoop = new WhileLoop();
        whileLoop.getOdd();
    }
}

class DoWhileLoop{
    public void helloWorld(){
        int n = 0;
        do {
            System.out.println("Hello World");
            n++;
        } while (n < 5);
    }

    //使用do-while循环 输出1-20的奇数
    public void getOdd(){
        int i = 1;
        do {
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
        System.out.println();
    }

    public static void main(String[] args) {
        DoWhileLoop doWhileLoop = new DoWhileLoop();
        doWhileLoop.helloWorld();
        doWhileLoop.getOdd();
    }
}

class ForLoop{
    public void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    //使用for循环 输出1-20的奇数
    public void getOdd(){
        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /*
    * 增强for循环
    * */
    public void advancedLoop(){
        int[] array = new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int n : array){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ForLoop forLoop = new ForLoop();
//        forLoop.helloWorld();
//        forLoop.getOdd();
        forLoop.advancedLoop();
    }
}

class Loops{
    /*
    * 生成 3 * 5 的星阵
    *     *****
    *     *****
    *     *****
    * */
    public void stars(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    * 生成阶梯数阵
    * 1
    * 1 2
    * 1 2 3
    * 1 2 3 4
    * 1 2 3 4 5
    * */
    public void numbers(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    /*
    * 输出九九乘法表
    * */
    public void mulTables(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    /*
    * 输出2-20以内的素数
    * */
    public void getPrimeNumbers(){
        for (int i = 2; i <= 20; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
                if(count >= 2){
                    break;
                }
            }
            if(count == 1){
                System.out.print(i + " ");
            }
        }
    }

    public void continueUse(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j == 2){
                    break;
                }
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.continueUse();
    }
}

class ArrayLearning{
    public void arrayInit(){
        int[] a = new int[5];
        int[] b = new int[]{1,2,3,4,5};
        a[0] = 1;
        a[3] = 3;
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.print(a[i] + " ");
        }

        //初始化一个长度为10的double类型的数组，并为其赋值，对应的值为1.1，1.2，每次增加0.1
        //通过循环遍历输出
        double[] b2 = new double[]{1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0};
        double[] b1 = new double[10];
        double temp1 = 1.1;
        for (int i = 0; i < b1.length; i++) {
            b1[i] = temp1;
            temp1 += 0.1;
        }
        for (int i = 0; i < b1.length; i++) {
            System.out.print(b1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayLearning arrayLearning = new ArrayLearning();
        arrayLearning.arrayInit();
    }
}

class ArrayLearning1{
    public void arrayInit(){
        int[][] array = new int[3][4];
        int num = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[][] array1 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //创建三行两列的char类型的二维数组 值分别是a,b,c,d,e,f 初始化数组并赋值
        char[][] c1 = new char[][]{{'a','b'},{'c','d'},{'e','f'}};

        char[][] c2 = new char[3][2];
        char c = 'a';
        for (int i = 0; i < c2.length; i++) {
            for (int j = 0; j < c2[0].length; j++) {
                c2[i][j] = c;
                c += 1;
            }
        }
        System.out.println(Arrays.deepToString(c2));
    }

    public static void main(String[] args) {
        ArrayLearning1 arrayLearning1 = new ArrayLearning1();
        arrayLearning1.arrayInit();
    }
}

class ArrayOutput{
    public void arrayOutput(){
        int[] array1 = new int[]{1,2,3,4,5};
        for (int a : array1){
            System.out.print(a + " ");
        }
        System.out.println();

        int[][] array2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int[] a3 : array2){
            for (int a : a3){
                System.out.print(a + " ");
            }
            System.out.println();
        }

        //创建三行两列的char类型的二维数组 值分别是a,b,c,d,e,f 初始化数组并赋值
        char[][] c1 = new char[][]{{'a','b'},{'c','d'},{'e','f'}};
        for (char[] c2 : c1){
            for (char c3 : c2){
                System.out.print(c3 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayOutput arrayOutput = new ArrayOutput();
        arrayOutput.arrayOutput();
    }
}

public class LoopLearning {
}
