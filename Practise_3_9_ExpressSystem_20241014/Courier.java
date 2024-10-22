package com.company.javaRelearn.Practise_3_9_ExpressSystem_20241014;

public class Courier {
    private int id;
    private double weight;

    public Courier() {
    }

    public Courier(int id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void beforeDelivery(){
        System.out.println("Weight " + this.weight);
        System.out.println(this.id + "No delivery");
    }

    public void onDelivery(Transport transport, GPS gps){
        System.out.println(transport.getResponsibilityPerson() + "driving"
                + transport.getId() + "is delivering");
        System.out.println(gps.locate());
        transport.delivery();
    }

    public void afterDelivery(Track track){
        System.out.println(this.id + "already delivery");
        System.out.println(track.delivery() + " has returned.");
        track.maintain();
    }
}
