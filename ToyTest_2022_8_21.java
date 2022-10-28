package com.company.javaRelearn;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
    Toy() {}
    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }

}

public class ToyTest_2022_8_21 {
    static void printInfo(Class cc) {
        System.out.println("Class Name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        //判断类是否是接口
        System.out.println("Simple Name: " + cc.getSimpleName());
        //getSimpleName()产生不含包名的类名
        System.out.println("Canonical Name: " + cc.getCanonicalName());
        //getCanonicalName()产生完全的类名
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.company.javaRelearn.FancyToy");
            //forName()创建了一个Class引用，将其初始化并指向FancyToy
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        //getInterfaces()返回所有的接口
        Class up = c.getSuperclass();
        //getSuperclass()查询基类
        Object obj = null;
        try {
            obj = up.newInstance();
            //newInstance()实现虚拟构造器
        } catch (InstantiationException e) {
            System.out.println("Can't instantiation");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Can't access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
