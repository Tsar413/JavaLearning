package com.company.javaRelearn;

class Building {}
class House1 extends Building {}

public class ClassTypeCapture_2022_10_12<T> {
    Class<T> kind;
    public ClassTypeCapture_2022_10_12(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture_2022_10_12<Building> ctt1 =
                new ClassTypeCapture_2022_10_12<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House1()));
        ClassTypeCapture_2022_10_12<House1> ctt2 =
                new ClassTypeCapture_2022_10_12<House1>(House1.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House1()));
    }
}
