package com.company.javaRelearn.UofGWeek8;

public class Person {
    private int id;
    private String name;
    private int age;
    private String department;
    private int childrenNumber;
    private Person[] children = new Person[3];
    private Person[] moreChildren = new Person[69];
    private StringBuffer s = new StringBuffer();

    public Person() {}

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person(int id, String name, int age, String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public void addChildren(Person person) {
        childrenNumber++;
        if (childrenNumber < children.length) {
            for (int i = 0; i < children.length; i++) {
                if(children[i] == null) {
                    children[i] = person;
                    s.append("{Child ").append(childrenNumber).append(" Name: ").append(children[i].name).append(", Age: ").append(children[i].age).append("}");
                    break;
                }
            }
        } else {
            for (int i = 0; i < moreChildren.length; i++) {
                if (i < children.length) {
                    moreChildren[i] = children[i];
                }

                if(moreChildren[i] == null) {
                    moreChildren[i] = person;
                    s.append("{Child ").append(childrenNumber).append(" Name: ").append(moreChildren[i].name).append(", Age: ").append(moreChildren[i].age).append("}");
                    break;
                }
            }
        }


    }

    public void testPersonFunction() {
        System.out.println("this is a test for " + name);
    }

    public void testPersonFunction2() {
        System.out.println("this is a test for " + (age + 1));
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", childrenNumber=" + childrenNumber +
                ", children=" + s.toString() +
                '}';
    }
}
