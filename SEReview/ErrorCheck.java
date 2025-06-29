package com.company.javaRelearn.SEReview;

import java.io.*;
import java.util.Optional;

class ReadWrite {


    public static Optional<String> readFileWithOptional(String s) throws Exception {
        DataInputStream d = new DataInputStream(
                new BufferedInputStream(new FileInputStream(s)));
        Optional<String> result = null;
        Optional<String> s1 = null;
        while ((s1 = Optional.ofNullable(d.readLine())).isPresent()) {
            result = s1;
        }
        return result;
    }

    public static String readFile1(String s) {
        DataInputStream d = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            d = new DataInputStream(
                    new BufferedInputStream(new FileInputStream(s)));
            String s1 = "";
            while ((s1 = d.readLine()) != null) {
                stringBuilder.append(s1);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static String readFile(String s) throws IOException {
        DataInputStream d = new DataInputStream(
                new BufferedInputStream(new FileInputStream(s)));
        StringBuilder stringBuilder = new StringBuilder();
        String s1 = "";
        while ((s1 = d.readLine()) != null) {
            stringBuilder.append(s1);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}

class SizeException extends Exception {
    private int size;

    public SizeException(int size) {
        super("Size Too big");
        this.size = size;
    }

    public boolean judge(int num) throws SizeException {
        if (num > size) {
            throw new SizeException(num);
        } else {
            return true;
        }
    }
}

public class ErrorCheck {

}
