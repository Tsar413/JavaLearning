package com.company.javaRelearn;

public class Calculate_20241007 {
    private String data = "";
    private int index = 0;

    public int calculate(String s) {
        data = s;
        return calculate1();
    }

    private int calculate1(){
        int result = 0;
        String temp = "";
        char ops = '|';
        while (index < data.length()){
            if(Character.isDigit(data.charAt(index))){
                temp += data.charAt(index);
                index++;
            } else {
                if(data.charAt(index) == '+'){
                    if(ops == '|' || ops == '+'){
                        ops = '+';
                        if(!temp.equals("")){
                            result += Integer.parseInt(temp);
                        }
                        temp = "";
                    } else {
                        ops = '+';
                        if(!temp.equals("")){
                            result -= Integer.parseInt(temp);
                        }
                        temp = "";
                    }
                    index++;
                } else if(data.charAt(index) == '-'){
                    if(ops == '|' || ops == '+'){
                        ops = '-';
                        if(!temp.equals("")){
                            result += Integer.parseInt(temp);
                        }
                        temp = "";
                    } else {
                        ops = '-';
                        if(!temp.equals("")){
                            result -= Integer.parseInt(temp);
                        }
                        temp = "";
                    }
                    index++;
                } else if(data.charAt(index) == '('){
                    index++;
                    if(ops == '|' || ops == '+'){
                        result += calculate1();
                    } else {
                        result -= calculate1();
                    }
                } else if(data.charAt(index) == ')'){
                    if(ops == '|' || ops == '+'){
                        if(!temp.equals("")){
                            result += Integer.parseInt(temp);
                        }
                    } else {
                        if(!temp.equals("")){
                            result -= Integer.parseInt(temp);
                        }
                    }
                    index++;
                    return result;
                } else {
                    index++;
                }
            }
        }
        if(ops == '+'){
            if(!temp.equals("")){
                result += Integer.parseInt(temp);
            }
        } else if(ops == '-'){
            if(!temp.equals("")){
                result -= Integer.parseInt(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "1 + 1";
        String s2 = " 2-1 + 2 ";
        String s3 = "(1+(4+5+2)-3)+(6+8)";
        String s4 = "(1-(-2))";
        System.out.println(new Calculate_20241007().calculate(s4));
    }
}
