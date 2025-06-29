package com.company.javaRelearn.SoftwareEngineeringLab.Lab1;

public class dob {
    private int	dob_d, dob_m, dob_y;	// date of birth

    public dob(int dob_day, int dob_month, int dob_year) {
        dob_d = dob_day;
        dob_m = dob_month;
        dob_y = dob_year;
    }

    public int get_dob_day() {
        return this.dob_d;
    }

    public int get_dob_month() {
        return this.dob_m;
    }

    public int get_dob_year() {
        return this.dob_y;
    }
}
