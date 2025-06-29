package com.company.javaRelearn.UofGProgrammingExam.Exam2020;

public class AwardedPoints {
    private int numberOfPoints;
    private String reasonForPoints;

    public AwardedPoints() {}

    public AwardedPoints(int numberOfPoints, String reasonForPoints) {
        this.numberOfPoints = numberOfPoints;
        this.reasonForPoints = reasonForPoints;
    }

    public AwardedPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
        this.reasonForPoints = "";
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public String getReasonForPoints() {
        return reasonForPoints;
    }

    public void setReasonForPoints(String reasonForPoints) {
        this.reasonForPoints = reasonForPoints;
    }

    @Override
    public String toString() {
        return "AwardedPoints{" +
                "numberOfPoints=" + numberOfPoints +
                ", reasonForPoints='" + reasonForPoints + '\'' +
                '}';
    }
}
