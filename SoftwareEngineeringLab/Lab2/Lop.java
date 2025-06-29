package com.company.javaRelearn.SoftwareEngineeringLab.Lab2;

public class Lop {
    private Person[] persons;

    public Lop() {
        this.persons = new Person[100];
    }

    public int getSize() {
        return persons.length;
    }

    public void add(Person person) {
        int i = 0;
        while (persons[i] != null) {
            i++;
        }
        if (i == persons.length) {
            System.err.println("OverFlow");
        } else {
            persons[i++] = person;
        }
    }

    public Person delete(Person person) {
        int i = 0;
        int index = -1;
        while (persons[i] != null) {
            if (persons[i].getName().equals(person.getName())) {
                index = i;
                break;
            }
            i++;
        }

        if (index == -1) {
            return null;
        } else {
            Person deletePerson = persons[index];
            for (int j = index; j < persons.length - 1; j++) {
                persons[j] = persons[j + 1];
            }
            persons[persons.length - 1] = null;
            return deletePerson;
        }
    }

    public Person find(String name) {
        int i = 0;
        int index = -1;
        while (persons[i] != null) {
            if (persons[i].getName().equals(name)) {
                index = i;
                break;
            }
            i++;
        }
        if (index == -1) {
            return null;
        } else {
            Person result = persons[index];
            return result;
        }
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (persons[i] != null) {
            s.append(persons[i].print(System.out));
            i++;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Lop lop = new Lop();
        Date date = new Date(1,1,2010);
        Person person = new Person("yaya",date);
        Person person1 = new Person("Light",date);
        lop.add(person);
        lop.add(person1);
        System.out.println(lop.find("Light"));

        lop.print();
        lop.delete(person1);
        lop.print();
    }
}
