package com.company.javaRelearn;

import java.io.*;

public class TestEOF_2023_2_13 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("test1/src/com/company/javaRelearn/TestEOF_2023_2_13.java")));
        while (in.available() != 0) {
            System.out.print((char) in.readByte());
        }
    }
}
