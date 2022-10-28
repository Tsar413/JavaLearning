package com.company.javaRelearn;

public interface ClassInInterface_2022_7_26 {
    void howdy();
    class Test implements ClassInInterface_2022_7_26 {
        @Override
        public void howdy() {
            System.out.println("howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
