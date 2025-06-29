package com.company.javaRelearn.UofGWeek2;

public class Lab1Test {
    public static void main(String[] args) {
        int age = 30;
        Person person = new Person();
        person.setName("Jim");
        person.testPersonFunction();
        person.addChildren(new Person("Tom",12));
        person.addChildren(new Person("James",8));
        person.addChildren(new Person("Helen",6));
        person.addChildren(new Person("Beryl",5));
        System.out.println(person);
        Person person2 = new Person(1,"Kate",age,"development");
        person2.testPersonFunction();
        person2.testPersonFunction2();
        person2.setAge(age + 5);
        System.out.println(age);
        System.out.println(person2);

        Person person3 = new Student(1,"Kate",18,"uni",3.6);
        Person person3_1 = new Person(1,"Kate",18,"uni");
        System.out.println(person3);
        System.out.println(person3_1);
        Student student = new Student(1,"Kate",18,"uni",3.6);
        System.out.println(student);


    }
}
