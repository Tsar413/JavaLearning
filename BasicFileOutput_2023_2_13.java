package com.company.javaRelearn;

import java.io.*;

public class BasicFileOutput_2023_2_13 {
    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile_2023_2_11.read("test1/src/com/company/javaRelearn/BasicFileOutput_2023_2_13.java")));

        PrintWriter out = new PrintWriter(
                new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile_2023_2_11.read(file));
    }
}
