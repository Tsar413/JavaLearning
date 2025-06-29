package com.company.javaRelearn.SEAE2;

import com.company.javaRelearn.SEAE2.AdminCommands.AddToTeachingRequirement;
import com.company.javaRelearn.SEAE2.AdminCommands.Selection;
import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;
import com.company.javaRelearn.SEAE2.BasicClasses.TeachingRequirements;
import com.company.javaRelearn.SEAE2.ClassDirectorCommands.AddNewTeachingRequirements;
import com.company.javaRelearn.SEAE2.IO.IOCommands;
import com.company.javaRelearn.SEAE2.InitializeCommands.InitializePartTimeTeacher;
import com.company.javaRelearn.SEAE2.InitializeCommands.InitializeTeachingRequirements;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        File file1 = new File("test1\\src\\com\\company\\javaRelearn\\SEAE2\\TeachingRequirements.txt");
        File file2 = new File("test1\\src\\com\\company\\javaRelearn\\SEAE2\\PartTimeTeacher.txt");
        String result1 = IOCommands.readFromFile(file1);
        String result2 = IOCommands.readFromFile(file2);

        /*
        * TeachingRequirements{teachingRequirementsId=1, numberRequired=5, subject=Math, startDate=2, endDate=3, nameList=1,aa 2,bb }
        * TeachingRequirements{teachingRequirementsId=2, numberRequired=10, subject=CS, startDate=5, endDate=7, nameList= }
        * PartTimeTeacher{id=1, name=aa, subject=CS, availableMonths=1,2,3,4,5,6,7,8,9,10,11,12}
        * PartTimeTeacher{id=2, name=bb, subject=CS, availableMonths=1,2,3,4,5,6,7,8,9,10,11,12}
        * */

        List<TeachingRequirements> list1 = InitializeTeachingRequirements.listForInitializeTeachingRequirements(result1);
        for (TeachingRequirements t : list1) {
            System.out.println(t);
        }
        List<PartTimeTeacher> list2 = InitializePartTimeTeacher.listForInitializePartTimeTeacher(result2);
        for (PartTimeTeacher t : list2) {
            System.out.println(t);
        }

//        List<PartTimeTeacher> list3 = new ArrayList<PartTimeTeacher>();
//        List<TeachingRequirements> emptyTR = Selection.selectEmptyTR(list1);
//        for (TeachingRequirements t : emptyTR) {
////            System.out.println(t);
//            list3 = Selection.selectFreePTT(list2,t);
//            System.out.println(list3);
//        }
//
//        AddToTeachingRequirement.addToTeachingRequirement(list2,list3,list1, emptyTR.get(2));
        AddToTeachingRequirement.addToSuitableTR(list1,list2);

        for (TeachingRequirements t : list1) {
            System.out.println(t);
        }
        for (PartTimeTeacher t : list2) {
            System.out.println(t);
        }

//        AddNewTeachingRequirements.addNewTRFProcess(list1);
//        for (TeachingRequirements t : list1) {
//            System.out.println(t);
//        }
//
//        String s1 = InitializeTeachingRequirements.outputTeachingRequirementsList(list1);
//        String s2 = InitializePartTimeTeacher.outputPartTimeTeacherList(list2);
//
//        IOCommands.writeToFile(s1,file1);
//        IOCommands.writeToFile(s2,file2);

    }
}
