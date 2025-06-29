package com.company.javaRelearn;

public class PushDominoes_20250502 {
    public String pushDominoes(String dominoes) {
        char[] chars = dominoes.toCharArray();
        int count = 0;
        int left = 0;
        int leftIndex = 0;
        StringBuilder stringBuilder = new StringBuilder();
        if(dominoes.equals(".".repeat(dominoes.length()))){
            return dominoes;
        }
        for (int i = 0; i < chars.length; i++) {
            if(count == 0){
                if(chars[i] != '.'){
                    stringBuilder.append(chars[i]);
                    if(chars[i] == 'L'){
                        left = -1;
                    } else {
                        left = 1;
                    }
                } else {
                    if(i == chars.length - 1){
                        if(left == -1){
                            stringBuilder.append(".");
                        } else {
                            stringBuilder.append("R");
                        }
                    } else {
                        leftIndex = i - 1;
                        count = 1;
                    }
                }
            } else {
                if(chars[i] == '.'){
                    if(i == chars.length - 1){
                        if(left == -1){
                            stringBuilder.append(".".repeat(i - leftIndex));
                        } else {
                            stringBuilder.append("R".repeat(i - leftIndex));
                        }
                    } else {
                        continue;
                    }
                } else {
                    if(chars[i] == 'L'){
                        if(left == -1){
                            stringBuilder.append("L".repeat(i - 1 - leftIndex));
                        } else if(left == 0){
                            stringBuilder.append("L".repeat(i));
                        } else {
                            if((i - 1 - leftIndex) % 2 == 1){
                                stringBuilder.append("R".repeat((i - 1 - leftIndex) / 2));
                                stringBuilder.append(".");
                                stringBuilder.append("L".repeat((i - 1 - leftIndex) / 2));
                            } else {
                                stringBuilder.append("R".repeat((i - 1 - leftIndex) / 2));
                                stringBuilder.append("L".repeat((i - 1 - leftIndex) / 2));
                            }
                        }
                        stringBuilder.append("L");
                        count = 0;
                        leftIndex = 0;
                        left = -1;
                    } else {
                        if(left == -1){
                            stringBuilder.append(".".repeat(i - 1 - leftIndex));
                        } else if(left == 0){
                            stringBuilder.append(".".repeat(i));
                        } else {
                            stringBuilder.append("R".repeat(i - 1 - leftIndex));
                        }
                        stringBuilder.append("R");
                        count = 0;
                        leftIndex = 0;
                        left = 1;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new PushDominoes_20250502().pushDominoes("R."));
    }
}
