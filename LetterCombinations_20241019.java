package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations_20241019 {
    private List<String> result = new ArrayList<String>();
    private int index = 0;
    private String storage = "";
    private String digitsData = "";
    private String[] twoButton = {"a","b","c"};
    private String[] threeButton = {"d","e","f"};
    private String[] fourButton = {"g","h","h"};
    private String[] fiveButton = {"j","k","l"};
    private String[] sixButton = {"m","n","o"};
    private String[] sevenButton = {"p","q","r","s"};
    private String[] eightButton = {"t","u","v"};
    private String[] nineButton = {"w","x","y","z"};


    public List<String> letterCombinations(String digits) {
        digitsData = digits;
        recursiveCore();
        return result;
    }

    private void recursiveCore(){
        if(index == digitsData.length() - 1){
            if(digitsData.charAt(index) == '2'){
                for (String n : twoButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '3'){
                for (String n : threeButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '4'){
                for (String n : fourButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '5'){
                for (String n : fiveButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '6'){
                for (String n : sixButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '7'){
                for (String n : sevenButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '8'){
                for (String n : eightButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '9'){
                for (String n : nineButton){
                    storage += n;
                    result.add(storage);
                    storage = storage.substring(0,storage.length() - 1);
                }
            }
        } else {
            if(digitsData.charAt(index) == '2'){
                for (String n : twoButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '3'){
                for (String n : threeButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '4'){
                for (String n : fourButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '5'){
                for (String n : fiveButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '6'){
                for (String n : sixButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '7'){
                for (String n : sevenButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '8'){
                for (String n : eightButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            } else if(digitsData.charAt(index) == '9'){
                for (String n : nineButton){
                    storage += n;
                    index++;
                    recursiveCore();
                    index--;
                    storage = storage.substring(0,storage.length() - 1);
                }
            }
        }
    }
}
