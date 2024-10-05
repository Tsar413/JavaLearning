package com.company.javaRelearn;

import java.util.*;

public class NumBusesToDestination_20240917 {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source == target){
            return 0;
        }
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < routes.length; i++) {
            for (int j = 0; j < routes[i].length; j++) {
                if(map.containsKey(routes[i][j])){
                    map.get(routes[i][j]).add(i);
                } else {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    map.put(routes[i][j], list);
                }
            }
        }
        if(!map.containsKey(source) || !map.containsKey(target)){
            return -1;
        }
        List<List<Integer>> stationList = new ArrayList<List<Integer>>();
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> sourceBusesList = map.get(source);
        List<Integer> perStationList = new ArrayList<Integer>();
//        perStationList.add(source);
//        set.add(source);
        for (int i = 0; i < sourceBusesList.size(); i++) {
            for (int j = 0; j < routes[sourceBusesList.get(i)].length; j++) {
                if(routes[sourceBusesList.get(i)][j] == target){
                    return 1;
                } else {
                    perStationList.add(routes[sourceBusesList.get(i)][j]);
                    set.add(routes[sourceBusesList.get(i)][j]);
                }
            }
        }
        stationList.add(perStationList);
        int index = 0;
        while (index < stationList.size()){
            List<Integer> formerStations = stationList.get(index);
            List<Integer> perStationList1 = new ArrayList<Integer>();
            for (int i = 0; i < formerStations.size(); i++) {
                List<Integer> busRoutes = map.get(formerStations.get(i));
                for (int j = 0; j < busRoutes.size(); j++) {
                    int busRoute = busRoutes.get(j);
                    for (int k = 0; k < routes[busRoute].length; k++) {
                        if(routes[busRoute][k] == target){
                            return index + 2;
                        } else {
                            if(!set.contains(routes[busRoute][k])){
                                perStationList1.add(routes[busRoute][k]);
                                set.add(routes[busRoute][k]);
                            }
                        }
                    }
                }
            }
            if(perStationList1.size() != 0){
                stationList.add(perStationList1);
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] routes = {{2},{2,8}};
        System.out.println(new NumBusesToDestination_20240917().numBusesToDestination(routes,8,2));

    }
}
