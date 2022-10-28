package com.company.javaRelearn.Person_2022_9_17;

public class Position {
    private String title;
    private Person person;
    public Position() {

    }
    public Position(String title, Person employee) {
        super();
        this.title = title;
        this.person = employee;
        if (person == null)
            person = Person.NULL;
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person newPerson) {
        this.person = newPerson;
        if (person == null)
            person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}
