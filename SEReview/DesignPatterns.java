package com.company.javaRelearn.SEReview;

import java.util.*;

class Singleton {
    private static Singleton example;

    private Singleton() {}

    public static Singleton getExample() {
        example = new Singleton();
        return example;
    }
}

class Iterators {
    interface Combiner<T> {
        T combine(T x, T y);
    }

    public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner) {
        Iterator<T> it = seq.iterator();
        if (it.hasNext()) {
            T result = it.next();
            while (it.hasNext())
                result = combiner.combine(result,it.next());
            return result;
        }
        return null;
    }
}

class Composite {
    interface Components {
        String installation();
        List<Components> lowerParts();
    }

    class Door implements Components {
        @Override
        public String installation() {
            return "Door";
        }

        @Override
        public List<Components> lowerParts() {
            List<Components> result = new ArrayList<Components>();
            result.add(new Window());
            return result;
        }
    }

    class Window implements Components  {
        @Override
        public String installation() {
            return "Window";
        }

        @Override
        public List<Components> lowerParts() {
            return null;
        }
    }

    class Engine implements Components {
        @Override
        public String installation() {
            return "Window";
        }

        @Override
        public List<Components> lowerParts() {
            return null;
        }
    }

    class Car {
        List<Components> car = new ArrayList<Components>();

        public void makeCars(Components c) {
            this.car.add(c);
        }

        public String displayComponents() {
            StringBuilder s = new StringBuilder();
            for (Components c : this.car) {
                s.append(c.installation());
                for (Components cl : c.lowerParts()) {
                    s.append(cl.installation());
                }
            }
            return s.toString();
        }
    }
}

class AbstractFactory {
    interface FruitFactories<T> {
        T chooseFruit();
    }

    static class FruitToday {
        @Override
        public String toString() {
            return "Fruit today is " + getClass().getSimpleName();
        }
        List<FruitFactories<? extends FruitToday>> fruitList = new ArrayList<FruitFactories<? extends FruitToday>>();

        public void addList() {
            fruitList.add(new Apple.FruitFactories());
        }

        public FruitToday eat() {
            return fruitList.get(0).chooseFruit();
        }
    }

    static class Fruit extends FruitToday {}

    static class Apple extends Fruit {
        public static class FruitFactories implements com.company.javaRelearn.SEReview.AbstractFactory.FruitFactories<Apple> {
            @Override
            public Apple chooseFruit() {
                return new Apple();
            }
        }
    }
}

class PrototypeFactories {
    abstract class Fruit implements Cloneable {
        private Integer id;
        protected String name;

        abstract void eat();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        public Object clone() {
//            Object clone = null;
//
//            try {
//                clone = super.clone();
//
//            } catch (CloneNotSupportedException e) {
//                e.printStackTrace();
//            }
//
//            return clone;
//        }
    }

    class Banana extends Fruit {
        public Banana() {
            name = "Banana";
        }

        @Override
        void eat() {
            System.out.println("Eat Banana");
        }
    }

    class Pear extends Fruit {
        public Pear() {
            name = "Banana";
        }

        @Override
        void eat() {
            System.out.println("Eat Pear");
        }
    }

    class FruitToEat {
        private Map<Integer, Fruit> table = new HashMap<Integer, Fruit>();

        public void loadFruit() {
            table.put(1, new Banana());
            table.put(2, new Pear());
        }

        public Fruit getFruitObject(int num) {
//            return (Fruit) table.get(num).clone();
            return table.get(num);
        }

        public void Test() {
            FruitToEat f = new FruitToEat();
            f.loadFruit();
            Fruit f1 = f.getFruitObject(1);
            System.out.println(f1.getName());
            Fruit f2 = f.getFruitObject(2);
            System.out.println(f2.getName());
        }
    }
}

class Builders {
    interface Restaurant {
        public String name();
        public Double price();
    }

    abstract class Food implements Restaurant {
        public abstract String name();
        public abstract Double price();
    }

    class Spinach extends Food {
        @Override
        public String name() {
            return "Spinach";
        }

        @Override
        public Double price() {
            return 5.0;
        }
    }

    class Chicken extends Food {
        @Override
        public String name() {
            return "Chicken";
        }

        @Override
        public Double price() {
            return 10.0;
        }
    }

    class SetMeals {
        private List<Restaurant> list = new ArrayList<Restaurant>();

        public void addFood(Restaurant r) {
            list.add(r);
        }

        public Double getFoodPrice() {
            Double price = 0.0;
            for (Restaurant r : list) {
                price += r.price();
            }
            return price;
        }

        public void printMeals() {
            for (Restaurant r : list) {
                System.out.println(r.name());
                System.out.println(r.price());
            }
        }
    }

    class Order {
        public SetMeals order1 (){
            SetMeals meal = new SetMeals();
            meal.addFood(new Chicken());
            meal.addFood(new Spinach());
            meal.addFood(new Chicken());
            return meal;
        }

        void test() {
            Order order = new Order();
            SetMeals meal1 = order.order1();
            meal1.printMeals();
            meal1.getFoodPrice();
        }
    }
}

class Decorator {
    class Price {
        private Integer price;

        public Price (Integer price) {
            this.price = price;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }

    class FoodPrice extends Price {
        protected Price price;

        public FoodPrice(Price price) {
            super(price.price);
            this.price = price;
        }

        public void setPrice(Integer price) {
            this.price.setPrice(price);
        }
    }

    class ApplePrice extends FoodPrice {
        public ApplePrice(Price price) {
            super(price);
        }
    }

    class BananaPrice extends FoodPrice {
        public BananaPrice(Price price) {
            super(price);
        }
    }

    class test {
        void test() {
            ApplePrice a = new ApplePrice(new Price(1));
        }
    }
}

class Observer {
    interface Observer1 {
        void addValue(int num1, int num2);
    }

    class Subject {
        private List<Observer1> list = new ArrayList<Observer1>();
        private int num1;
        private int num2;

        public void addObserver(Observer1 observer1) {
            list.add(observer1);
        }

        public void removeObserver(Observer1 observer1) {
            list.remove(observer1);
        }

        public void add (int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
            changeAddNumber();
        }

        private void changeAddNumber() {
            for (Observer1 o : list) {
                o.addValue(num1, num2);
            }
        }
    }

    class NewObserver1 implements Observer1 {
        private String name;

        public NewObserver1(String name) {
            this.name = name;
        }

        @Override
        public void addValue(int num1, int num2) {
            System.out.println(num1 + num2);
        }
    }

    class Test {
        void test() {
            Subject subject = new Subject();
            Observer1 n1 = new NewObserver1("N1");
            Observer1 n2 = new NewObserver1("N2");
            subject.addObserver(n1);
            subject.addObserver(n2);
            subject.add(2,3);
        }
    }
}

class Command {
    interface Order {
        void run();
    }

    class WashingMachine {
        private Integer id = 1;

        public void wash() {
            System.out.println("Washing Machine " + id + " Wash");
        }

        public void dry() {
            System.out.println("Washing Machine " + id + " Dry");
        }
    }

    class WashClothes implements Order {
        private WashingMachine washingMachine;

        public WashClothes(WashingMachine washingMachine) {
            this.washingMachine = washingMachine;
        }

        @Override
        public void run() {
            washingMachine.wash();
        }
    }

    class DryClothes implements Order {
        private WashingMachine washingMachine;

        public DryClothes(WashingMachine washingMachine) {
            this.washingMachine = washingMachine;
        }

        @Override
        public void run() {
            washingMachine.dry();
        }
    }

    class Function {
        private List<Order> list = new ArrayList<Order>();

        public void addFunction(Order order){
            list.add(order);
        }

        public void executeFunctions(){
            for (Order order : list) {
                order.run();
            }
        }
    }
}

class Adapter {
    interface Assembling {
        void assembling(String furniture, String tool);
    }

    interface SpecificAssembling {
        void assemblingChair(String tool);
        void assemblingBed(String tool);
    }

    class AssemblingChair implements SpecificAssembling {
        @Override
        public void assemblingChair(String tool) {
            System.out.println("Assembling chair " + tool);
        }

        @Override
        public void assemblingBed(String tool) {

        }
    }

    class AssemblingBed implements SpecificAssembling {
        @Override
        public void assemblingChair(String tool) {

        }

        @Override
        public void assemblingBed(String tool) {
            System.out.println("Assembling bed " + tool);
        }
    }

    class AssemblingAdapter implements Assembling {

        SpecificAssembling specificAssembling;

        public AssemblingAdapter(String tool) {
            if(tool.equalsIgnoreCase("Slotted Screwdriver")){
                specificAssembling = new AssemblingChair();
            } else if (tool.equalsIgnoreCase("Phillips Screwdriver")){
                specificAssembling = new AssemblingBed();
            }
        }

        @Override
        public void assembling(String furniture, String tool) {
            if(tool.equalsIgnoreCase("Slotted Screwdriver")) {
                specificAssembling.assemblingChair(furniture);
            } else if(tool.equalsIgnoreCase("Phillips Screwdriver")){
                specificAssembling.assemblingBed(furniture);
            }
        }
    }
}

class State {
    interface State1 {
        void move(Gondola gondola);
    }

    class Gondola {
        private State1 state1;

        public Gondola() {
            state1 = null;
        }

        public State1 getState1() {
            return state1;
        }

        public void setState1(State1 state1) {
            this.state1 = state1;
        }
    }

    class UpState1 implements State1 {
        @Override
        public void move(Gondola gondola) {
            gondola.setState1(this);
        }

        @Override
        public String toString() {
            return "Up State";
        }
    }

    class DownState1 implements State1 {
        @Override
        public void move(Gondola gondola) {
            gondola.setState1(this);
        }

        @Override
        public String toString() {
            return "Down State";
        }
    }

    class Test {
        void test() {
            Gondola gondola = new Gondola();

            UpState1 upState1 = new UpState1();
            upState1.move(gondola);
            System.out.println(upState1);
        }
    }
}

public class DesignPatterns {
}
