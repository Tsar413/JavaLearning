package com.company.javaRelearn.SoftwareEngineeringLab.Lab3;

import java.io.PrintStream;

public class Lop {
    private	Person[] list;
    private	int	i, max;

    public	Lop() {
        max = 10;
        list = new Person[max];
        i = 0;
    }

    public void add(Person person)	{
        list[i++] = person;
    }

    public void remove(Person person) {
        int	j;
        for (j = 0; j < i; j++)
            if (list[j] == person)
                break;
        i--;
        for (; j < i; j++)
            list[j] = list[j+1];
    }

    public Person find(String personName)	{
        for (int j = 0; j < i; j++)
            if (list[j].getName().equals(personName))
                return list[j];
        return null;
    }

    public void	print(PrintStream ps) {
        for (int j = 0; j < i; j++)	{
            ps.print(String.format("name: %s", list[j].getName()));
            ps.print(String.format("   date of birth: %02d/%02d/%4d\n",
                    list[j].getDob().getDay(), list[j].getDob().getMonth(), list[j].getDob().getYear()));
        }
        ps.println();
    }
}
