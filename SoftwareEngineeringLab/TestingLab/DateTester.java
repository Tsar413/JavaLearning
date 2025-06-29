package com.company.javaRelearn.SoftwareEngineeringLab.TestingLab;

public class DateTester {

    public void testDiffInYears() {
        Date d1 = new Date(1,1,2023);
        Date d2 = new Date(1,1,2024);
        assert (d1.diffInYears(d2) == 5);

        // Write Other Test Cases Here
    }

    public static void main(String args[]) {
        DateTester tester = new DateTester();
        tester.testDiffInYears();

        // Note if a test fails we will throw an exception before
        // reaching this line
        System.out.println("Tests Successful");
    }
}