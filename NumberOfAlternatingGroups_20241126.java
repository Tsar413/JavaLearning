package com.company.javaRelearn;

public class NumberOfAlternatingGroups_20241126 {
    public int numberOfAlternatingGroups(int[] colors) {
        int result = 0;
        for (int i = 0; i < colors.length; i++) {
            if(i == 0){
                if(colors[colors.length - 1] != colors[0] && colors[0] != colors[1]){
                    result++;
                }
            } else if(i == colors.length - 1){
                if(colors[colors.length - 1] != colors[0] && colors[colors.length - 1] != colors[colors.length - 2]){
                    result++;
                }
            } else {
                if(colors[i - 1] != colors[i] && colors[i] != colors[i + 1]){
                    result++;
                }
            }
        }
        return result;
    }
}
