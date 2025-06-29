package com.company.javaRelearn.SEReview.Exam.Q1Change;

public class Test {
    public void testExam() {
        Student student = new Student(11);
        Exam exam = new Exam("AA", new Date(2, 3, 2023));

        ReportGeneratorWithHTML r1 = new ReportGeneratorWithHTML("A");
        r1.print(exam);

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testExam();
    }
}
