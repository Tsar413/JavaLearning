package com.company.javaRelearn;

public class LosingPlayer_20241105 {
    public String losingPlayer(int x, int y) {
        if(y >= 4 * x){
            if(x % 2 == 1){
                return "Alice";
            } else {
                return "Bob";
            }
        } else {
            if((y / 4) % 2 == 1){
                return "Alice";
            } else {
                return "Bob";
            }
        }
    }
}
