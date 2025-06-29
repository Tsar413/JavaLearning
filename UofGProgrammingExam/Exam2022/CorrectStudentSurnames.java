package com.company.javaRelearn.UofGProgrammingExam.Exam2022;

import java.io.*;
import java.util.Scanner;

public class CorrectStudentSurnames {
    /*
    * The general idea of the program is to read all the names in the file,
    * then store them in temps, then split the names that need to be checked
    * into checkedStringSplit. then compare the string in temps with
    * checkedStringSplit, first you need to determine if the strings are equal,
    * if they are then do a per-character comparison If there is a difference of
    * 1 between the final number and the length of the character being compared,
    * it means that there is a character that is not the same, which means that
    * the input is wrong.
    * */
    public static boolean checkStudentSurname(String checkedSurname) {
        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGProgrammingExam\\Exam2022\\Srecord.txt");
        FileInputStream fileInputStream = null;
        boolean result = false;
        try {
            fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            String output = "";
            while (scanner.hasNext()) {
                String temp = scanner.nextLine();
                String[] temps = temp.split(" "); //Data read from split files
                String[] checkedStringSplit = checkedSurname.split(""); //Split Checked Name
                for (int i = 0; i < temps.length; i++) {
                    int number = 0;
                    String[] tempsStringSplit = temps[i].split(""); //Splitting names in split files
                    if (tempsStringSplit.length == checkedStringSplit.length) { //Determine if the characters are the same length
                        for (int j = 0; j < tempsStringSplit.length; j++) {
                            if (tempsStringSplit[j].equals(checkedStringSplit[j])) { //Compare character cases
                                number++;
                            }
                        }
                        if (number == tempsStringSplit.length - 1) {
                            result = true;
                            temps[i] = checkedSurname; //Change of name
                        }
                    }
                    output += temps[i];
                    output += " ";

                }
            }
            System.out.println(output);
            FileWriter writer = new FileWriter(file);
            writer.write(output);
        } catch (FileNotFoundException e) {
            System.out.println("No Files");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        boolean result = checkStudentSurname("Ferguson");
        System.out.println(result);
    }
}
