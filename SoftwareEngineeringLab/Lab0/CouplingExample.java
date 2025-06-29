package com.company.javaRelearn.SoftwareEngineeringLab.Lab0;

class ContentCoupling {
    private String age;
    public String ageLived;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

public class CouplingExample {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.setAge("20");
        contentCoupling.ageLived = "20";
        System.out.println("age:"+contentCoupling.getAge());
        System.out.println("age:"+contentCoupling.ageLived);
    }
}
