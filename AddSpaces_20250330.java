package com.company.javaRelearn;

public class AddSpaces_20250330 {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder = new StringBuilder();
        if(spaces.length == 1 && spaces[0] == 0){
            stringBuilder.append(" ");
            stringBuilder.append(s);
            return stringBuilder.toString();
        }
        if(spaces.length == 1 && spaces[0] != 0){
            stringBuilder.append(s, 0, spaces[0]);
            stringBuilder.append(" ");
            stringBuilder.append(s, spaces[0], s.length());
            return stringBuilder.toString();
        }
        for (int i = 0; i < spaces.length; i++) {
            if(i == 0){
                stringBuilder.append(s, 0, spaces[0]);
                stringBuilder.append(" ");
            } else if(i == spaces.length - 1){
                stringBuilder.append(s, spaces[i - 1], spaces[i]);
                stringBuilder.append(" ");
                stringBuilder.append(s, spaces[i], s.length());
            } else {
                stringBuilder.append(s, spaces[i - 1], spaces[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddSpaces_20250330().addSpaces("p", new int[]{1}));
    }
}
