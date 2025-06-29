package com.company.javaRelearn.UofGAssignment1;

public class Task2 {
    public static Integer task2(int max, int number) {
        int flag = 0; //flag is used to count and is used to return
        for (int i = 1; i <= max; i++) {
            /*
            * && is used before to determine if it is a factor
            * After && is used to determine if it is an odd number
            * Flag+1 if eligible
            * */
            if(number % i == 0 && i % 2 != 0) {
                flag++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Task 2: Digital Processing");
        int max = 99;
        int num = 88;
        int number = task2(max,num); //number is used to take over the output value
        System.out.println("Between the numbers 1 and " + max + ", " +
                "the odd number of conventions for " + num + " is " + number);
    }
}
