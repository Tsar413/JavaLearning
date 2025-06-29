package com.company.javaRelearn.SoftwareEngineeringLab.Lab3;

public class Main1 {
    public static void main(String[] args)	{
        Date date1 = new Date(25,9,2021);
        Date date2 = new Date(6,9,2022);

        date1.print(System.err, date2); System.err.print("\n");

        Person person1 = new Person("John",new Date(23,01,1996));
        person1.print(System.err, person1); System.err.print("\n");

        Date currentDate = new Date(13,02,2022);
        System.out.println("Age:" + person1.getAge(currentDate));

        Lop listOfPeople = new Lop();
        listOfPeople.add(person1);

        Person person2 = new Person("Jane",new Date(17,11,1969));
        Person person3 = new Person("David",new Date(21,5,1978));
        Person person4 = new Person("Mary",new Date(15,3, 1978));

        listOfPeople.add(person2);
        listOfPeople.add(person3);
        listOfPeople.add(person4);
        listOfPeople.print(System.err); System.err.print("\n");

        listOfPeople.remove(person2);
        listOfPeople.print(System.err); System.err.print("\n");

        Person p1 = listOfPeople.find("Jane");
        try {
            p1.print(System.err,p1); System.err.print("\n");}
        catch (Exception e) {
            System.out.println("Person with the specified name is not in the list\n");
        }


        Person p2 = listOfPeople.find("David");
        try {
            p2.print(System.err,p2); System.err.print("\n");}
        catch (Exception e) {
            System.out.println("Person with the specified name is not in the list\n");
        }

        listOfPeople.remove(person1);
        listOfPeople.print(System.err); System.err.print("\n");

    }
}
