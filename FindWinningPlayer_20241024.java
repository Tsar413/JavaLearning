package com.company.javaRelearn;

public class FindWinningPlayer_20241024 {
    public int findWinningPlayer(int[] skills, int k) {
        int index1 = 0;
        int index2 = 1;
        int count = 0;
        while (index2 < skills.length){
            if(skills[index1] > skills[index2]){
                count++;
                index2++;
            } else {
                count = 1;
                index1 = index2;
                index2++;
            }
            if(count == k){
                return index1;
            }
        }
        return index1;
    }

    public static void main(String[] args) {
        int[] skills = {4, 2, 6, 3, 9};
        System.out.println(new FindWinningPlayer_20241024().findWinningPlayer(skills, 2));
        System.out.println("Hello World");
    }
}
