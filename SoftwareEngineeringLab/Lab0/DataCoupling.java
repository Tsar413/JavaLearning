package com.company.javaRelearn.SoftwareEngineeringLab.Lab0;

public class DataCoupling {
    int numberA = 1;
    int numberB = 2;
    int numberC = 3;
    boolean allNumbersSet = true;
    Printer printer = new Printer();
    Sum mySum = new Sum();

    public void firstCaller() {

//        printer.print(numberA, numberB, numberC, allNumbersSet);
//        try {
//            printer.print(DataCoupling.class.newInstance());
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        printer.printA(numberA);
        printer.printB(numberB);
        printer.printC(numberC);
        printer.printAllNumberSet(allNumbersSet);
    }

    public void secondCaller() {
//        mySum.sum(numberA, numberB);
//        try {
//            mySum.sum(DataCoupling.class.newInstance());
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        mySum.sendNumberA(numberA);
        mySum.sendNumberB(numberB);
        mySum.sum();
    }

    public static void main(String[] args) {
        DataCoupling myDataCoupling = new DataCoupling();
        myDataCoupling.firstCaller();
        myDataCoupling.secondCaller();
    }
}
