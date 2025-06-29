package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class AlloyDecorator extends CarDecorator {
    protected Car car;

    public AlloyDecorator(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    public Double getPrice() {
        return car.getPrice() + 250;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + Alloys";
    }
}
