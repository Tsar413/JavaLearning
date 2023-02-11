package com.company.javaRelearn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput_2023_2_11 {
    public static void main(String[] args) throws IOException{
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile_2023_2_11.read(
                                    "test1/src/com/company/javaRelearn/FormattedMemoryInput_2023_2_11.java").getBytes()));
            while (true) {
                System.out.print((char) in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of Stream");
        }
    }
}
