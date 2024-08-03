package com.company.javaRelearn;

public class RemoveAlmostEqualCharacters_20240623 {
    public int removeAlmostEqualCharacters(String word) {
        int index = 0;
        int result = 0;
        while(index < word.length() - 1){
            if(judge(word.charAt(index), word.charAt(index + 1))){
                result++;
                index += 2;
            } else {
                index++;
            }
        }
        return result;
    }

    public boolean judge(char a, char b){
        return b - a <= 1 && b - a >= -1;
    }


}
