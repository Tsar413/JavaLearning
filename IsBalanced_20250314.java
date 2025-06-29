package com.company.javaRelearn;

public class IsBalanced_20250314 {
    public boolean isBalanced(String num) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num.length(); i++) {
            int num1 = num.charAt(i) - '0';
            if(i % 2 == 0){
                even += num1;
            } else {
                odd += num1;
            }
        }
        return even == odd;
    }
}
