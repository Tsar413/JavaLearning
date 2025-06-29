package com.company.javaRelearn.SEAE2.ClassDirectorCommands;

import com.company.javaRelearn.SEAE2.BasicClasses.TeachingRequirements;
import com.company.javaRelearn.SEAE2.InitializeCommands.InitializeTeachingRequirements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class AddNewTeachingRequirements {
    public static List<TeachingRequirements> addNewTRFProcess(List<TeachingRequirements> data) throws IOException {
        TeachingRequirements newTR = newTR();
        newTRList(data, newTR);
        return data;
    }

    public static TeachingRequirements newTR() throws IOException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("输入TR Subject");
        String subject = in.readLine();
        System.out.println("输入人数需求");
        int numberRequired = Integer.parseInt(in.readLine());
        System.out.println("输入开始时间");
        String startDate = in.readLine();
        System.out.println("输入结束时间");
        String endDate = in.readLine();
        TeachingRequirements t = new TeachingRequirements(subject, numberRequired, startDate, endDate);
        System.out.println(t);
        return t;
    }

    public static List<TeachingRequirements> newTRList(List<TeachingRequirements> data, TeachingRequirements newTRSmall) {
        int newTRId = InitializeTeachingRequirements.getMaxTRId(data) + 1;
        newTRSmall.setTeachingRequirementsId(newTRId);
        data.add(newTRSmall);
        return data;
    }
}