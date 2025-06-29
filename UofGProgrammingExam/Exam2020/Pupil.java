package com.company.javaRelearn.UofGProgrammingExam.Exam2020;

import java.util.Arrays;

public class Pupil implements Comparable {
    private String firstName;
    private String secondName;
    private Integer numberOfPoints;
    private String reasonForPoints;
    private AwardedPoints[] awardedPoints = new AwardedPoints[100];

    public Pupil() {}

    public Pupil(String firstName, String secondName, Integer numberOfPoints, String reasonForPoints) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.numberOfPoints = numberOfPoints;
        this.reasonForPoints = reasonForPoints;
    }

    public Pupil(String firstName, String secondName, AwardedPoints[] awardedPoints) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.awardedPoints = awardedPoints;
    }

    public Pupil(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.numberOfPoints = 0;
        this.reasonForPoints = "";
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }
    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public String getReasonForPoints() {
        return reasonForPoints;
    }
    public void setReasonForPoints(String reasonForPoints) {
        this.reasonForPoints = reasonForPoints;
    }

    public AwardedPoints[] getAwardedPoints() {
        return awardedPoints;
    }
    public void setAwardedPoints(AwardedPoints[] awardedPoints) {
        this.awardedPoints = awardedPoints;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Pupil)) {
            return false;
        } else {
            Pupil other = (Pupil) o;
            if ((this.firstName.equals(other.firstName))&&(this.secondName.equals(other.secondName))) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static Pupil[] add(Pupil[] pupils, Pupil pupil, AwardedPoints awardedPoints) {
        int result = -1;
        for (int i = 0; i < pupils.length; i++) {
            if (pupils[i].equals(pupil)) {
                result = i;
            }
        }
        if (result != -1) {
            int n = 0;
            for (int i = 0; i < pupils[result].awardedPoints.length; i++) {
                if (pupils[result].awardedPoints[i] == null) {
                    n = i;
                    break;
                }
            }
            System.out.println(n);
            pupils[result].awardedPoints[n]= awardedPoints;

            return pupils;
        } else {
            AwardedPoints[] awardedPoints1 = new AwardedPoints[100];
            Pupil[] newPupils = new Pupil[pupils.length + 1];
            Pupil newPupil = new Pupil(pupil.firstName, pupil.secondName, awardedPoints1);
            awardedPoints1[0] = awardedPoints;
            newPupils[newPupils.length - 1] = newPupil;
            for (int i = 0; i < pupils.length; i++) {
                newPupils[i] = pupils[i];
            }
            return newPupils;
        }
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Pupil)) {
            return 0;
        } else {
            Pupil other = (Pupil) o;
            int score1 = 0;
            int score2 = 0;
            for (int i = 0; i < this.awardedPoints.length; i++) {
                if (awardedPoints[i] != null) {
                    score1 += awardedPoints[i].getNumberOfPoints();
                } else {
                    break;
                }
            }
            for (int i = 0; i < other.awardedPoints.length; i++) {
                if (other.awardedPoints[i] != null) {
                    score2 += other.awardedPoints[i].getNumberOfPoints();
                } else {
                    break;
                }
            }
            if (score1 < score2) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", awardedPoints=" + Arrays.toString(awardedPoints) +
                '}';
    }
}
