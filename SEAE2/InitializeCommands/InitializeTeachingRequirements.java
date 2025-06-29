package com.company.javaRelearn.SEAE2.InitializeCommands;

import com.company.javaRelearn.SEAE2.BasicClasses.TeachingRequirements;

import java.util.ArrayList;
import java.util.List;

public class InitializeTeachingRequirements {
    public static List<TeachingRequirements> listForInitializeTeachingRequirements(String data) {
        List<TeachingRequirements> result = new ArrayList<TeachingRequirements>();
        String[] divideData1 = data.split("[|]");
        for (String s : divideData1) {
            result.add(initializeTeachingRequirements(s));
        }
        return result;
    }

    public static TeachingRequirements initializeTeachingRequirements(String data) {
        TeachingRequirements t = new TeachingRequirements();
        String[] temp = data.split(", ");
        for (int i = 0; i < temp.length; i++) {
            String[] temp1 = temp[i].split("=");
            switch (i) {
                case 0 -> t.setTeachingRequirementsId(Integer.parseInt(temp1[1]));
                case 1 -> t.setNumberRequired(Integer.parseInt(temp1[1]));
                case 2 -> t.setSubject(temp1[1]);
                case 3 -> t.setStartDate(temp1[1]);
                case 4 -> t.setEndDate(temp1[1]);
                case 5 -> t.setNameList(InitializePartTimeTeacher.initializePartTimeTeacherToTR(temp1[1]));
            }
        }
        return t;
    }

    public static Integer getMaxTRId(List<TeachingRequirements> data) {
        int result = -1;
        for (TeachingRequirements t : data) {
            result = Math.max(result, t.getTeachingRequirementsId());
        }
        return result;
    }

    public static String outputTeachingRequirementsList(List<TeachingRequirements> list) {
        String result = "";
        for (TeachingRequirements t : list) {
            result += t;
            result += "\n";
        }
        return result;
    }
}
