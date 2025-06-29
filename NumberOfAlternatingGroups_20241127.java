package com.company.javaRelearn;

public class NumberOfAlternatingGroups_20241127 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int[] colors2 = new int[colors.length * 2];
        for (int i = 0; i < colors2.length; i++) {
            if(i < colors.length){
                colors2[i] = colors[i];
            } else {
                colors2[i] = colors[i - colors.length];
            }
        }
        int index1 = 0;
        int index2 = 0;
        int result = 0;
        while (index2 < colors.length){
            if(index1 - index2 + 1 < k){
                if(colors2[index1] == colors2[index1 + 1]){
                    index1++;
                    index2 = index1;
                } else {
                    index1++;
                }
            } else {
                index2++;
                result++;
                if(colors2[index1] == colors2[index1 + 1]){
                    index2 = index1;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] colors = {0, 1, 0, 0, 1, 0, 1};
        System.out.println(new NumberOfAlternatingGroups_20241127().numberOfAlternatingGroups(colors, 6));
    }
}
