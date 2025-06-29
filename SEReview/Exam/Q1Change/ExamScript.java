package com.company.javaRelearn.SEReview.Exam.Q1Change;

import java.sql.Time;

public class ExamScript {
//    public Student student; // Content Coupling
//    public String answer;
//    public Time timeTaken;

    private Student student; // Content Coupling
    private String answer;
    private Time timeTaken;

    public ExamScript(Student student, String answer, Time timeTaken) {
        this.student = student;
        this.answer = answer;
        this.timeTaken = timeTaken;
    }

    public Student getStudent() {
        return student;
    }

    public String getAnswer() {
        return answer;
    }

    public Time getTimeTaken() {
        return timeTaken;
    }
}
