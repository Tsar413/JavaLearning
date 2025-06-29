package com.company.javaRelearn.SEReview.Lab.Lab0.Lab0_1_1;

public class Sum {
    public void sum(int numberA, int numberB) {
        int result = numberA + numberB;
        System.out.println("sum: " + result);
    }

    public void sum(StoreData storeData) {
        int result = storeData.getNumberA() + storeData.getNumberB();
        System.out.println("sum: " + result);
    }
}
