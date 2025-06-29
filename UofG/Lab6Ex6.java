package com.company.javaRelearn.UofG;

public class Lab6Ex6 {
    public static void supplementaryCharacters(String initialString, char[] paddingCharacter, Integer totalLength) {
        int initialStringLength = initialString.length();
        if(totalLength < initialStringLength) {
            System.out.println("Error");
        } else {
            String s = "";
            for (int i = 0; i < totalLength - initialStringLength; i++) {
                s += paddingCharacter[0];
            }
            s += initialString;
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String temp = "@";
        supplementaryCharacters("Simon", temp.toCharArray(), 10);
    }
}
