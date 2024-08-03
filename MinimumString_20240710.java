package com.company.javaRelearn;

public class MinimumString_20240710 {
    public String minimumString(String a, String b, String c) {
        String aStart = compareStep1(a, b, c);
        String bStart = compareStep1(b, a, c);
        String cStart = compareStep1(c, b, a);
        String result = compareStep2(aStart, bStart, cStart);
        return result;
    }

    public String compareStep2(String a, String b, String c){
        String result = a;
        if(a.length() < b.length()){
            result = a;
        } else if(a.length() > b.length()){
            result = b;
        } else {
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) > b.charAt(i)){
                    result = b;
                    break;
                } else if(a.charAt(i) < b.charAt(i)){
                    result = a;
                    break;
                } else {
                    continue;
                }
            }
        }
        if(result.length() < c.length()){
            result = result;
        } else if(result.length() > c.length()){
            result = c;
        } else {
            for(int i = 0; i < c.length(); i++){
                if(result.charAt(i) > c.charAt(i)){
                    result = c;
                    break;
                } else if(result.charAt(i) < c.charAt(i)){
                    break;
                } else {
                    continue;
                }
            }
        }
        return result;
    }

    public String compareStep1(String a, String b, String c) {
        String temp1 = gather(a, b, c);
        String temp2 = gather(a, c, b);
        String result = temp1;
        if(temp1.length() < temp2.length()){
            result = temp1;
        } else if(temp1.length() > temp2.length()){
            result = temp2;
        } else {
            for(int i = 0; i < temp1.length(); i++){
                if(temp1.charAt(i) > temp2.charAt(i)){
                    result = temp2;
                    break;
                } else if(temp1.charAt(i) < temp2.charAt(i)){
                    result = temp1;
                    break;
                } else {
                    continue;
                }
            }
        }
        return result;
    }

    public String gather(String a, String b, String c){
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        boolean flag2 = false;
        if(!a.equals(b)){
            while(index1 < a.length()){
                if(a.charAt(index1) == b.charAt(index2) && !flag2){
                    index2++;
                    flag2 = true;
                } else if(a.charAt(index1) == b.charAt(index2) && flag2){
                    index2++;
                } else {
                    index2 = 0;
                    flag2 = false;
                }
                if(index2 == b.length()){
                    break;
                }
                index1++;
            }
            for(int i = index2; i < b.length(); i++){
                a += b.charAt(i);
            }
        }
        if(!a.equals(c)){
            index1 = 0;
            boolean flag3 = false;
            while(index1 < a.length()){
                if(a.charAt(index1) == c.charAt(index3) && !flag3){
                    index3++;
                    flag3 = true;
                } else if(a.charAt(index1) == c.charAt(index3) && flag3){
                    index3++;
                } else {
                    index3 = 0;
                    flag3 = false;
                }
                if(index3 == c.length()){
                    break;
                }
                index1++;
            }
            for(int i = index3; i < c.length(); i++){
                a += c.charAt(i);
            }
        }

        return a;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumString_20240710().minimumString("aa", "ab", "a"));
    }
}
