package com.company.javaRelearn.UofGWeek8;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2 {
    public static List<String> makeList(String ...args) {
        List<String> result = new ArrayList<String>();
        for (String s : args)
            result.add(s);
        return result;
    }

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<String>();
        String temp = "";

        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGWeek8\\Lab2.txt");
        FileInputStream in = null;
        in = new FileInputStream(file);
        Scanner scanner = new Scanner(in);
        while (scanner.hasNext()) {
            temp = scanner.nextLine();
        }
        in.close();
        list = makeList(temp.split(""));

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
