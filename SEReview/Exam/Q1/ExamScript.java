package com.company.javaRelearn.SEReview.Exam.Q1;

import java.sql.Time;

public class ExamScript {
    public Student student;
    public String answer;
    public Time timeTaken;

    public ExamScript(Student student, String answer, Time timeTaken) {
        this.student = student;
        this.answer = answer;
        this.timeTaken = timeTaken;
    }
}
