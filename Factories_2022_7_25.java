package com.company.javaRelearn;

interface Service1 {
    void method1();
    void method3();
}

interface ServiceFactory {
    Service1 getService();
}

class Implementation1 implements Service1 {
    private Implementation1() {}

    @Override
    public void method1() {
        System.out.println("Implementation1 method1");
    }

    @Override
    public void method3() {
        System.out.println("Implementation1 method3");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service1 getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service1 {
    private Implementation2() {}

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method3() {
        System.out.println("Implementation2 method3");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service1 getService() {
            return new Implementation2();
        }
    };
}

public class Factories_2022_7_25 {
    public static void serviceConsumer(ServiceFactory fact) {
        Service1 s = fact.getService();
        s.method1();
        s.method3();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
