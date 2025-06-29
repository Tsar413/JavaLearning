package com.company.javaRelearn.UofGProgrammingExam.Exam2020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFiles {
    private Pupil[] pupils;
    private List<Pupil> pupilList;

    public ReadFiles() throws FileNotFoundException {
        File file = new File("C:\\Users\\xiaol\\Java test\\test1\\src\\com\\company\\javaRelearn\\UofGProgrammingExam\\Exam2020\\Pupils.txt");
        FileInputStream fileInputStream = null;
        fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);
        pupilList = new ArrayList<Pupil>();
        while (scanner.hasNext()) {
            String temp = scanner.nextLine();
            String[] temps = temp.split(" ");
            String firstName = temps[0];
            String secondName = temps[1];
            String reasonForPoints = temps[2];
            Integer numberOfPoints = Integer.parseInt(temps[3]);

            AwardedPoints awardedPoint = new AwardedPoints(numberOfPoints,reasonForPoints);
            Pupil pupil = new Pupil(firstName,secondName,numberOfPoints,reasonForPoints);

            int result = -1;
            for (int i = 0; i < pupilList.size(); i++) {
                if ((pupilList.get(i).getFirstName().equals(firstName))&&(pupilList.get(i).getSecondName().equals(secondName))) {
                    result = i;
                }
            }
            if (result != -1) {
                int emptyResult = 0;
                AwardedPoints[] tempAwardedPoints = pupilList.get(result).getAwardedPoints();
                for (int i = 0; i < tempAwardedPoints.length; i++) {
                    if (tempAwardedPoints[i] != null) {
                        emptyResult = i;
                    }
                }
                tempAwardedPoints[emptyResult] = awardedPoint;
                pupilList.get(result).setAwardedPoints(tempAwardedPoints);
            } else {
                AwardedPoints[] tempAwardedPoints = new AwardedPoints[100];
                tempAwardedPoints[0] = awardedPoint;
                Pupil pupil1 = new Pupil(firstName,secondName,tempAwardedPoints);
                pupilList.add(pupil1);
            }
        }
        pupils = new Pupil[pupilList.size()];
        pupilList.toArray(pupils);
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public static void overWriteFiles() {

    }
}
