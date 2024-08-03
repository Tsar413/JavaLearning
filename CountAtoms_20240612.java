package com.company.javaRelearn;

import java.util.*;

public class CountAtoms_20240612 {
    public String countOfAtoms(String formula) {
        
        return null;
    }

    public Map<String, Integer> countBrackets(String data, int num, List<Map<String, Integer>> maps){
        String atoms = new StringBuilder(data).reverse().toString();
        Map<String, Integer> result = new HashMap<String, Integer>();
        atoms = atoms.substring(1, atoms.length() - 1);
        StringBuilder atom = new StringBuilder();
        StringBuilder atomNum = new StringBuilder();
        for(int i = 0; i < atoms.length(); i++){
            char c = atoms.charAt(i);
            if(Character.isUpperCase(c)){
                if(atom.length() == 0){
                    atom.append(c);
                } else {
                    int atomNum1 = 1;
                    if(atomNum.length() != 0){
                        atomNum1 = Integer.parseInt(atomNum.toString());
                    }
                    String atom1 = atom.toString();
                    if(result.containsKey(atom1)){
                        int t = result.get(atom1) + atomNum1;
                        result.put(atom1, t);
                    } else {
                        result.put(atom1, atomNum1);
                    }
                    atom.setLength(0);
                    atomNum.setLength(0);
                    atom.append(c);
                }
            } else if(Character.isLowerCase(c)){
                atom.append(c);
            } else if(Character.isDigit(c)){
                atomNum.append(c);
            }
        }
        int atomNum1 = 1;
        if(atomNum.length() != 0){
            atomNum1 = Integer.parseInt(atomNum.toString());
        }
        String atom1 = atom.toString();
        if(result.containsKey(atom1)){
            int t = result.get(atom1) + atomNum1;
            result.put(atom1, t);
        } else {
            result.put(atom1, atomNum1);
        }
        if(maps != null){
            for (Map<String, Integer> map : maps){
                List<String> keyList = new ArrayList<String>(map.keySet());
                for(String key : keyList){
                    if(result.containsKey(key)){
                        int t = result.get(key) + map.get(key);
                        result.put(key, t);
                    } else {
                        result.put(key, map.get(key));
                    }
                }
            }
        }
        List<String> keyList = new ArrayList<String>(result.keySet());
        for(String key : keyList){
            int t = result.get(key) * num;
            result.put(key, t);
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("H", 2);
        map1.put("O", 1);
        Map<String, Integer> map2 = new HashMap<String, Integer>();
        map2.put("Al", 2);
        map2.put("O", 3);
        List<Map<String, Integer>> maps = new ArrayList<Map<String, Integer>>();
        maps.add(map1);
        maps.add(map2);
        System.out.println(new CountAtoms_20240612().countBrackets(")3FO2gM2H(", 2, maps));
        System.out.println(new CountAtoms_20240612().countBrackets(")eFO2gM2H(", 2, null));
    }
}
