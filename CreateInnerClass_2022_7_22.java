package com.company.javaRelearn;

public class CreateInnerClass_2022_7_22 {
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


    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        CreateInnerClass_2022_7_22 c = new CreateInnerClass_2022_7_22();
        c.ship("Tasmania");
    }
}
