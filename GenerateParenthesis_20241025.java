package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis_20241025 {
    private List<String> list = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        recursiveCore(n, n, "");
        return list;
    }

    public void recursiveCore(int left, int right, String data){
        if(left < right){
            if(left == 0){
                data += ")";
                right--;
                recursiveCore(left, right, data);
            } else {
                data += "(";
                left--;
                recursiveCore(left, right, data);
                left++;
                data = data.substring(0, data.length() - 1);
                data += ")";
                right--;
                recursiveCore(left, right, data);
            }
        } else {
            if(left == 0 && right == 0){
                list.add(data);
            } else {
                data += "(";
                left--;
                recursiveCore(left, right, data);
                left++;
                data = data.substring(0, data.length() - 1);
                if(left != right){
                    data += ")";
                    right--;
                    recursiveCore(left, right, data);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis_20241025().generateParenthesis(3));
    }
}
