package com.company.javaRelearn.NIIT3.Week5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeBook {
    private Integer employeeId;

    private String employeeName;

    private String department;

    private String position;

    private Date entryDate;

    private Date birth;

    private String weddingSituation;

    private Date weddingDate;

    public EmployeeBook() {
    }

    public EmployeeBook(Integer employeeId, String employeeName, String department, String position, Date entryDate, Date birth, String weddingSituation, Date weddingDate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.position = position;
        this.entryDate = entryDate;
        this.birth = birth;
        this.weddingSituation = weddingSituation;
        this.weddingDate = weddingDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getWeddingSituation() {
        return weddingSituation;
    }

    public void setWeddingSituation(String weddingSituation) {
        this.weddingSituation = weddingSituation;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "EmployeeBook{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", entryDate=" + simpleDateFormat.format(entryDate) +
                ", birth=" + simpleDateFormat.format(birth) +
                ", weddingSituation='" + weddingSituation + '\'' +
                ", weddingDate=" + simpleDateFormat.format(weddingDate) +
                '}';
    }

    public String toString1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return "EmployeeBook{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", entryDate=" + simpleDateFormat.format(entryDate) +
                ", birth=" + simpleDateFormat.format(birth) +
                ", weddingSituation='" + weddingSituation + '\'' +
                '}';
    }
}
