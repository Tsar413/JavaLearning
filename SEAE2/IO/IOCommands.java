package com.company.javaRelearn.SEAE2.IO;

import java.io.*;

public class IOCommands {
    public static String readFromFile(File file) throws Exception {
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(new FileInputStream(file)));
        String s;
        String result = "";
        while ((s = in.readLine()) != null) {
            s = s.split("[{]")[1];
            s = s.split("[}]")[0];
            result += s;
            result += "|";
        }
        System.out.println(result);
        return result;
    }

    public static void writeToFile(String content, File file) throws Exception {
        PrintWriter out = new PrintWriter(file);
        out.write(content);
        out.flush();
        out.close();
    }
}
