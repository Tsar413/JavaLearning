package com.company.javaRelearn;

class MagicDictionary {
    private String[] words;

    public MagicDictionary() {

    }

    public void buildDict(String[] dictionary) {
        this.words = dictionary;
    }

    public boolean search(String searchWord) {
        for (String word : words){
            if(word.length() == searchWord.length()){
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == searchWord.charAt(i)){
                        count++;
                    }
                }
                if(count == word.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }
}

public class MagicDictionary_20240812 {

}
