package com.company.javaRelearn;

import java.io.*;

public class Redirecting_2023_2_15 {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(
                new DataInputStream(new FileInputStream("test1/src/com/company/javaRelearn/Redirecting_2023_2_15.java")));
        PrintStream out = new PrintStream(
                new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
