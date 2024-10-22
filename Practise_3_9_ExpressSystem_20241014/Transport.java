package com.company.javaRelearn.Practise_3_9_ExpressSystem_20241014;

public abstract class Transport {
    private int id;
    private String type;
    private String responsibilityPerson;

    public Transport() {
    }

    public Transport(int id, String type, String responsibilityPerson) {
        this.id = id;
        this.type = type;
        this.responsibilityPerson = responsibilityPerson;
    }

    public abstract String delivery();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResponsibilityPerson() {
        return responsibilityPerson;
    }

    public void setResponsibilityPerson(String responsibilityPerson) {
        this.responsibilityPerson = responsibilityPerson;
    }
}
