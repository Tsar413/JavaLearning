package com.company.javaRelearn.Person_2022_9_17;

public class Person {
//    public final String first;
//    public final String last;
//    public final String address;
    public String first;
    public String last;
    public String address;
    public Person() {

    }
    public Person(String first, String last, String address) {
        super();
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None","None","None");
        }

        @Override
        public String toString() {
            return "Null Person";
        }
    }

    public static final Person NULL = new NullPerson();
}
