package com.company.javaRelearn.SEAE2.InitializeCommands;

import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializePartTimeTeacher {
    public static List<PartTimeTeacher> initializePartTimeTeacherToTR(String data) {
        if (data.equals(" ")) {
            return null;
        } else {
            List<PartTimeTeacher> result = new ArrayList<PartTimeTeacher>();
            String[] temp = data.split(" ");
            for (String s : temp) {
                PartTimeTeacher t = new PartTimeTeacher();
                String[] temp1 = s.split(",");
                t.setId(Integer.parseInt(temp1[0]));
                t.setName(temp1[1]);
                result.add(t);
            }
            return result;
        }
    }

    public static List<PartTimeTeacher> listForInitializePartTimeTeacher(String data) {
        List<PartTimeTeacher> result = new ArrayList<PartTimeTeacher>();
        String[] divideData1 = data.split("[|]");
        for (String s : divideData1) {
            result.add(initializePartTimeTeacher(s));
        }
        return result;
    }

    public static PartTimeTeacher initializePartTimeTeacher(String data) {
        PartTimeTeacher result = new PartTimeTeacher();
        String[] dataSplit1 = data.split(", ");
        for (int i = 0; i < dataSplit1.length; i++) {
            String[] dataSplit2 = dataSplit1[i].split("=");
            switch (i) {
                case 0 -> result.setId(Integer.valueOf(dataSplit2[1]));
                case 1 -> result.setName(dataSplit2[1]);
                case 2 -> result.setSubject(dataSplit2[1]);
                case 3 -> {
                    String[] dataSplit3 = dataSplit2[1].split(",");
                    List<String> month = new ArrayList<String>(Arrays.asList(dataSplit3));
                    result.setAvailableMonths(month);
                }
            }
        }
        return result;
    }

    public static String outputPartTimeTeacherList(List<PartTimeTeacher> list) {
        String result = "";
        for (PartTimeTeacher p : list) {
            result += p;
            result += "\n";
        }
        return result;
    }
}
