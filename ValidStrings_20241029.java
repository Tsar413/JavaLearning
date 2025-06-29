package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class ValidStrings_20241029 {
    private List<String> list = new ArrayList<String>();

    public List<String> validStrings(int n) {
        recursiveCore("", 1, n);
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if(!list.get(i).contains("00")){
                result.add(list.get(i));
            }
        }
        return result;
    }

    public void recursiveCore(String data, int count, int n){
        if(count < n){
            data += "1";
            recursiveCore(data, count + 1, n);
            data = data.substring(0, data.length() - 1);
            data += "0";
            recursiveCore(data, count + 1, n);
        } else {
            data += "1";
            list.add(data);
            data = data.substring(0, data.length() - 1);
            data += "0";
            list.add(data);
        }
    }

    public static void main(String[] args) {
        System.out.println(new ValidStrings_20241029().validStrings(3));
    }
}
