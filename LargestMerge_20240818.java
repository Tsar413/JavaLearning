package com.company.javaRelearn;

public class LargestMerge_20240818 {
    public String largestMerge(String word1, String word2) {
        String result = "";
        int index1 = 0;
        int index2 = 0;
        int start1 = -1;
        int start2 = -1;
        boolean flag = true;
        while(index1 < word1.length() && index2 < word2.length()){
                if(flag){
                    if(word1.charAt(index1) < word2.charAt(index2)){
                        result += word2.charAt(index2);
                        index2++;
                    } else if(word1.charAt(index1) > word2.charAt(index2)){
                        result += word1.charAt(index1);
                        index1++;
                    } else {
                        flag = false;
                        start1 = index1;
                        start2 = index2;
                        index1++;
                        index2++;
                    }
                } else {
                    if (word1.charAt(index1) < word2.charAt(index2)) {
                        result += word2.substring(start2, index2 + 1);
                        flag = true;
                        index2++;
                        index1 = start1;
                        start1 = -1;
                        start2 = -1;
                    } else if (word1.charAt(index1) > word2.charAt(index2)) {
                        result += word1.substring(start1, index1 + 1);
                        flag = true;
                        index1++;
                        index2 = start2;
                        start1 = -1;
                        start2 = -1;
                    } else {
                        index1++;
                        index2++;
                    }
                }

        }
        if(index1 == word1.length() && start1 != -1){
            result += word1.substring(start1, index1);
        }
        if(index1 < word1.length() && start1 != -1){
            result += word1.substring(start1);
        }
        if(index1 <= word1.length() && start1 == -1){
            result += word1.substring(index1);
        }
        if(index2 == word2.length() && start2 != -1){
            result += word2.substring(start2, index2);
        }
        if(index2 < word2.length() && start2 != -1){
            result += word2.substring(start2);
        }
        if(index2 <= word2.length() && start2 == -1){
            result += word2.substring(index2);
        }
        return result;
    }

    public static void main(String[] args) {
        String word1 = "guguuuuuuuuuuuuuuguguuuuguug";
        String word2 = "gguggggggguuggguugggggg";
        System.out.println(new LargestMerge_20240818().largestMerge(word1, word2));
    }
}
