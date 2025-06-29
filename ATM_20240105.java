package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ATM_20240105 {
    static class ATM {
        private Map<Integer, Integer> map;

        public ATM() {
            map = new HashMap<Integer, Integer>();
            map.put(20, 0);
            map.put(50, 0);
            map.put(100, 0);
            map.put(200, 0);
            map.put(500, 0);
        }

        public void deposit(int[] banknotesCount) {
            for (int i = 0; i < banknotesCount.length; i++) {
                if(i == 0){
                    int t = map.get(20);
                    t += banknotesCount[0];
                    map.put(20, t);
                } else if(i == 1){
                    int t = map.get(50);
                    t += banknotesCount[1];
                    map.put(50, t);
                } else if(i == 2){
                    int t = map.get(100);
                    t += banknotesCount[2];
                    map.put(100, t);
                } else if(i == 3){
                    int t = map.get(200);
                    t += banknotesCount[3];
                    map.put(200, t);
                } else {
                    int t = map.get(500);
                    t += banknotesCount[4];
                    map.put(500, t);
                }
            }
        }

        public int[] withdraw(int amount) {
            int[] result = new int[5];
            int target = amount;
            for (int i = 4; i >= 0; i--) {
                if(i == 4){
                    int count = target / 500;
                    int num = map.get(500);
                    if(count > 0){
                        if(count > num){
                            target -= num * 500;
                            result[i] = num;
                        } else {
                            target -= count * 500;
                            result[i] = count;
                        }
                    }
                } else if (i == 3) {
                    int count = target / 200;
                    int num = map.get(200);
                    if(count > 0){
                        if(count > num){
                            target -= num * 200;
                            result[i] = num;
                        } else {
                            target -= count * 200;
                            result[i] = count;
                        }
                    }
                } else if (i == 2) {
                    int count = target / 100;
                    int num = map.get(100);
                    if(count > 0){
                        if(count > num){
                            target -= num * 100;
                            result[i] = num;
                        } else {
                            target -= count * 100;
                            result[i] = count;
                        }
                    }
                } else if (i == 1) {
                    int count = target / 50;
                    int num = map.get(50);
                    if(count > 0){
                        if(count > num){
                            target -= num * 50;
                            result[i] = num;
                        } else {
                            target -= count * 50;
                            result[i] = count;
                        }
                    }
                } else if (i == 0) {
                    int count = target / 20;
                    int num = map.get(20);
                    if(count > 0){
                        if(count > num){
                            target -= num * 20;
                            result[i] = num;
                        } else {
                            target -= count * 20;
                            result[i] = count;
                        }
                    }
                }
            }
            if(target > 0){
                return new int[]{-1};
            }
            for (int i = 0; i < 5; i++) {
                if(i == 0){
                    int t = map.get(20);
                    t -= result[i];
                    map.put(20, t);
                } else if (i == 1) {
                    int t = map.get(50);
                    t -= result[i];
                    map.put(50, t);
                } else if (i == 2) {
                    int t = map.get(100);
                    t -= result[i];
                    map.put(100, t);
                } else if (i == 3) {
                    int t = map.get(200);
                    t -= result[i];
                    map.put(200, t);
                } else {
                    int t = map.get(500);
                    t -= result[i];
                    map.put(500, t);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit(new int[]{0,0,1,2,1});
        System.out.println(Arrays.toString(atm.withdraw(600)));
        atm.deposit(new int[]{0,1,0,1,1});
        System.out.println(Arrays.toString(atm.withdraw(600)));
        System.out.println(Arrays.toString(atm.withdraw(550)));
    }
}
