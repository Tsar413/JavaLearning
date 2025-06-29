package com.company.javaRelearn.NIIT3.WeekClass3;

class ArrayReview{
    public void arrayReview(){
        int[][] array = new int[4][5];
        for (int i = 0; i < array.length; i++) { //外层循环行
            for (int j = 0; j < array[0].length; j++) { //内层循环列
                array[i][j] = (i + j) * 2; //赋值
            }
        }

        for (int[] array1 : array){
            for (int a : array1){
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new ArrayReview().arrayReview();
    }
}

enum Fruit1{
    Apple(10), Pear(20), Orange(30);

    private int count;

    private Fruit1(int count){
        this.count = count;
    }

    public int getCount(){
        return count;
    }
}

//生成一个枚举类Pets 提供两个参数 分别是String和int 分别代表名字与年龄 通过循环进行调用
enum Pets{
    Dog("a", 5), Cat("b", 3);

    private String name;
    private int age;

    Pets(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EnumLearning {
    public static void main(String[] args) {
        for (Pets pets : Pets.values()){
            System.out.println(pets + ":" + pets.getName() + "," + pets.getAge());
        }
    }
}
