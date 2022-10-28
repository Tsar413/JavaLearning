package com.company.javaRelearn;

public class Parcel1_2022_7_23 {
    class Contents {
        private int i = 11;

        public int Value() {
            return i;
        }
    }

    class Destination {
        private String label;
        Destination(String whereTo) {
            label = whereTo;
        }
        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents contents = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1_2022_7_23 parcel2 = new Parcel1_2022_7_23();
        parcel2.ship("Tasmania");
        Parcel1_2022_7_23 q = new Parcel1_2022_7_23();
        Parcel1_2022_7_23.Contents contents = q.contents();
        Parcel1_2022_7_23.Destination destination = q.to("Borneo");
    }
}
