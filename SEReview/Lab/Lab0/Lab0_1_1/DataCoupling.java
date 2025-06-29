package com.company.javaRelearn.SEReview.Lab.Lab0.Lab0_1_1;

public class DataCoupling {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;

    StoreData storeData = new StoreData(numberA, numberB, numberC, allNumbersSet);

    Printer printer = new Printer();
    Sum mySum = new Sum();

//    public void firstCaller() {
//        printer.print(numberA, numberB, numberC, allNumbersSet);
//    }

    public void firstCaller() {
        printer.print(storeData);
    }

//    public void secondCaller() {
//        mySum.sum(numberA, numberB);
//    }

    public void secondCaller() {
        mySum.sum(storeData);
    }

    public static void main(String[] args) {
        DataCoupling myDataCoupling = new DataCoupling();
        myDataCoupling.firstCaller();
        myDataCoupling.secondCaller();
    }

    // 1.2 Stamp Coupling sum方法只使用了该对象的部分数据
}
