package com.company.javaRelearn.NIIT3.Week8;

import java.io.*;

class FileInputStreamLearning {
    public void fileInputStream() throws IOException {
        File file = new File("D:\\JavaProgram\\Java test\\test1\\src\\com\\company\\javaRelearn\\NIIT3\\Week8\\FileInputStream.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int data;
        while ((data = fileInputStream.read()) != -1) {
            System.out.print((char) data);
        }
    }

    public static void main(String[] args) {
        try {
            new FileInputStreamLearning().fileInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class BufferedInputStreamLearning {
    public void bufferedInputStreamLearning() throws IOException {
        File file = new File("D:\\JavaProgram\\Java test\\test1\\src\\com\\company\\javaRelearn\\NIIT3\\Week8\\FileInputStream.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fileInputStream);
        int byteData;
        while ((byteData = bis.read()) != -1) {
            System.out.print((char) byteData);
        }

    }

    public static void main(String[] args) {
        try {
            new BufferedInputStreamLearning().bufferedInputStreamLearning();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class OutputStream{
    public void fileOutputStream(){
        // 定义文件路径
        String filePath = "D:\\JavaProgram\\Java test\\test1\\src\\com\\company\\javaRelearn\\NIIT3\\Week8\\Output.txt";
        // 创建FileOutputStream对象
        FileOutputStream fos = null;
        try {
            // 创建FileOutputStream对象，不追加数据
            fos = new FileOutputStream(filePath);
            // 要写入的字符串
            String content = "Hello, World!";
            // 将字符串转换为字节数组
            byte[] bytes = content.getBytes();
            // 将字节数组写入文件
            fos.write(bytes);
            // 输出提示信息
            System.out.println("文件已写入：" + filePath);
        } catch (IOException e) {
            // 异常处理
            e.printStackTrace();
        } finally {
            // 关闭文件输出流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new OutputStream().fileOutputStream();
    }
}

public class InputStreamLearning {
}
