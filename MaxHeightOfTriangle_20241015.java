package com.company.javaRelearn;

public class MaxHeightOfTriangle_20241015 {
    public int maxHeightOfTriangle(int red, int blue) {
        int odd = 0;
        int even = 0;
        int i = 1;
        while (true){
            if(i % 2 == 1){
                odd += i;
            } else {
                even += i;
            }
            if((odd > red || even > blue) && (even > red || odd > blue)){
                return i - 1;
            }
            i++;
        }
    }
}
