package com.company.javaRelearn.UofGWeek5;

import java.io.*;

public class Lab23 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGWeek5\\backwards.txt");
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(file);
        FileReader reader = new FileReader(file);
        char[] temp = new char[(int) file.length()];
        char[] result = new char[(int) file.length()];
        String finalResult = "";

        System.out.println(reader.read(temp));

        for (int i = 0; i < temp.length; i++) {
            result[i] = temp[temp.length - 1 - i];
        }
        for (char c : result) {
            finalResult += c;
        }
        System.out.println(finalResult);

        File file1 = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGWeek5\\forwards.txt");
        FileWriter writer = new FileWriter(file1);
        writer.write(finalResult);
        writer.flush(); //缓冲
        fileInputStream.close();
        writer.close();
    }
}
