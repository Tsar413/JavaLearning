package com.company.javaRelearn.NIIT3.Week5;

class Outer1{
    public Outer1(){}

    public void output(){
        System.out.println("This is Output1");
    }

    public Inner1 getInner1(){
        return new Inner1();
    }

    /*
    * 成员内部类
    * */
    class Inner1{
        public Inner1(){}

        public void output(){
            System.out.println("This is Inner1");
        }
    }
}

class Outer2{
    private int outerVariable = 1;
    private static int outerStaticVariable = 2;

    public void outerMethod1(){
        System.out.println("外部一般方法");
    }

    public static void outerStaticMethod1(){
        System.out.println("外部静态方法");
    }

    static class Inner2{
        private int innerVariable = 3;
        private static int innerStaticVariable = 4;

        public void innerMethod1(){
            System.out.println(outerStaticVariable);
            System.out.println(innerVariable);
            System.out.println(innerStaticVariable);
            System.out.println("内部一般方法");
            outerStaticMethod1();
        }

        public static void innerStaticMethod1(){
            System.out.println("内部静态方法");
            System.out.println(outerStaticVariable);
            System.out.println(innerStaticVariable);
            outerStaticMethod1();
        }
    }
}

interface Inner3{
    void outerMethod1();
    void outerMethod2();
}

class Outer3{
    public void useInner3(Inner3 inner3){
        inner3.outerMethod1();
        inner3.outerMethod2();
    }

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3();
        outer3.useInner3(new Inner3() {
            @Override
            public void outerMethod1() {
                System.out.println("使用外部方法1");
            }

            @Override
            public void outerMethod2() {
                System.out.println("使用外部方法2");
            }
        });
    }
}

class Student{
    public void showType() {
        System.out.println("Student");
    }
}
class ComputerStudent extends Student{
    public void showType() {
        System.out.println("Computer Student");
    }
}
class ArtStudent extends Student{
    public void showType() {
        System.out.println("Art Student");
    }
}
class Invite{
    public static void main(String[] args) {
//        Student stu = new Student();
        Student stu = new ArtStudent(); //将一个父类引用强制转换为子类引用。这种转换在语法上是允许的，但只有当对象本身确实是子类实例时才是合法的
        Student cs = new ComputerStudent();
        ArtStudent as = (ArtStudent) stu;
        cs.showType();
        as.showType();
    }
}

public class InnerClassTest1 {
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        Outer1.Inner1 inner1 = outer1.new Inner1();
        inner1.output();
        Outer1.Inner1 inner2 = outer1.getInner1();
        inner2.output();

        Outer2.Inner2 inner3 = new Outer2.Inner2();
        inner3.innerMethod1();
        Outer2.Inner2.innerStaticMethod1();


    }
}
