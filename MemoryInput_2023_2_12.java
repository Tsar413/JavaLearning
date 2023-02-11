package com.company.javaRelearn;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput_2023_2_12 {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile_2023_2_11.read("test1/src/com/company/javaRelearn/MemoryInput_2023_2_12.java"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
