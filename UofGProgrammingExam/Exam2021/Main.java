package com.company.javaRelearn.UofGProgrammingExam.Exam2021;

public class Main {
    public static void main(String[] args) {
        Table table = new Table();
        Note note = new Concession(39);
        Note note1 = new Concession(47);
        Note note2 = new Conduct();


        Athlete athlete1 = new Athlete();
        Athlete athlete2 = new Athlete();
        Athlete athlete3 = new Athlete();

        double number = Math.abs(Double.parseDouble(note.getMessage()));
        double number1 = Math.abs(Double.parseDouble(note1.getMessage()));
        athlete1 = new Athlete("Charley","Black",Conversion.convertTimeToSeconds("02:54") + number,
                Conversion.convertTimeToSeconds("03:59"));
        athlete1.setNote(note);
        athlete2 = new Athlete("Anita","Case",Conversion.convertTimeToSeconds("03:12") + number1,
                Conversion.convertTimeToSeconds("04:14"));
        athlete2.setNote(note1);
        table.addRunners(athlete1);
        table.addRunners(athlete2);

        athlete3 = new Athlete("Ashley","Morgan",Conversion.convertTimeToSeconds("04:19"),
                Conversion.convertTimeToSeconds("04:32"));
        athlete3.setNote(note2);
        table.addDisqualifiedRunners(athlete3);
        table.modificationOrder();
        System.out.println(table);


    }
}
