package com.company.javaRelearn.SEReview.Lab.Lab0.Lab0_2_1;

public class CouplingExample {
    public static void main(String[] args) {
        ContentCoupling contentCoupling = new ContentCoupling();
        contentCoupling.setAge("20");
        System.out.println("age:" + contentCoupling.getAge());
    }
}

class ContentCoupling {
//    public int age;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
