package com.company.javaRelearn;

class Villain {
    private String name;
    protected void set(String nm) {
        this.name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Orc_2022_6_20 extends Villain {
    private int orcNumber;
    public Orc_2022_6_20(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc_2022_6_20{" +
                "orcNumber=" + orcNumber +
                '}';
    }

    public static void main(String[] args) {
        Orc_2022_6_20 orc = new Orc_2022_6_20("Limburger",12);
        System.out.println(orc);
        orc.change("Bob",19);
        System.out.println(orc);
    }
}
