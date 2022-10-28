package com.company.javaRelearn;

public class Parcel3_2022_7_26 {
    private static class Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected static class Destination {
        private String label;
        private Destination(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
        public static void f() {}
        static int x = 10;
        static class AnotherLevel {
            public static void f() {}
            static int x = 10;
        }
    }
    public static Destination destination(String s) {
        return new Destination(s);
    }
    public static Contents contents() {
        return new Contents();
    }

    public static void main(String[] args) {
        Contents contents = new Contents();
        Destination d = destination("Tasmania");
    }
}
