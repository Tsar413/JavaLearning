package com.company.javaRelearn.UofGProgrammingExam.Exam2021;

public class Athlete implements Comparable {
    private String firstName;
    private String surname;
    private double firstTime;
    private double secondTime;
    private double averageTime;
    private Note note;

    public Athlete() {}

    public Athlete(String firstName, String surname, double firstTime, double secondTime, double averageTime) {
        super();
        this.firstName = firstName;
        this.surname = surname;
        this.firstTime = firstTime;
        this.secondTime = secondTime;
        this.averageTime = averageTime;
    }

    public Athlete(String firstName, String surname, double firstTime, double secondTime) {
        super();
        this.firstName = firstName;
        this.surname = surname;
        this.firstTime = firstTime;
        this.secondTime = secondTime;
        this.averageTime = calculateAverageTime(firstTime, secondTime);
    }

    public double calculateAverageTime(double firstTime, double secondTime) {
        double result = 0;
        result = (firstTime + secondTime) / 2;
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public double getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(double firstTime) {
        this.firstTime = firstTime;
    }

    public double getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(double secondTime) {
        this.secondTime = secondTime;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Athlete)) {
            return 0;
        } else {
            Athlete other = (Athlete) o;
//            System.out.println(other);
            String thisFirstName = String.valueOf(firstName.charAt(0));
            String otherFirstName = String.valueOf(other.firstName.charAt(0));
            int i = thisFirstName.compareTo(otherFirstName);

            String thisSecondName = String.valueOf(surname.charAt(0));
            String otherSecondName = String.valueOf(other.surname.charAt(0));
            int j = thisSecondName.compareTo(otherSecondName);

            if (this.averageTime > other.averageTime) {
                return 1;
            } else if ((this.averageTime == other.averageTime) && (j > 0)) {
                return 1;
            } else if((this.averageTime == other.averageTime) && (j == 0) && (i > 0)) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%3s| %10s  | %9s  |  %5s |  %5s |  %5s | %5s ",
                "" , firstName , surname , firstTime , secondTime , averageTime, note);
    }
}
