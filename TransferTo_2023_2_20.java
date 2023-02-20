package com.company.javaRelearn;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;

public class TransferTo_2023_2_20 {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("arguments: source");
            System.exit(1);
        }
        FileChannel in = new FileInputStream(args[0]).getChannel();
        FileChannel out = new FileInputStream(args[1]).getChannel();
        in.transferTo(0, in.size(), out);
    }
}
