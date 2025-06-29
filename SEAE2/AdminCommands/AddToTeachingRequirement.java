package com.company.javaRelearn.SEAE2.AdminCommands;

import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;
import com.company.javaRelearn.SEAE2.BasicClasses.TeachingRequirements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AddToTeachingRequirement {
    public static void addToTeachingRequirement(
            List<PartTimeTeacher> dataPTT, List<PartTimeTeacher> dataFreePTT,
            List<TeachingRequirements> dataTR, TeachingRequirements tr) {
        boolean change = false;
        int index = dataTR.indexOf(tr);
        tr.setNameList(dataFreePTT);
        dataTR.set(index, tr);

        int startDate = Integer.parseInt(tr.getStartDate());
        int endDate = Integer.parseInt(tr.getEndDate());
        for (int i = 0; i < dataFreePTT.size(); i++) {
            for (int j = startDate; j <= endDate; j++) {
                dataFreePTT.get(i).setUnavailableMonths(String.valueOf(j));
            }
        }
        for (int i = 0; i < dataPTT.size(); i++) {
            for (int j = 0; j < dataFreePTT.size(); j++) {
                if (dataPTT.get(i).getId().equals(dataFreePTT.get(j).getId())) {
                    dataPTT.set(i, dataFreePTT.get(j));
                    change = true;
                }
            }
        }
        if (change) {
            System.out.println("Add Success");
        } else {
            System.out.println("Add Failure");
        }
    }

    public static List<PartTimeTeacher> pickPTT(List<PartTimeTeacher> data, TeachingRequirements tr) throws IOException {
        List<PartTimeTeacher> result = new ArrayList<PartTimeTeacher>();
        int index = 1;
        System.out.println("符合条件的教师清单：");
        for (PartTimeTeacher t : data) {
            System.out.print(t.getId() + ": " + t.getName() + ", ");
        }
        System.out.println("挑选人员：");
        while (index <= tr.getNumberRequired()) {
            System.out.println("输入人员编号，第" + index + "位");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            String idString = in.readLine();
            int idInt = Integer.parseInt(idString);
            for (PartTimeTeacher datum : data) {
                if (datum.getId().equals(idInt)) {
                    result.add(datum);
                }
            }
            if (idString.equals("0")) {
                System.out.println("退出添加");
                break;
            }
            index++;
        }
        return result;
    }

    //1. 显示需要添加的TR
    //2. 选择需要添加的TR
    //3. 自动筛选人选
    //4. 手动添加人员
    public static void addToSuitableTR(List<TeachingRequirements> trData, List<PartTimeTeacher> pttData) throws IOException {
        List<PartTimeTeacher> list3 = new ArrayList<PartTimeTeacher>();
        TeachingRequirements trNeedToAdd = new TeachingRequirements();
        List<TeachingRequirements> emptyTR = Selection.selectEmptyTR(trData);
        System.out.println("没人的教学请求：");
        for (TeachingRequirements t : emptyTR) {
            System.out.println(t);
        }

        System.out.println("输入教学请求的编号");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        String idString = in.readLine();
        int idInt = Integer.parseInt(idString);
        for (TeachingRequirements datum : trData) {
            if (datum.getTeachingRequirementsId() == idInt) {
                trNeedToAdd = datum;
                break;
            }
        }

        list3 = Selection.selectFreePTT(pttData, trNeedToAdd);
        System.out.println(list3);

        List<PartTimeTeacher> pickedFreePTT = pickPTT(list3,trNeedToAdd);

        AddToTeachingRequirement.addToTeachingRequirement(pttData,pickedFreePTT,trData,trNeedToAdd);
    }
}
