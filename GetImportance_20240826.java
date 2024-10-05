package com.company.javaRelearn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee1 {
    public int id;
    public int importance;
    public List<Integer> subordinates;
}

public class GetImportance_20240826 {
    public int getImportance(List<Employee1> employees, int id) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();
        for (Employee1 e : employees){
            map1.put(e.id, e.importance);
            map2.put(e.id, e.subordinates);
        }
        return recursiveCore(map1, map2, id);
    }

    private int recursiveCore(Map<Integer, Integer> map1, Map<Integer,
            List<Integer>> map2, int id){
        if(map2.get(id).size() == 0){
            return map1.get(id);
        }
        int result = map1.get(id);
        List<Integer> list = map2.get(id);
        for (int id1 : list){
            result += recursiveCore(map1, map2, id1);
        }
        return result;
    }
}
