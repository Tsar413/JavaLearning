package com.company.javaRelearn.NIIT3.Week2;

public class Grocery {
    private int weight;

    public void weightNow(){
        this.weight = 0;
    }
    public void weightNow(int weight){
        this.weight = weight;
    }
    public int checkWeight(){
        return this.weight;
    }

    public static void main(String[] args) {
        Grocery grocery1 = new Grocery();
        grocery1.weightNow();
        System.out.println(grocery1.checkWeight());

        Grocery grocery2 = new Grocery();
        grocery2.weightNow(10);
        System.out.println(grocery2.checkWeight());
    }
}
