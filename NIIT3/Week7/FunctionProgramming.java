package com.company.javaRelearn.NIIT3.Week7;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@FunctionalInterface
interface Animal{
    void run();
}

@FunctionalInterface
interface Add{
    int add(int a, int b);
}

@FunctionalInterface
interface Print{
    int print1(int a);
}

@FunctionalInterface
interface Function1{
    void function1();
}

@FunctionalInterface
interface Function2{
    int function2(int a);
}

@FunctionalInterface
interface Function3{
    int function3(int a, int b);
}

class Dog implements Animal{
    @Override
    public void run() {
        System.out.println("狗跑");
    }
}

class Cat implements Animal{
    @Override
    public void run() {
        System.out.println("猫跑");
    }
}

class AnimalAction{
    public void animalFunction(Animal animal){
        animal.run();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalAction animalAction = new AnimalAction();
        animalAction.animalFunction(dog);
        animalAction.animalFunction(cat);
    }
}

class UseLambdaReturn{
    public void animalFunction(Animal animal){
        animal.run();
    }

    public void function1(){
        Consumer<List<String>> cons = (list) -> {
            for(String s : list) {
                System.out.println(s);
            }
        };

        ArrayList<String> list = new ArrayList<String>();
        list.add("tom");
        list.add("jerry");
        list.add("linda");
        list.add("jerry");
        list.add("tom");
        cons.accept(list);
    }

    public void function2(){
        List<String> list = Arrays.asList("tom","jerry","linda","jerry","tom");
        list = list.stream().filter(val -> val.length() == 5)
                .skip(1).limit(2)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public void function3(){
        List<String> list = Arrays.asList("tom","jerry","linda","jerry","tom");
        int result = list.stream()
                .filter(val -> val.startsWith("je"))
                .map(val -> val.length() + 2)
                .reduce(0, (valA, valB) -> valA + valB);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Animal animal1 = () -> {
            System.out.println("狗跑1");
        };
        Animal animal2 = () -> {
            System.out.println("狗跑2");
        };

        AnimalAction animalAction = new AnimalAction();
        animalAction.animalFunction(animal1);
        animalAction.animalFunction(animal2);

        Add add = (a, b) -> {
            return a + b;
        };
        System.out.println(add.add(2, 3));

        Print print1 = a -> a + 1;
        System.out.println(print1.print1(2));

        Add add1 = (a, b) -> a + b;
        System.out.println(add1.add(4, 5));

        UseLambdaReturn useLambdaReturn = new UseLambdaReturn();
        useLambdaReturn.function1();
        useLambdaReturn.function2();
        useLambdaReturn.function3();

        Function1 function1 = () -> System.out.println("666");
        Function2 function2 = a -> a *= 6;
        Function3 function3 = (a, b) -> a * b;

        function1.function1();
        function2.function2(3);
        function3.function3(4, 7);
    }
}

class ArraysSort2{
    public void arraysSort(int[][] array){
        Arrays.sort(array, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o2[1] - o1[1];
        });
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{152, 28}, {3293, 50}, {2783, 40}, {212, 40}, {321, 45}};
        ArraysSort2 arraysSort = new ArraysSort2();
        arraysSort.arraysSort(array);
    }
}

class CollectionsSort2 {
    public void sortCollections(List<Integer> list) {
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5);
        new CollectionsSort2().sortCollections(list);
    }
}

class Student{
    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int compareAge(Student s1, Student s2){
        return s1.getAge() - s2.getAge();
    }

    public int compareId(Student s1, Student s2){
        return s2.getId() - s1.getId();
    }
}

@FunctionalInterface
interface Sum1{
    int sum1(int[] array);
}

class CompareStudent{
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(1, "ab", 20),
                new Student(10, "ce", 16),
                new Student(6, "bw", 18)
        };
        Arrays.sort(students, Student::compareAge);
        System.out.println(Arrays.toString(students));
        Student student = new Student();
        Arrays.sort(students, student::compareId);
        System.out.println(Arrays.toString(students));

        String[] strings = new String[]{"awevc","asw","jfbvdui"};
        Arrays.sort(strings, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}

class StaticFunctionInterfaces{
    public void consumerFunction(){
        Consumer<List<Integer>> consumer = (list) -> {
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                max = Math.max(max, list.get(i));
            }
            System.out.println(max);
        };

        List<Integer> list = Arrays.asList(1,5,2,7,4);
        consumer.accept(list);
    }

    public int supplierFunction(){
        Supplier<Integer> supplier = () ->{
            Random random = new Random();
            int max = 0;
            for (int i = 0; i < 10; i++) {
                int rand = random.nextInt(100);
                max = Math.max(max, rand);
            }
            return max;
        };

        return supplier.get();
    }

    public String functionFunction(int id){
        Student[] students = new Student[]{
                new Student(1, "ab", 20),
                new Student(10, "ce", 16),
                new Student(6, "bw", 18)
        };
        Function<Integer, String> function = (id1) -> {
            for (Student student : students){
                if(student.getId() == id1){
                    return student.toString();
                }
            }
            return null;
        };
        return function.apply(id);
    }

    public boolean predicateFunction(int num){
        List<Integer> list = Arrays.asList(1,5,2,7,4);
        Predicate<Integer> predicate = (num1) -> {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(num1)) {
                    return true;
                }
            }
            return false;
        };

        return predicate.test(num);
    }

    public int findStringIndex(String words){
        String[] strings = new String[]{"ascw", "aweav", "acwe"};
        Function<String, Integer> function = (words1) -> {
            for (int i = 0; i < strings.length; i++) {
                if(strings[i].equals(words1)){
                    return i;
                }
            }
            return -1;
        };
        return function.apply(words);
    }

    public static void main(String[] args) {
        new StaticFunctionInterfaces().consumerFunction();
        System.out.println(new StaticFunctionInterfaces().supplierFunction());
        System.out.println(new StaticFunctionInterfaces().functionFunction(1));
        System.out.println(new StaticFunctionInterfaces().predicateFunction(3));
    }
}

public class FunctionProgramming {
}
