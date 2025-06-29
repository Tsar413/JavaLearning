package com.company.javaRelearn.SEReview;

import java.io.*;
import java.util.*;

public class CohesionExample {
    public List<Integer> list1 (Integer x, Integer y) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(x);
        list.add(y);
        return list;
    }

    public Map<Integer, String> map1 (List<Integer> list1, List<String> list2) {
        Map<Integer, String> result = new HashMap<Integer, String>();
        for (int i = 0; i < list1.size(); i++) {
            result.put(list1.get(i), list2.get(i));
        }
        return result;
    }

    public <T>String outputData (List<T> list) {
        String result = "";
        for (T t : list) {
            result += t;
            result += " ";
        }
        return result;
    }

    public String outputPointData (List<Point> list) {
        String result = "";
        for (Point p : list) {
            result += p;
        }
        return result;
    }

    public String start() throws Exception {
        BufferedReader b = new BufferedReader(
                new InputStreamReader(System.in));
        String result = "";
        String s = "";
        while ((s = b.readLine()) != null && s.length() != 0) {
            result += s;
            result += "|";
        }
        return result;
    }

    public boolean end(String data) throws Exception {
        DataOutputStream output = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(data)));
        return true;
    }


}
