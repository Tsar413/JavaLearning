package com.company.javaRelearn.UofGProgrammingExam.Exam2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Table {
    private ArrayList<Athlete> runners = new ArrayList<Athlete>();
    private List<Athlete> disqualifiedRunners  = new ArrayList<Athlete>();
    private String header =
    String.format("%3s | %10s | %10s | %5s | %5s | %5s ",
            " Pos " , " FirstName " , " LastName " , " Lap1 " , " Lap2 " , "Avg");
    public Table() {

    }

    public void addRunners(Athlete athlete) {
        runners.add(athlete);
    }

    public void addDisqualifiedRunners(Athlete athlete) {
        disqualifiedRunners.add(athlete);
    }

    public void modificationOrder() {
        Collections.sort(runners);
    }

    @Override
    public String toString() {
        String output = "";
        output += header;
        output += "\n";
        for (int i = 0; i < runners.size(); i++) {
            output += "  ";
            output += (i+1);
            output += runners.get(i);
            output += "\n";
        }
        output += "--Disqualifications--\n";
        for (int i = 0; i < disqualifiedRunners.size(); i++) {
            output += disqualifiedRunners.get(i).getFirstName();
            output += " ";
            output += disqualifiedRunners.get(i).getSurname();
            output += " disqualified";
            output += "\n";
        }
        return output;
    }
}
