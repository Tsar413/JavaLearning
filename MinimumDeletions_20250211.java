package com.company.javaRelearn;

import java.util.Arrays;

public class MinimumDeletions_20250211 {
    public int minimumDeletions(String word, int k) {
        int[] words = new int[26];
        for (int i = 0; i < word.length(); i++) {
            words[word.charAt(i) - 'a']++;
        }
        Arrays.sort(words);
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            sum += words[i];
            int sum2 = 0;
            for (int j = i + 1; j < words.length; j++) {
                sum2 += (words[j] - words[i]);
            }
            min = Math.min(min, sum + sum2);
        }
        return min;
    }
}
