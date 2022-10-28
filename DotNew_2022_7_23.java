package com.company.javaRelearn;

public class DotNew_2022_7_23 {
    public class Inner {}

    public static void main(String[] args) {
        DotNew_2022_7_23 dotNew = new DotNew_2022_7_23();
        DotNew_2022_7_23.Inner dni = dotNew.new Inner();
    }
}
