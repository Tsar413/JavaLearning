package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class LuxuryCar extends Car {
    public LuxuryCar() {
    }

    @Override
    public Double getPrice() {
        return 50000.0;
    }

    @Override
    public String getDescription() {
        return "a shinier, faster car than the basic one";
    }
}
