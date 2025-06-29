package com.company.javaRelearn.NIIT3.Week9;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class StudentInformation implements Serializable{
    private int id;
    private String name;
    private Map<String, Integer> grade;
    // 不被序列化的内容
    private transient String msg;

    public StudentInformation() {
    }

    public StudentInformation(int id, String name, String msg) {
        this.id = id;
        this.name = name;
        this.grade = new HashMap<String, Integer>();
        this.msg = msg;
    }

    public StudentInformation(int id, String name, Map<String, Integer> grade, String msg) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Integer> getGrade() {
        return grade;
    }

    public void setGrade(Map<String, Integer> grade) {
        this.grade = grade;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "StudentInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", msg='" + msg + '\'' +
                '}';
    }
}

class SerializationFunction{
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream out = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream inputStream = null;
        try {
            File file = new File("D:\\JavaProgram\\Java test\\test1\\src\\com\\company\\javaRelearn\\NIIT3\\Week9\\StudentInformation.txt");
            if (file.exists()){
                System.out.println("文件已存在");
            } else {
                file.createNewFile();
            }
            StudentInformation student1 = new StudentInformation();
            student1.setId(1);
            student1.setName("a");
            student1.setMsg("uv");
            // 序列化 第一步，创建一个输出流对象，它可以包装一个输出流对象，如：文件输出流
            fileOutputStream = new FileOutputStream(file);
            out = new ObjectOutputStream(fileOutputStream);
            // 序列化 第二步，通过输出流对象的 writeObject()方法写对象,从 java 输出到本地文件 out
            out.writeObject(student1);
            // 反序列化 第一步：创建文件输入流对象
            fileInputStream = new FileInputStream(file);
            inputStream = new ObjectInputStream(fileInputStream);
            // 反序列化 第二步：调用readObject()方法，本地文件读取数据，输入到程序当中
            System.out.println(inputStream.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                fileOutputStream.close();
                fileInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SerializationLearning {

}
