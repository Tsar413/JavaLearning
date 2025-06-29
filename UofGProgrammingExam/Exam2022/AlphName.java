package com.company.javaRelearn.UofGProgrammingExam.Exam2022;

class AlphName {
    public static void main(String[] args) {
        int n = 0;
        String Sname[] = {"Thomas", "Amaya", "Gustavo",
                "Melina", "Reirse", "Bell"};
        String temp;
        for (int i = 0; i < Sname.length; i++) {
            for (int k = 0; k < Sname.length; k++) {
                if (Sname[i].compareTo(Sname[k]) < 0) {
                    temp = Sname[i];
                    Sname[i] = Sname[k];
                    Sname[k] = temp;
                }
            }
        }
        System.out.println("Names in alphabetical order:");
        for (int i = 0; i < Sname.length; i++) {
            System.out.println(Sname[i]);
        }
    }
}
