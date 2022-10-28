package com.company.javaRelearn.Access_2022_6_18;

public class ChocolateChip_2022_6_18 extends Cookie_2022_6_18 {
    ChocolateChip_2022_6_18() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        bite2();
    }

    public static void main(String[] args) {
        ChocolateChip_2022_6_18 chocolateChip = new ChocolateChip_2022_6_18();
        chocolateChip.chomp();
    }
}
