package com.company.javaRelearn.UofGAssignment1;

import javax.management.RuntimeErrorException;
import java.util.Scanner;

public class Task4 {
    public static void task4(int number) {
        int max = number + 999; //Upper and lower limits for determining the number
        int min = number - 999;
        int number1 = 0; //Initialize two numbers
        int number2 = 0;

        System.out.println("Please input a number between " + min +
                " and " + max);

        int judgeFlag = 0;
        int inputNumberControl = 0;
        /*
        * The main purpose of the loop is to make a judgement on
        * whether the numbers meet expectations or output gaps.
        * */
        while (judgeFlag == 0) {
            /*
            * The main purpose of this loop is to control the input,
            * and since a three-digit formatted output must be performed,
            * the actual range of numbers is determined at the time the
            * numbers are entered [number-999, number+999].
            * The inputNumberControl of the output control represents whether
            * a loop is required, when the user enters a value that exceeds
            * this range it needs to be re-entered, when the user needs to
            * guess again it will enter the loop and be tested.
            * */
            while (inputNumberControl == 0) {
                /*
                * Method one uses nextInt() for input, while method two
                * disassembles subString() according to the input string,
                * separating it according to the spaces before and after.
                * */
                Scanner scanner = new Scanner(System.in);
                number1 =scanner.nextInt();
//                number2 = scanner.nextInt();
                String numberTemp2 = scanner.nextLine();
//                System.out.println(numberTemp2.length());
                String numberTemp2_1 = numberTemp2.trim();

//                System.out.println(numberTemp2_1.length());
                if(numberTemp2.length() - numberTemp2_1.length() > 1 || numberTemp2_1.equals("")) {
                    System.out.println("Only one space is allowed. Please input again.");
                } else {
                    try {
                        number2 = Integer.parseInt(numberTemp2_1);
                        if((number1 < min || number1 > max) || (number2 < min || number2 > max)){
                            System.out.println("Please input numbers in the range.  Please input again.");
                        } else {
                            inputNumberControl = 1;
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Input again");
                    }

                }

//                String tempForNumbers = scanner.nextLine();
//                int tempForNumbersLength = tempForNumbers.length();
//                int numberForSpace = tempForNumbers.indexOf(" ");
//                int numberForLastSpace = tempForNumbers.lastIndexOf(" ");
//                /*
//                * The range for number 1 is from the beginning to before
//                * the space, and the range for number 2 is from after the
//                * space to the end of the length of the string.
//                * */
//                String tempNumber1 = tempForNumbers.substring(0,numberForSpace);
//                number1 = Integer.parseInt(tempNumber1);
////            System.out.println(number1);
//                String tempNumber2 = tempForNumbers.substring(numberForLastSpace + 1, tempForNumbersLength);
//                if(numberForLastSpace - numberForSpace > 1) {
//                    System.out.println("Only one space is allowed. Please input again.");
//                } else {
//                    number2 = Integer.parseInt(tempNumber2);
////                    System.out.println(number2);
//                    /*
//                     * Any number out of range must be re-entered
//                     * */
//                    if((number1 < min || number1 > max) || (number2 < min || number2 > max)){
//                        System.out.println("Please input numbers in the range");
//                    } else {
//                        inputNumberControl = 1;
//                        break;
//                    }
//                }
            }


            if(number1 == number || number2 == number) {
                /*
                * Once any number meets the requirement, the loop is jumped.
                * */
                System.out.println("Success and the secret number is " + number);
                judgeFlag = 1;
            } else if(Math.abs(number - number1) < Math.abs(number - number2)) {
                /*
                * The Math.abs() method is used to calculate the absolute value of
                * the difference between any two numbers.
                * */
                inputNumberControl = 0;
                /*
                * Adding zeros for completeness according to the length of the number
                * */
                System.out.println("You are " +  String.format("%03d", Math.abs(number - number1)) + " away from the secret number!");

            } else {
                /*
                * The method is similar to the one above, the only difference being that here it
                * is a special case where the other number is closer and occurs at an equal
                * distance from both.
                * */
                inputNumberControl = 0;
                System.out.println("You are " +  String.format("%03d", Math.abs(number - number2)) + " away from the secret number!");                }
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 4: Guess the Numbers");
        task4(364); //Enter a guess value
    }
}
