package com.company.javaRelearn.SEReview.Lab.Lab2_1;

public class DoB {
    private int	dob_d, dob_m, dob_y;	// date of birth

    public DoB(int dob_day, int dob_month, int dob_year) {
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
