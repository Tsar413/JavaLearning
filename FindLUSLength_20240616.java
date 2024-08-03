package com.company.javaRelearn;

public class FindLUSLength_20240616 {
    public int findLUSlength(String[] strs) {
        int result = -1;
        for(int i = 0; i < strs.length - 1; i++){
            for(int j = i + 1; j < strs.length; j++){
                if(judge(strs[i], strs[j])){
                    int t = Math.max(strs[i].length(), strs[j].length());
                    result = Math.max(result, t);
                }
            }
        }
        return result;
    }

    public boolean judge(String a, String b){
        if(a.equals(b)){
            return false;
        }
        if(a.length() >= b.length()){
            int indexB = 0;
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i) == b.charAt(indexB)){
                    indexB++;
                }
                if(indexB == b.length()){
                    return false;
                }
            }
            return true;
        } else {
            int indexA = 0;
            for(int i = 0; i < b.length(); i++){
                if(b.charAt(i) == a.charAt(indexA)){
                    indexA++;
                }
                if(indexA == a.length()){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String[] strs = {"aba","cdc","eae"};
        System.out.println(new FindLUSLength_20240616().findLUSlength(strs));
    }
}
