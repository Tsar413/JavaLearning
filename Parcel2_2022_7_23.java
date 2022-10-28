package com.company.javaRelearn;

public class Parcel2_2022_7_23 {
    class Contents {
        private int i = 11;
        public int value() {
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

    public static void main(String[] args) {
        Parcel2_2022_7_23 parcel2 = new Parcel2_2022_7_23();
        Parcel2_2022_7_23.Contents contents = parcel2.new Contents();
        Parcel2_2022_7_23.Destination destination = parcel2.new Destination("Tasmania");
    }
}
