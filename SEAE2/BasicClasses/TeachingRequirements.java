package com.company.javaRelearn.SEAE2.BasicClasses;

import com.company.javaRelearn.SEAE2.BasicClasses.PartTimeTeacher;

import java.util.ArrayList;
import java.util.List;

public class TeachingRequirements {
    private int teachingRequirementsId;
    private String subject; //科目
    private int numberRequired; //需求人数
    private List<PartTimeTeacher> nameList;
    private String startDate;
    private String endDate;

    public TeachingRequirements() {

    }

    public TeachingRequirements(int teachingRequirementsId, String subject, int numberRequired, List<PartTimeTeacher> nameList, String startDate, String endDate) {
        this.teachingRequirementsId = teachingRequirementsId;
        this.subject = subject;
        this.numberRequired = numberRequired;
        this.nameList = nameList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TeachingRequirements(String subject, int numberRequired, String startDate, String endDate) {
        this.teachingRequirementsId = 0;
        this.subject = subject;
        this.numberRequired = numberRequired;
        this.nameList = new ArrayList<PartTimeTeacher>();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTeachingRequirementsId() {
        return teachingRequirementsId;
    }
    public void setTeachingRequirementsId(int teachingRequirementsId) {
        this.teachingRequirementsId = teachingRequirementsId;
    }

    public List<PartTimeTeacher> getNameList() {
        return nameList;
    }
    public void setNameList(List<PartTimeTeacher> nameList) {
        this.nameList = nameList;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberRequired() {
        return numberRequired;
    }
    public void setNumberRequired(int numberRequired) {
        this.numberRequired = numberRequired;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    //输出和存储Teaching Requirements的方法
    public String printTeacherNameList() {
        StringBuilder s = new StringBuilder();
        if (nameList == null || nameList.isEmpty()) {
            s.append(" ");
        } else {
            for (int i = 0; i < nameList.size(); i++) {
                s.append(nameList.get(i).getId());
                s.append(",");
                s.append(nameList.get(i).getName());
                s.append(" ");
            }
        }
        return s.toString();
    }

    @Override
    public String toString() {
        return "TeachingRequirements{" +
                "teachingRequirementsId=" + teachingRequirementsId +
                ", numberRequired=" + numberRequired +
                ", subject=" + subject +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", nameList=" + printTeacherNameList() +
                '}';
    }

//    public static void main(String[] args) {
//        PartTimeTeacher p1 = new PartTimeTeacher(1,"aa");
//        PartTimeTeacher p2 = new PartTimeTeacher(2,"bb");
//        List<PartTimeTeacher> list = Arrays.asList(p1,p2);
//        TeachingRequirements t1 = new TeachingRequirements(1,"Math",2,list,"2","3");
//        TeachingRequirements t2 = new TeachingRequirements("CS",2,"5","7");
//        System.out.println(t1);
//        System.out.println(t2);
//    }
}
