package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LatestTimeCatchTheBus_20240918 {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int peopleNum = 0;
        int result = 0;
        int busIndex = 0;
        int passengerIndex = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (passengerIndex < passengers.length){
            if(busIndex == buses.length){
                break;
            }
            if(passengers[passengerIndex] > buses[busIndex]){
                list.add(peopleNum);
                peopleNum = 0;
                busIndex++;
                continue;
            }
            if(capacity <= peopleNum){
                list.add(peopleNum);
                peopleNum = 0;
                busIndex++;
                continue;
            }
            if (passengers[passengerIndex] <= buses[busIndex]){
                peopleNum++;
                passengerIndex++;
            }
        }
        if(busIndex < buses.length){
            list.add(peopleNum);
        }
        System.out.println(list);

        return 0;
    }

    public static void main(String[] args) {
        int[] buses = {20,30,10};
        int[] passengers = {19,13,26,4,25,11,21};
        System.out.println(new LatestTimeCatchTheBus_20240918().latestTimeCatchTheBus(buses, passengers, 2));
    }
}
