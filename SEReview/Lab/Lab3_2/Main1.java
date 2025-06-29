package com.company.javaRelearn.SEReview.Lab.Lab3_2;

public class Main1 {
    public static void main(String[] args) {

        // date stuff
        Date d = new Date(7, 2, 1993);
        System.err.println("" + d.getDay() + ":" + d.getMonth() + ":" + d.getYear());
        d.print(System.err);
        System.err.println();
        System.err.println("dif1: " + d.diffInYears(new Date(6, 12, 2005)));
        System.err.println("dif2: " + d.diffInYears(new Date(17, 3, 2015)));
        System.err.println("dif3: " + d.diffInYears(new Date(28, 4, 2018)));

        // Person stuff
        Person p = new Person("Ron", new Date(17, 8, 1963));
        p.print(System.err);
        System.err.println("  Age=" + p.getAge(new Date(14, 2, 2021)));

        // LoP stuff
        LoP lop = new LoP();
        lop.add(p);
        lop.add(new Person("Maura", new Date(6, 2, 1983)));
        lop.print(System.err);
        System.err.println();
        lop.remove(p);
        lop.print(System.err);

        // clone stuff
        String name = "David";
        Date dob = new Date(8, 8, 1998);
        Person david = new Person(name, dob);
        System.err.println();
        david.print(System.err);
        System.err.println();
        dob.setDay(22);
        david.print(System.err);
        System.err.println();

        // Bosses and Workers
        System.err.println("\nOffice");
        LoP office = new LoP();
        Boss ron = new Boss("Ron", new Date(17, 8, 1963));
        office.add(ron);
        Boss maura = new Boss("Maura", new Date(6, 2, 1973));
        office.add(maura);
        Worker steph = new Worker("Steph", new Date(1, 1, 1991), maura);
        steph.assignBoss(maura);
        office.add(steph);
        office.print(System.err);

        System.err.println();
        Worker gems = new Worker("Gemma", new Date(1, 1, 1981), maura);
        gems.assignBoss(maura);
        office.add(gems);
        office.print(System.err);

        steph.new_boss(ron);
        System.err.println();
        office.print(System.err);
    }
}
