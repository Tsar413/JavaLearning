package com.company.javaRelearn.UofGProgrammingExam.Exam2020;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Student First Name");
        String firstName = scanner.nextLine();
        System.out.println("Input Student Second Name");
        String secondName = scanner.nextLine();
        System.out.println("Input Student numberOfPoints");
        Integer numberOfPoints = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Student reasonForPoints");
        String reasonForPoints = scanner.nextLine();

        AwardedPoints awardedPoint = new AwardedPoints(numberOfPoints,reasonForPoints);
        AwardedPoints[] awardedPoints = new AwardedPoints[100];
        Pupil pupil = new Pupil(firstName,secondName);

        ReadFiles readFiles = new ReadFiles();

        Pupil[] pupils = readFiles.getPupils();
        pupils = Pupil.add(pupils,pupil,awardedPoint);

        Arrays.sort(pupils);
        for (Pupil p : pupils) {
            System.out.println(p);
        }
    }
}
