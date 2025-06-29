package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReportSpam_20250507 {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<String>(Arrays.asList(bannedWords));
        int count = 0;
        for (String m : message){
            if(set.contains(m)){
                count++;
            }
            if(count >= 2){
                return true;
            }
        }
        return false;
    }
}
