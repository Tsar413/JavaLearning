package com.company.javaRelearn.Practise_3_9_ExpressSystem_20241014;

public class Track extends Transport implements Maintain {

    public Track() {
    }

    public Track(int id, String type, String responsibilityPerson) {
        super(id, type, responsibilityPerson);
    }

    @Override
    public void maintain() {
        System.out.println(super.getType() + " Already");
    }

    @Override
    public String delivery() {
        return super.getResponsibilityPerson() + " drive with  " + super.getType();
    }
}
