package com.company.javaRelearn.NIIT3.Week2;

public class SampleClass {
    public int counter = 1;

    public void display(){
        System.out.println(this.counter);
    }

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.display();
    }
}
