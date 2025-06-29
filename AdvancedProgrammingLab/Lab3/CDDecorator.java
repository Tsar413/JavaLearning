package com.company.javaRelearn.AdvancedProgrammingLab.Lab3;

public class CDDecorator extends CarDecorator {
    protected Car car;

    public CDDecorator(Car car) {
        super(car);
        this.car = car;
    }

    @Override
    public Double getPrice() {
        return car.getPrice() + 150;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + CD Player";
    }
}
