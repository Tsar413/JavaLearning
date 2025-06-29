package com.company.javaRelearn.SEAE2.AdminCommands;

import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;
import com.company.javaRelearn.SEAE2.BasicClasses.TeachingRequirements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Selection {
    public static List<TeachingRequirements> selectEmptyTR(List<TeachingRequirements> data) {
        List<TeachingRequirements> result = new ArrayList<TeachingRequirements>();
        for (TeachingRequirements t : data) {
            if (t.getNameList() == null || t.getNameList().isEmpty()) {
                result.add(t);
            }
        }
        return result;
    }

    public static List<PartTimeTeacher> selectFreePTT(List<PartTimeTeacher> data, TeachingRequirements tr) {
        List<PartTimeTeacher> result = new ArrayList<PartTimeTeacher>();
        for (PartTimeTeacher teacher : data) {
            boolean judge = judgeAvailableDate(teacher, tr);
            if (teacher.getSubject().equals(tr.getSubject()) && judge) {
                result.add(teacher);
            }
        }
        return result;
    }

    public static boolean judgeAvailableDate(PartTimeTeacher teacher, TeachingRequirements tr) {
        boolean result = true;
        int startDate = Integer.parseInt(tr.getStartDate());
        int endDate = Integer.parseInt(tr.getEndDate());
        Set<String> set = new HashSet<String>(teacher.getAvailableMonths());
        for (int i = startDate; i <= endDate; i++) {
            if (set.add(String.valueOf(i))) {
                result = false;
            }
        }
        return result;
    }
}
