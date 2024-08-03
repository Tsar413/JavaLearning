package com.company.javaRelearn;

import java.util.*;

public class AccountsMerge_20240715 {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<Map<String, Set<String>>> data = new ArrayList<Map<String, Set<String>>>();
        for (int i = 0; i < accounts.size(); i++) {
            List<String> account = accounts.get(i);
            Set<String> emails = new TreeSet<String>();
            for (int j = 1; j < account.size(); j++) {
                String emailsLeaf = account.get(j);
                emails.add(emailsLeaf);
            }
            if(data.isEmpty()){
                Map<String, Set<String>> subData = new HashMap<String, Set<String>>();
                subData.put(account.get(0), emails);
                data.add(subData);
            } else {
                boolean flag = false;
                for(int j = 0; j < data.size(); j++){
                    Map<String, Set<String>> maps = data.get(j);
                    List<String> keyList = new ArrayList<String>(maps.keySet());
                    String key = keyList.get(0);
                    Set<String> emails1 = maps.get(key);
                    List<String> list = new ArrayList<>(emails);
                    Set<String> emailsTemp = new TreeSet<String>(list);
                    if(key.equals(account.get(0))){
                        emailsTemp.retainAll(emails1);
                        if(emailsTemp.size() != 0){
                            flag = true;
                            emails.addAll(emails1);
                            maps.put(account.get(0), emails);
                        }
                    }
                }
                if(!flag){
                    Map<String, Set<String>> subData = new HashMap<String, Set<String>>();
                    subData.put(account.get(0), emails);
                    data.add(subData);
                }
            }
        }
        Set<Map<String, Set<String>>> data1 = new HashSet<Map<String, Set<String>>>(data);
        data = new ArrayList<Map<String, Set<String>>>(data1);
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i < data.size(); i++) {
            List<String> list = new ArrayList<String>();
            Map<String, Set<String>> map = data.get(i);
            list.add(new ArrayList<String>(map.keySet()).get(0));
            list.addAll(map.get(new ArrayList<String>(map.keySet()).get(0)));
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<String> list1 = Arrays.asList("David","David0@m.co","David1@m.co");
        List<String> list2 = Arrays.asList("David","David3@m.co","David4@m.co");
        List<String> list3 = Arrays.asList("David","David4@m.co","David5@m.co");
        List<String> list4 = Arrays.asList("David","David2@m.co","David3@m.co");
        List<String> list5 = Arrays.asList("David","David1@m.co","David2@m.co");
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
        System.out.println(new AccountsMerge_20240715().accountsMerge(list));
    }
}
