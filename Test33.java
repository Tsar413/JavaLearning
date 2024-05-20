package com.company.javaRelearn;

import java.lang.reflect.Array;
import java.util.*;

public class Test33 {
    public int findLength(int[] nums1, int[] nums2) {
        int result = 0;
        int judge = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]) {
                    judge++;
                    for(int h = 1; h < Math.min(nums1.length - i, nums2.length - j); h++) {
                        if(nums1[i + h] == nums2[j + h]){
                            judge++;
                        } else {
//                            i = i + h;
//                            j = 0;
                            break;
                        }
                    }
                    result = Math.max(result, judge);
                    judge = 0;
                }
            }
        }
        return result;
    }

    public int minPathSum(int[][] grid) {
        int result = 0;
        int temp = 0;
        for(int i = grid.length - 1; i >= 0; i--) {
            for(int j = grid[0].length - 1 - temp; j >= 0; j--){
                result += grid[i][j];
                if(i == 0 && j != 0) {
                    continue;
                } else if(i != 0 && j == 0) {
                    temp++;
                    break;
                } else if(i == 0 && j == 0) {
                    return result;
                } else {
                    if(grid[i - 1][j] < grid[i][j - 1]){
                        temp++;
                        break;
                    } else {
                        continue;
                    }
                }
            }
        }
        return result;
    }

    public int trap(int[] height) {
        int max = gatMaxHeight(height);
        int temp1 = -1;
        int temp2 = -1;
        int result = 0;
        for(int i = 1; i <= max; i++){
            temp1 = -1;
            for(int j = 0; j < height.length; j++){
                if(height[j] >= i && temp1 == -1){
                    temp1 = j;
                } else if(height[j] >= i){
                    temp2 = j;
                    result += (temp2 - temp1);
                    temp1 = j;
                }
            }
        }
        return result;
    }

    public int gatMaxHeight(int[] height){
        int max = 0;
        for(int t : height){
            max = Math.max(max, t);
        }
        return max;
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = getArray(triangle);
        int result = dp[triangle.size() - 1][0];
        int temp = 0;
        for(int i = 0; i < dp[0].length; i++){
            if(result < dp[triangle.size() - 1][i]) {
                result = dp[triangle.size() - 1][i];
                temp = i;
            }
        }
        for(int i = dp.length - 1; i > 0; i--){
            if(temp == 0) {
                result += dp[i - 1][0];
            } else if(temp == i) {
                result += dp[i - 1][i - 1];
                temp = temp - 1;
            } else {
                if(dp[i - 1][temp] < dp[i - 1][temp - 1]) {
                    result += dp[i - 1][temp];
                } else {
                    result += dp[i - 1][temp - 1];
                    temp = temp - 1;
                }
            }
        }
        return result;
    }

    public int[][] getArray(List<List<Integer>> triangle){
        int[][] result = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < triangle.size(); i++){
            for(int j = 0; j <= i; j++){
                result[i][j] = triangle.get(i).get(j);
            }
        }
        return result;
    }

    public int[] bubbleArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int findKthLargest(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        int count1 = 0;
        int result = 0;
        for(int n : nums){
            if(map.containsKey(n)){
                int count = map.get(n);
                count++;
                map.put(n, count);
            } else {
                map.put(n, 1);
            }
        }
        for(Integer i : map.keySet()){
            count1 += map.get(i);
            if(count1 >= k){
                result = i;
                break;
            }
        }
        return result;
    }

    public int findUnsortedSubarray(int[] nums) {
        List<Integer> indexList = new ArrayList<Integer>();
        int temp1 = nums[0];
        int temp2 = nums[nums.length - 1];
        for(int i = 0; i < nums.length; i++){
            if(temp1 < nums[i]){
                temp1 = nums[i];
            } else if(temp1 == nums[i]){
                continue;
            } else {
                indexList.add(i);
            }
        }
        for(int i = nums.length - 1; i >= 0; i--){
            if(temp2 > nums[i]){
                temp2 = nums[i];
            } else if(temp2 == nums[i]){
                continue;
            } else {
                indexList.add(i);
            }
        }
        int maxIndex = 0;
        int minIndex = nums.length - 1;
        if(indexList.size() == 0){
            return 0;
        }
        for(int i = 0; i < indexList.size(); i++){
            if(indexList.get(i) > maxIndex){
                maxIndex = indexList.get(i);
            } else {
                minIndex = indexList.get(i);
            }
        }
        return maxIndex - minIndex;
    }

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            temp = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    temp += (nums[j] - nums[i]);
                } else {
                    temp += (nums[i] - nums[j]);
                }
            }
            result = Math.min(result, temp);
        }
        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int index1 = 0;
        int index2 = nums.length - 1;
        int result1 = -1;
        int result2 = -1;
        if(nums.length == 1 && nums[0] == target){
            int[] output = {0,0};
            return output;
        }
        while(index1 != index2 && index1 < nums.length && index2 >= 0){
            if(nums[index1] != target){
                index1++;
            } else if(nums[index1] == target){
                result1 = index1;
            }
            if(nums[index2] != target){
                index2--;
            } else if(nums[index2] == target){
                result2 = index2;
            }
            if(result1 != -1 && result2 != -1){
                break;
            }
        }
        int[] output = {result1, result2};
        return output;
    }

    public int strStr(String haystack, String needle) {
        String[] resource = haystack.split("");
        String[] judge = needle.split("");
        int index1 = 0;
        int index2 = 0;
        int result = -1;
        int count = 1;
        while(index1 < resource.length){
            if(resource[index1].equals(judge[index2])){
                index2++;
                if(count == 1){
                    result = index1;
                    count++;
                }
            } else if(!resource[index1].equals(judge[index2])){
                index2 = 0;
                result = -1;
                count = 1;
            }
            index1++;
            if(index2 == judge.length - 1){
                return result;
            }
        }
        return result;
    }

    public int getMinimumDifference(List<Integer> list) {
        int min = 100000;
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i != j){
                    int t = list.get(i) - list.get(j);
                    int temp = Math.abs(t);
                    min = Math.min(min, temp);
                }
            }
        }
        return min;
    }

    public int thirdMax(int[] nums) {
        int first = nums[0];
        int second = 0;
        long third = -2147483649L;
        int count = 0;
        for(int n : nums){
            if(count == 1){
                if(n > first){
                    second = first;
                    first = n;
                } else if(n < first){
                    second = n;
                } else {
                    count--;
                }
            } else {
                if(n > first){
                    third = second;
                    second = first;
                    first = n;
                } else if(n < first && n > second){
                    third = second;
                    second = n;
                } else if(n < second && n > third){
                    third = n;
                }

            }
            count++;
        }
        if(third == -2147483649L){
            return first;
        } else {
            return (int)third;
        }
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int h : hand){
            if(map.containsKey(h)){
                int t = map.get(h);
                t++;
                map.put(h, t);
            } else {
                map.put(h, 1);
            }
        }
        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<Integer>(set);
        int index = 0;
        while(index < list.size() - groupSize){
            int[] group = new int[groupSize];
            boolean flag1 = true;
            int index1 = index;
            for(int i = 0; i < groupSize; i++){
                group[i] = list.get(index1);
                index1++;
            }
            for(int i = 0; i < groupSize - 1; i++) {
                if(group[i] != group[i + 1] - 1){
                    flag1 = false;
                    break;
                }
            }
            if(!flag1){
                index++;
            } else {
                for(int i = 0; i < groupSize; i++){
                    if(map.get(group[i]) == 0) {
                        flag1 = false;
                        break;
                    }
                }
                if(!flag1){
                    index++;
                } else {
                    for(int i = 0; i < groupSize; i++){
                        int value = map.get(group[i]);
                        value--;
                        map.put(group[i], value);
                    }
                }
            }
        }
        for(int n : list){
            if(map.get(n) > 0){
                return false;
            }
        }
        return true;
    }

    public <T> List<T> makeAList(T ...args){
        return new ArrayList<T>(Arrays.asList(args));
    }

    public int findMinDifference(List<String> timePoints) {
        int[] resourceArray = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String temp1 = timePoints.get(i);
            String[] temp2 = temp1.split(":");
            resourceArray[i] = Integer.parseInt(temp2[0]) * 60 + Integer.parseInt(temp2[1]);
        }
        Arrays.sort(resourceArray);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < resourceArray.length - 1; i++) {
            if(resourceArray[i] == resourceArray[i + 1]){
                return 0;
            } else {
                int temp3 = resourceArray[i + 1] - resourceArray[i];
                min = Math.min(min, temp3);
            }
        }
        int min1 = resourceArray[0] + 24 * 60;
        min1 = min1 - resourceArray[resourceArray.length - 1];
        min = Math.min(min, min1);
        return min;
    }

    public int getLongestSize(List<List<Integer>> dataList){
        if(dataList.get(0).size() == 0){
            return 0;
        }
        List<Integer> storageList = new ArrayList<Integer>();
        for(List<Integer> l : dataList){
            int n = 1;
            for(int i = 0; i < l.size() - 1; i++){
                if(!l.get(i).equals(l.get(i + 1))){
                    n++;
                } else {
                    if(n != 1) {
                        storageList.add(n);
                    }
                    n = 1;
                }
            }
            if(n != 1) {
                storageList.add(n);
            }
        }
        if(storageList.size() == 0){
            return 1;
        } else {
            int max = storageList.get(0);
            for(int n : storageList){
                max = Math.max(max, n);
            }
            return max;
        }
    }

    public int[][] reconstructQueue(int[][] people) {
        Map<Integer, List<Integer>> data = collatingData(people);
        List<List<Integer>> resultList = reconstructList(data);
        int[][] result = new int[people.length][2];
        for(int i = 0; i < resultList.size(); i++){
            result[i][0] = resultList.get(i).get(0);
            result[i][1] = resultList.get(i).get(1);
        }
        return result;
    }

    public List<List<Integer>> reconstructList(Map<Integer, List<Integer>> data) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> keyList = new ArrayList(data.keySet());
        for(int i = keyList.size() - 1; i >= 0; i--){
            List<Integer> valueList = data.get(keyList.get(i));
            for(int v : valueList){
                List<Integer> tempList = new ArrayList<Integer>();
                tempList.add(keyList.get(i));
                tempList.add(v);
                result.add(v, tempList);
            }
        }
        return result;
    }

    public Map<Integer, List<Integer>> collatingData(int[][] people){
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i = 0; i < people.length; i++) {
            if(!map.containsKey(people[i][0])) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(people[i][1]);
                map.put(people[i][0], list);
            } else {
                List<Integer> list = map.get(people[i][0]);
                list.add(people[i][1]);
                Collections.sort(list);
                map.put(people[i][0], list);
            }
        }
        return map;
    }

    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int low = 0;
        int high = tokens.length - 1;
        if(tokens.length == 0){
            return 0;
        }
        if(tokens.length == 1){
            if(tokens[0] <= power){
                return 1;
            } else {
                return 0;
            }
        } else {
            int result = 0;
            while(low <= high){
                if(low < high){
                    if(tokens[low] <= power){
                        power -= tokens[low];
                        result++;
                        low++;
                    } else if(tokens[low] > power && result != 0){
                        power += tokens[high];
                        result--;
                        high--;
                    } else if(tokens[low] > power && result == 0){
                        break;
                    }
                } else {
                    if(tokens[low] <= power){
                        result++;
                    }
                    break;
                }
            }
            return result;
        }
    }

    public int findMinArrowShots(int[][] points) {
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < i; j++){
                if(points[j][1] < points[i][0] || points[i][1] < points[j][0]){
                    continue;
                } else if(points[j][0] <= points[i][1] && points[j][1] >= points[i][1] && points[j][0] >= points[i][0]){
                    points[i][0] = points[j][0];
                    points[j][0] = 0;
                    points[j][1] = 0;
                } else if(points[j][0] <= points[i][0] && points[j][1] >= points[i][1]){
                    points[j][0] = 0;
                    points[j][1] = 0;
                } else if(points[j][0] >= points[i][0] && points[j][1] <= points[i][1]){
                    points[i][0] = points[j][0];
                    points[i][1] = points[j][1];
                    points[j][0] = 0;
                    points[j][1] = 0;
                } else if(points[j][0] <= points[i][0] && points[j][1] >= points[i][0] && points[j][1] <= points[i][1]){
                    points[i][1] = points[j][1];
                    points[j][0] = 0;
                    points[j][1] = 0;
                }
            }
        }
        int num = 0;
        for(int i = 0; i < points.length; i++){
            if(points[i][0] != 0 && points[i][1] != 0){
                num++;
            }
        }
        return num;
    }

    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : barcodes){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        Set<Integer> set = map.keySet();
        List<Integer> keys = new ArrayList<Integer>(set);
        int maxValue = map.get(keys.get(0));
        int maxKey = keys.get(0);
        for(int k : keys){
            int v = map.get(k);
            if(v > maxValue){
                maxKey = k;
                maxValue = v;
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < maxValue; i++){
            result.add(maxKey);
        }
        if(maxValue > barcodes.length / 2){
            int location = 1;
            for(int k : keys){
                if(k != maxKey){
                    for(int i = 0; i < map.get(k); i++){
                        if(location < barcodes.length){
                            result.add(location, k);
                            location += 2;
                        } else {
                            result.add(k);
                        }

                    }
                }
            }
        } else if(maxValue == barcodes.length / 2){
            int location = 0;
            for(int k : keys){
                if(k != maxKey){
                    for(int i = 0; i < map.get(k); i++){
                        if(location < barcodes.length){
                            result.add(location, k);
                            location += 2;
                        } else {
                            result.add(k);
                        }

                    }
                }
            }
        } else {
            int location = 0;
            for(int k : keys){
                if(k != maxKey){
                    for(int i = 0; i < map.get(k); i++){
                        if(location < barcodes.length){
                            result.add(location, k);
                            location += 2;
                        }
                        if(location >= result.size()){
                            location = 0;
                        }
                    }
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for(int i = 0; i < resultArray.length; i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                List<Integer> list = map.get(s.charAt(i));
                list.add(i);
                map.put(s.charAt(i), list);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                map.put(s.charAt(i), list);
            }
        }
        int result = 0;
        for(String word : words){
            int length = word.length();
            int endIndex = -1;
            boolean judge = true;
            for(int i = 0; i < length && judge; i++){
                if(!map.containsKey(word.charAt(i))){
                    judge = false;
                    break;
                } else {
                    List<Integer> storageList = map.get(word.charAt(i));
                    int left = 0;
                    int right = storageList.size() - 1;
                    while(left < right){
                        int mid = (left + right) / 2;
                        if(storageList.get(mid) > endIndex){
                            right = mid;
                        } else {
                            left = mid + 1;
                        }
                    }
                    if(right < 0 || storageList.get(right) <= endIndex){
                        judge = false;
                    } else {
                        endIndex = storageList.get(right);
                    }
                }
            }
            if(judge){
                result++;
            }
        }
        return result;
    }

    public int[] getQuery(String[] queries){
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            Map<Character, Integer> map = new TreeMap<Character, Integer>();
            for(int j = 0; j < queries[i].length(); j++){
                char t = queries[i].charAt(j);
                if(map.containsKey(t)){
                    int v = map.get(t);
                    v++;
                    map.put(t, v);
                } else {
                    map.put(t, 1);
                }
            }
            Collection<Integer> values = map.values();
            Integer firstValue = values.toArray(new Integer[0])[0];
            result[i] = firstValue;
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int firstIndex = 0;
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        while(firstIndex < nums.length - 2){
            int secondIndex = firstIndex + 1;
            int thirdIndex = nums.length - 1;
            while(secondIndex < thirdIndex){
                if((nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]) == 0){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[firstIndex]);
                    list.add(nums[secondIndex]);
                    list.add(nums[thirdIndex]);
                    set.add(list);
                    thirdIndex--;
                } else if((nums[firstIndex] + nums[secondIndex] + nums[thirdIndex]) < 0){
                    secondIndex++;
                } else {
                    thirdIndex--;
                }
            }
            firstIndex++;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>(set);
        return result;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int[] addNums = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < addNums.length; i++){
            sum += nums[i];
            addNums[i] = sum;
        }
        int index = -1;
        int result = 0;
        while(index < addNums.length){
            if(index == -1){
                for(int i = index + 1; i < addNums.length; i++){
                    if(addNums[i] >= target){
                        result = (i + 1);
                        break;
                    }
                }
                if(result == 0){
                    return result;
                }
            } else {
                for(int i = index + 1; i < addNums.length; i++){
                    int temp = addNums[i] - addNums[index];
                    if(temp >= target){
                        result = Math.min(result, (i - index));
                        break;
                    }
                }
            }
            index++;
        }
        return result;

    }

    public int lengthOfLIS(int[] nums) {
        List<List<Integer>> tempLists = makeLists(nums);
        int max = 0;
        for(List<Integer> list : tempLists){
            int length = list.size();
            max = Math.max(length, max);
        }
        return max;
    }

    public List<List<Integer>> makeLists(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int n : nums){
            if(result.size() == 0){
                List<Integer> list1 = new ArrayList<Integer>();
                list1.add(n);
                result.add(list1);
            } else {
                int judge = -1;
                for(int i = 0; i < result.size(); i++){
                    if(result.get(i).size() == 1){
                        if(result.get(i).get(0) >= n){
                            judge = -1;
                        } else {
                            judge = i;
                            result.get(i).add(n);
                        }
                    } else {
                        List<Integer> list2 = result.get(i);
                        if(n <= list2.get(0)){
                            judge = -1;
                        } else {
                            if(n > list2.get(list2.size() - 1)){
                                judge = i;
                                result.get(i).add(n);
                            } else {
                                List<Integer> list3 = new ArrayList<Integer>();
                                for(int n1 : list2){
                                    if(n1 < n){
                                        list3.add(n1);
                                    }
                                }
                                result.add(list3);
                            }

                        }
                    }
                }
                if(judge == -1){
                    List<Integer> list4 = new ArrayList<Integer>();
                    list4.add(n);
                    result.add(list4);
                }
            }
        }
        return result;
    }

    public int numFriendRequests(int[] ages) {
        int request = 0;
        Arrays.sort(ages);
        for(int i = 0; i < ages.length; i++){
            int age1 = ages[i];
            double limit1 = 0.5 * age1 + 7;
            for(int j = 0; j < ages.length; j++){
                if(i == j){
                } else {
                    int age2 = ages[j];
                    if(age2 > limit1 && age2 <= age1 && (age1 <= 100 || age2 >= 100)){
                        request++;
                    }
                }
            }
        }
        return request;
    }

    public int findNthDigit(int n) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int i = 1;
        int k = 9;
        long v = 9L;
        while(v <= Integer.MAX_VALUE){
            map.put(k, (int)v);
            i++;
            k = (int) (9 * Math.pow(10, (i - 1)) + k);
            v = (long) (i * 9 * Math.pow(10, (i - 1)) + v);
        }
        Set<Integer> set = map.keySet();
        List<Integer> keyList = new ArrayList<>(set);
        if(n <= keyList.get(0)){
            return n;
        }
        for (int j = 0; j < keyList.size(); j++) {
            if(n <= map.get(keyList.get(j))){
                k = keyList.get(j - 1);
                break;
            } else {
                k = keyList.get(j);
            }
        }
        int length = String.valueOf(k).length() + 1;
        int num = (n - map.get(k)) / length;
        int leftNum = (n - map.get(k)) % length;
        num += k;
        if(leftNum == 0){
            String[] num1 = String.valueOf(num).split("");
            return Integer.parseInt(num1[num1.length - 1]);
        }
        num++;
        String[] num2 = String.valueOf(num).split("");
        return Integer.parseInt(num2[leftNum - 1]);
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        int left = 0;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        while(left < nums.length || right < nums.length) {
            if (map.size() <= k && right < nums.length) {
                if (map.containsKey(nums[right])) {
                    int temp = map.get(nums[right]);
                    temp++;
                    map.put(nums[right], temp);
                } else {
                    map.put(nums[right], 1);
                }
                right++;
            } else {
                int temp1 = map.get(nums[left]);
                if (map.size() >= k) {
                    int mid = left;
                    Set<Integer> set = new HashSet<Integer>();
                    while (true) {
                        set.add(nums[mid]);
                        if (set.size() == k) {
                            break;
                        }
                        mid++;
                    }
                    if(map.size() > k){
                        result += (right - mid - 1);
                    } else {
                        result += (right - mid);
                    }

                }
                if (temp1 > 1) {
                    temp1--;
                    map.put(nums[left], temp1);
                } else if (temp1 == 1) {
                    map.remove(nums[left]);
                }
                left++;
            }
        }
        return result;
    }

    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < position.length; i++){
            map.put(position[i], speed[i]);
        }
        Set<Integer> set = map.keySet();
        List<Integer> keyList = new ArrayList<Integer>(set);
        int result = 1;
        if(position.length == 1){
            return result;
        }
        int j = keyList.size() - 1;
        for(int i = keyList.size() - 2; i >= 0; i--){
            int time1 = (target - keyList.get(j)) / map.get(keyList.get(j));
            int distance2 = keyList.get(j) - keyList.get(i);
            int velocity2 = map.get(keyList.get(i)) - map.get(keyList.get(j));
            if(velocity2 <= 0){
                result++;
                j = i;
            }
        }
        return result;
    }

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        long result = 0;
        for(int i = 0; i < nums.length; i++){
            int right = findRightIndex(nums, target, i);
            if(right == -1){
                result += 0;
            } else {
                result += sumIndex(i, right);
            }
        }
        return (int) result % 1000000007;
    }

    public long sumIndex(int left, int right){
        return (long)Math.pow(2, (right - left));
    }

    public int findRightIndex(int[] nums, int target, int left){
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left < right){

            if((nums[left] + nums[mid]) == target){
                return mid;
            } else {
                int mid1 = mid + 1;
                int mid2 = mid - 1;
                if((nums[left] + nums[mid]) > target) {
                    if(mid2 < left){
                        return -1;
                    } else {
                        if((nums[left] + nums[mid2]) < target){
                            return mid2;
                        } else {
                            mid--;
                        }
                    }
                } else {
                    if(mid1 == nums.length){
                        return mid;
                    } else {
                        if((nums[left] + nums[mid1]) > target){
                            return mid;
                        } else {
                            mid++;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public int removeCoveredIntervals(int[][] intervals) {
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for (int[] interval : intervals) {
            if (map.containsKey(interval[0])) {
                List<Integer> list = map.get(interval[0]);
                list.add(interval[1]);
                map.put(interval[0], list);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(interval[1]);
                map.put(interval[0], list);
            }
        }
        Set<Integer> set = map.keySet();
        List<Integer> keyList = new ArrayList<Integer>(set);
        for(int key : keyList){
            List<Integer> list = map.get(key);
            Collections.sort(list);
            //Collections.reverse(list);
            map.put(key, list);
        }
        System.out.println(map);
        int result = 1;
        for(int i = 0 ; i < keyList.size() - 1; i++){
            int max1 = map.get(keyList.get(i)).get(map.get(keyList.get(i)).size() - 1);
            int max2 = map.get(keyList.get(i + 1)).get(map.get(keyList.get(i + 1)).size() - 1);
            if(max1 < max2){
                result++;
            }
        }
        return result;
    }

    public int longestOnes(int[] nums, int k) {
        List<Integer> zeroIndex = new ArrayList<Integer>();
        int index = 0;
        int result = 0;
        int zeroCount = 0;
        while(index < nums.length){
            if(nums[index] == 1){
                index++;
            } else {
                zeroCount++;
                zeroIndex.add(index);
                if(zeroIndex.size() > k){
                    int temp = zeroIndex.get(zeroIndex.size() - 1) - zeroIndex.get(0);
                    if(zeroIndex.get(0) > 0){
                        int index2 = zeroIndex.get(0) - 1;
                        while(nums[index2] == 1){
                            temp++;
                            index2--;
                            if(index2 < 0){
                                break;
                            }
                        }
                    }
                    result = Math.max(temp, result);
                    zeroIndex.remove(0);
                }
                index++;
            }
        }
        if(zeroCount <= k){
            return nums.length;
        }
        return result;
    }

    public int[] platesBetweenCandles(String s, int[][] queries) {
        String[] data = s.split("");
        List<Integer> verticalIndex = new ArrayList<Integer>();
        for(int i = 0 ; i < data.length; i++){
            if(data[i].equals("|")){
                verticalIndex.add(i);
            }
        }
        int[] result = new int[queries.length];
        for(int i = 0; i < result.length; i++){
            result[i] = calDifferences(verticalIndex, queries[i][0], queries[i][1]);
        }
        return result;

    }

    private int calDifferences(List<Integer> verticalIndex, int start, int end){
        int left = findLeft(verticalIndex, start);
        int right = findRight(verticalIndex, end);
        if(left > right){
            return 0;
        }
        int leftIndex = verticalIndex.indexOf(left);
        int rightIndex = verticalIndex.indexOf(right);
        return (right - left - rightIndex + leftIndex);
    }

    private int findLeft(List<Integer> verticalIndex, int start){
        if(verticalIndex.contains(start)){
            return start;
        }
        int result = 0;
        int left = 0;
        int right = verticalIndex.size() - 1;
        while(left < right){
            int mid = left + right >> 1;
            if(verticalIndex.get(mid) > start){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        result = verticalIndex.get(left);
        return result;
    }

    private int findRight(List<Integer> verticalIndex, int end){
        if(verticalIndex.contains(end)){
            return end;
        }
        int result = 0;
        int left = 0;
        int right = verticalIndex.size() - 1;
        while(left < right){
            int mid = left + right >> 1;
            if(verticalIndex.get(mid) > end){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if(verticalIndex.get(right) > end){
            result = verticalIndex.get(right - 1);
        } else {
            result = verticalIndex.get(right);
        }

        return result;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            for(int j = i + 1; j < nums.length - 2; j++){
                long temp1 = nums[i] + nums[j];
                long target1 = target - temp1;
                int left = j + 1;
                int right = nums.length - 1;
                if((nums[left] + nums[right]) == target1){
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                }
                while(left < right){
                    if((nums[left] + nums[right]) > target1){
                        right--;
                    } else if((nums[left] + nums[right]) < target1){
                        left++;
                    } else {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        set.add(list);
                        left++;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }

    public int maxDistance(int[] nums1, int[] nums2) {
        int result = 0;
        for(int i = 0; i < nums1.length; i++){
            int left = i;
            int right = nums2.length - 1;
            if(nums2[left] < nums1[i]){

            } else {
                while(left < right){
                    int mid = left + right >> 1;
                    if(nums2[mid] >= nums1[i]){
                        left = mid + 1;
                        int temp = mid - i;
                        result = Math.max(temp, result);
                    } else if(nums2[mid] < nums1[i]){
                        right = mid;
                    }
                    if(left == right){
                        if(nums2[left] >= nums1[i]){
                            int temp = left - i;
                            result = Math.max(temp, result);
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    public int minOperations(int[] nums, int x) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            sum += n;
            min = Math.min(min, n);
        }
        sum = sum - x;
        if(sum < 0 || min > x){
            return -1;
        }
        int left = 0;
        int right = 0;
        int cal = 0;
        int result = 0;
        while(right < nums.length){
            if(cal < sum){
                cal += nums[right];
                right++;
            } else if(cal > sum){
                cal -= nums[left];
                left++;
            } else {
                result = Math.max(result, right - left);
                cal += nums[right];
                right++;
            }
        }
        return nums.length - result;
    }

    private int changeAtoB(String answerKey, int k, String b){
        String[] data = answerKey.split("");
        List<String> indexA = new ArrayList<String>();
        indexA.add("-1");
        int right = 0;
        int result = 0;
        int count = 0;
        while(right < data.length){
            if(data[right].equals(b)){
                right++;
            } else {
                indexA.add(right + "");
                count++;
                if(indexA.size() <= (k + 1)){
                    right++;
                } else {
                    int left = Integer.parseInt(indexA.get(0));
                    if(left == -1){
                        result = Math.max(result, right);
                    } else {
                        int t = right - left - 1;
                        result = Math.max(result, t);
                    }
                    indexA.remove(0);
                    right++;
                }
            }
        }
        if(count <= k){
            return data.length;
        }
        return result;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length > Math.ceil(hour)) return -1;
        int left = 1;
        int right = Integer.MAX_VALUE;
        while(left < right){
            int mid = left + (right - left >> 1);
            int flag = judge(dist, hour, mid);
            if(flag == 0){
                return mid;
            } else if(flag == 1){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    private int judge(int[] dist, double hour, int speed){
        double time = 0;
        for(int i = 0; i < dist.length - 1; i++){
            double t = (double) dist[i] / speed;
            time += Math.ceil(t);
        }
        time += (double) dist[dist.length - 1] / speed;
        return Double.compare(time, hour);
    }

    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int result = 0;
        while(left < right){
            if(nums[left] + nums[right] > k){
                right--;
            } else if(nums[left] + nums[right] < k){
                left++;
            } else {
                result++;
                left++;
                right--;
            }
        }
        return result;
    }

    public int jump(int[] nums) {
        int index = 0;
        int result = 1;
        int jumpIndex = 0;
        if(nums.length == 1){
            return 0;
        }
        while(index < nums.length){
            int range = nums[index];
            if(index == nums.length - 1){
                break;
            }
            if((index + range) < nums.length - 1){
                for(int i = index; i < (index + range); i++){
                    jumpIndex = Math.max(jumpIndex, (nums[i] + i));
                }
                index = jumpIndex;
                result++;
            } else {
                for(int i = index; i < nums.length; i++){
                    jumpIndex = Math.max(jumpIndex, (nums[i] + i));
                }
                if(jumpIndex >= nums.length){
                    index = nums.length - 1;
                } else {
                    index = jumpIndex;
                    result++;
                }

            }
        }
        return result;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int positive = 0;
        int negative = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int[] data = new int[gas.length];
        for(int i = 0; i < data.length; i++){
            data[i] = gas[i] - cost[i];
            if(data[i] >= 0){
                positive += data[i];
            }
            if(data[i] < 0){
                negative += data[i];
            }
            if(data[i] < min){
                min = data[i];
                minIndex = i;
            }
        }
        if(positive + negative < 0){
            return -1;
        }
        if(min >= 0){
            return 0;
        }
        int count = 0;
        int startIndex = 0;
        if(minIndex != data.length - 1){
            startIndex = minIndex + 1;
        }
        int sum = 0;
        int index= startIndex;
        while(count < data.length){

            sum += data[index];
            if(sum < 0){
                count = 0;
                sum = 0;
                startIndex++;
                if(startIndex == data.length){
                    startIndex = 0;
                }
                index= startIndex;
            } else {
                index++;
                if(index == data.length){
                    index = 0;
                }
                count++;
            }
        }
        return startIndex;
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        for(int i = 0; i < intervals.length; i++){
            if(map.containsKey(intervals[i][1])){
                map.get(intervals[i][1]).add(intervals[i][0]);
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(intervals[i][0]);
                map.put(intervals[i][1], temp);
            }
        }
        int[][] data = new int[intervals.length][2];
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        int tempNum = 0;
        for(int i = 0; i < keyList.size(); i++){
            List<Integer> list = map.get(keyList.get(i));
            Collections.sort(list);
            for(int j = list.size() - 1; j >= 0; j--){
                data[tempNum][0] = list.get(j);
                data[tempNum][1] = keyList.get(i);
                tempNum++;
            }
        }
        int count = 1;
        int end = data[0][1]; // 记录区间分割点
        for (int i = 1; i < data.length; i++) {
            if (end <= data[i][0]) {
                end = data[i][1];
                count++;
            }
        }

        return data.length - count;
    }

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int n : nums){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        List<List<Integer>> storage = new ArrayList<List<Integer>>();
        int count = 0;
        for(int i = 0; i < keyList.size() - 1; i++){
            if(map.get(keyList.get(i)) != null){
                if(keyList.get(i + 1) - keyList.get(i) == 1 && count < 2 && map.get(keyList.get(i)) > 0 && map.get(keyList.get(i + 1)) > 0){
                    count++;
                }
                if(count == 2){
                    count = 0;
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(keyList.get(i - 1));
                    list.add(keyList.get(i));
                    list.add(keyList.get(i + 1));
                    storage.add(list);
                    int t1 = map.get(keyList.get(i - 1));
                    t1--;
                    if(t1 == 0){
                        map.remove(keyList.get(i - 1));
                    } else {
                        map.put(keyList.get(i - 1), t1);
                    }
                    int t2 = map.get(keyList.get(i));
                    t2--;
                    if(t2 == 0){
                        map.remove(keyList.get(i));
                    } else {
                        map.put(keyList.get(i), t2);
                    }
                    int t3 = map.get(keyList.get(i + 1));
                    t3--;
                    if(t3 == 0){
                        map.remove(keyList.get(i + 1));
                    } else {
                        map.put(keyList.get(i + 1), t3);
                    }
                }
            }

        }
        if(map.isEmpty()){
            return true;
        } else {
            List<Integer> mapLeft = new ArrayList<Integer>(map.keySet());
            for(List<Integer> storageLeaf : storage){
                for(int i = 0; i < mapLeft.size(); i++){
                    if(mapLeft.get(i) - storageLeaf.get(storageLeaf.size() - 1) == 1){
                        storageLeaf.add(mapLeft.get(i));
                        int t = map.get(mapLeft.get(i));
                        t--;
                        if(t == 0){
                            map.remove(mapLeft.get(i));
                        } else {
                            map.put(mapLeft.get(i), t);
                        }
                    }
                }
                mapLeft = new ArrayList<Integer>(map.keySet());
            }
        }
        return map.isEmpty();
    }

    public int findLongestChain(int[][] pairs) {
        Map<Integer, List<Integer>> map = new TreeMap<Integer, List<Integer>>();
        int result = 0;
        for(int i = 0; i < pairs.length; i++){
            if(map.containsKey(pairs[i][1])){
                map.get(pairs[i][1]).add(pairs[i][0]);
            } else {
                List<Integer> list = new ArrayList<Integer>();
                list.add(pairs[i][0]);
                map.put(pairs[i][1], list);
            }
        }
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        int judge = keyList.get(0);
        for(int i = 1; i < keyList.size(); i++){
            List<Integer> list = map.get(keyList.get(i));
            Collections.sort(list);
            int minIndex = -2000;
            for(int n : list){
                if(judge < n){
                    minIndex = n;
                    judge = keyList.get(i);
                    break;
                }
            }
            if(minIndex != -2000){
                result++;
            }
        }
        result++;
        return result;
    }

    public int maxSatisfaction(int[] satisfaction) {
        Integer[] temp1 = new Integer[satisfaction.length];
        for (int i = 0; i < satisfaction.length; i++) {
            temp1[i] = satisfaction[i];
        }
        Arrays.sort(temp1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

        });
        for (int i = 0; i < satisfaction.length; i++) {
            satisfaction[i] = temp1[i];
        }
        int add = satisfaction[0];
        int result = 0;
        int temp = satisfaction[0];
        result = Math.max(result, temp);
        for(int i = 1; i < satisfaction.length; i++){
            add += satisfaction[i];
            temp += add;
            result = Math.max(result, temp);
        }
        return result;
    }

    public String longestDiverseString(int a, int b, int c) {
        String maxString = judgeMaxString(a, b, c);
        StringBuilder result = null;
        if(maxString.equals("a")){
            a = changeMaxStringNum(maxString, a, b, c);
            int t = Math.max(b, c);
            a -= t;
            result = makeOringinalString(t, b, c);
            if(a == 0){
                return result.toString();
            } else {
                result = makefinalString(result, "a", a);
                return result.toString();
            }
        } else if(maxString.equals("b")){
            b = changeMaxStringNum(maxString, a, b, c);
            int t = Math.max(a, c);
            b -= t;
            result = makeOringinalString(a, t, c);
            if(b == 0){
                return result.toString();
            } else {
                result = makefinalString(result, "b", b);
                return result.toString();
            }
        } else {
            c = changeMaxStringNum(maxString, a, b, c);
            int t = Math.max(a, b);
            c -= t;
            result = makeOringinalString(a, b, t);
            if(c == 0){
                return result.toString();
            } else {
                result = makefinalString(result, "c", c);
                return result.toString();
            }
        }

    }

    public StringBuilder makefinalString(StringBuilder originalString, String word, int num){
        if(num == 1){
            originalString.append(word);
            return originalString;
        } else {
            int index = 0;
            while(num > 0){
                if(index == originalString.length()){
                    originalString.append(word);
                    index++;
                    num--;
                } else {
                    if(Character.toString(originalString.charAt(index)).equals(word)){
                        originalString.insert(index, word);
                        index += 3;
                        num--;
                    } else {
                        if(num == 1){
                            originalString.insert(index, word);
                        } else {
                            originalString.insert(index, word);
                            originalString.insert(index, word);
                        }
                        index += 3;
                        num -= 2;
                    }
                }

            }
            return originalString;
        }
    }

    public StringBuilder makeOringinalString(int a, int b, int c){
        StringBuilder originalString = new StringBuilder();
        while(a > 0 || b > 0 || c > 0){
            if(a > 0 && b > 0 && c > 0){
                originalString.append("a");
                originalString.append("b");
                originalString.append("c");
                a--;
                b--;
                c--;
            } else if(a == 0 && b > 0 && c > 0) {
                originalString.append("b");
                originalString.append("c");
                b--;
                c--;
            } else if(a > 0 && b == 0 && c > 0) {
                originalString.append("a");
                originalString.append("c");
                a--;
                c--;
            } else if(a > 0 && b > 0 && c == 0) {
                originalString.append("a");
                originalString.append("b");
                a--;
                b--;
            } else if(a == 0 && b == 0 && c > 0) {
                originalString.append("c");
                c--;
            } else if(a == 0 && b > 0 && c == 0) {
                originalString.append("b");
                b--;
            } else if(a > 0 && b == 0 && c == 0) {
                originalString.append("a");
                a--;
            }
        }
        return originalString;
    }

    public int changeMaxStringNum(String maxString, int a, int b, int c){
        if(maxString.equals("a")){
            int max = (b + c + 1) * 2;
            if(max < a){
                return max;
            } else {
                return a;
            }
        } else if(maxString.equals("b")){
            int max = (a + c + 1) * 2;
            if(max < b){
                return max;
            } else {
                return b;
            }
        } else {
            int max = (a + b + 1) * 2;
            if(max < c){
                return max;
            } else {
                return c;
            }
        }
    }

    public String judgeMaxString(int a, int b, int c){
        if(a > b){
            if(b > c){
                return "a";
            } else {
                if(c > a){
                    return "c";
                } else {
                    return "a";
                }
            }
        } else {
            if(a > c){
                return "b";
            } else {
                if(b > c){
                    return "b";
                } else {
                    return "c";
                }
            }
        }
    }

    public int minInsertions(String s) {
        String[] data = s.split("");
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        boolean flag = false;
        if(data[0].equals("(")){
            flag = true;
        }
        int result = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i].equals("(")){
                flag = true;
                if(count2 > 0 && count1 > 0){
                    count2--;
                    count1--;
                    result++;
                }
                if(count1 == 1){
                    result++;
                    count1 = 0;
                }
                if(count1 < 0){
                    int t = Math.abs(count1);
                    if(t % 2 == 0){
                        result += (t / 2);
                    } else {
                        int t1 = ((t - 1) / 2);
                        t1 += 2;
                        result += t1;
                    }
                    count1 = 0;
                }
                count2++;
                count1 += 2;
            }
            if(flag && data[i].equals(")")){
                count1--;
            }
            if(!flag){
                count++;
            }
        }

        if(count > 0){
            if(count % 2 == 0){
                result += (count / 2);
            } else {
                int t = ((count - 1) / 2);
                t += 2;
                result += t;
            }
        }
        if(count1 > 0){
            result += count1;
        }
        if(count1 < 0){
            int t = Math.abs(count1);
            if(t % 2 == 0){
                result += (t / 2);
            } else {
                int t1 = ((t - 1) / 2);
                t1 += 2;
                result += t1;
            }
        }
        return result;
    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int[] diff = new int[heights.length - 1];
        for(int i = 0; i < heights.length - 1; i++){
            diff[i] = heights[i + 1] - heights[i];
            if(diff[i] < 0){
                diff[i] = 0;
            }
        }
        int t1 = bricksFirst(diff, bricks, ladders);
        int t2 = laddersFirst(diff, bricks, ladders);
        return Math.max(t1, t2);
    }

    public int bricksFirst(int[] diff, int bricks, int ladders){
        int result = 0;
        for(int n : diff){
            if(n <= 0){
                result++;
            } else {
                if(n <= bricks){
                    result++;
                    bricks -= n;
                } else {
                    if(ladders > 0){
                        result++;
                        ladders--;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public int laddersFirst(int[] diff, int bricks, int ladders){
        int result = 0;
        for(int n : diff){
            if(n <= 0){
                result++;
            } else {
                if(ladders > 0){
                    result++;
                    ladders--;
                } else {
                    if(n <= bricks){
                        bricks -= n;
                        result++;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        Map<Integer, Integer> server = new HashMap<Integer, Integer>();
        for(int i = 0; i < k; i++){
            server.put(i, 0);
        }
        List<Integer> serverList = new ArrayList<Integer>(server.keySet());
        List<Integer> countList = new ArrayList<Integer>();
        countList = getCountList(server, serverList, countList, arrival, load);
        Map<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();
        int max = -1;
        for(int i = 0; i < countList.size(); i++){
            max = Math.max(max, countList.get(i));
            List<Integer> list;
            if(result.containsKey(countList.get(i))){
                list = result.get(countList.get(i));
            } else {
                list = new ArrayList<Integer>();
            }
            list.add(i);
            result.put(countList.get(i), list);
        }

        return result.get(max);
    }

    public List<Integer> getCountList(Map<Integer, Integer> server, List<Integer> serverList
            , List<Integer> countList, int[] arrival, int[] load){
        int lastArrivalTime = arrival[0];
        int freeServer = 0;
        for(int i = 0; i < arrival.length; i++){

            if(i > 0){
                lastArrivalTime = arrival[i - 1];
                for(int n : serverList){
                    if(server.get(n) != 0){
                        int serverTime = server.get(n);
                        serverTime = serverTime - (arrival[i] - lastArrivalTime);
                        if(serverTime < 0){
                            serverTime = 0;
                        }
                        server.put(n, serverTime);
                    }
                }
                int count1 = serverList.size();
                boolean flag = false;
                if(server.get(i % serverList.size()) == 0){
                    freeServer = i % serverList.size();
                    flag = true;
                } else {
                    freeServer = i % serverList.size();
                    for (int j = 1; j < count1; j++) {
                        if(freeServer + j >= serverList.size()){
                            if(server.get(freeServer + j - serverList.size()) == 0){
                                freeServer = freeServer + j - serverList.size();
                                flag = true;
                                break;
                            }
                        } else {
                            if(server.get(freeServer + j) == 0){
                                freeServer = freeServer + j;
                                flag = true;
                                break;
                            }
                        }

                    }
                }

                if(flag){
                    server.put(freeServer, load[i]);
                    if (freeServer > countList.size() - 1) {
                        countList.add(1);
                    } else {
                        int count = countList.get(freeServer);
                        count++;
                        countList.set(freeServer, count);
                    }
                    if(freeServer == serverList.size()){
                        freeServer = 0;
                    }
                }

            }
            if(i == 0){
                server.put(0, load[0]);
                countList.add(1);
            }
        }
        return countList;
    }

    public int wateringPlants(int[] plants, int capacity) {
        int result = 0;
        int storage = capacity;
        for(int i = 0; i < plants.length; i++){
            if(storage >= plants[i]){
                storage -= plants[i];
                result++;

            } else {
                storage = capacity;
                result += (2 * (i + 1) - 1);
                storage -= plants[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {1,1};

        int[][] nums3 = {{1,3,1},{1,5,1},{4,2,1}};
        int[] nums4 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = new Test33().findLength(nums1, nums2);
        int result1 = new Test33().minPathSum(nums3);
        int result2 = new Test33().trap(nums4);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();
        list1.add(-1);
        list2.add(2);
        list2.add(3);
        list3.add(1);
        list3.add(-1);
        list3.add(-3);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        int result3 = new Test33().minimumTotal(list);
        int[] nums5 = {1,3,2,5,4};
        int[] nums6 = {2,6,4,8,10,9,15};
        int result4 = new Test33().findUnsortedSubarray(nums6);
        int[] nums7 = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        int result5 = new Test33().minMoves2(nums7);
        int[] nums8 = {1, 3};
        int[] result6 = new Test33().searchRange(nums8, 1);
        String haystack = "leetcode", needle = "leeto";
        int result7 = new Test33().strStr(haystack, needle);
        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(4);
        list4.add(2);
        list4.add(6);
        list4.add(3);
        list4.add(1);
        int result8 = new Test33().getMinimumDifference(list4);
        int[] nums9 = {-2147483648,1,1};
        int result9 = new Test33().thirdMax(nums9);
        int[] nums10 = {1,2,3,6,2,3,4,7,8};
        boolean result10 = new Test33().isNStraightHand(nums10, 3);
        List<List<Integer>> list5 = new ArrayList<List<Integer>>();
        List<Integer> list6 = new ArrayList<Integer>();
        List<Integer> list7 = new ArrayList<Integer>();
        List<Integer> list8 = new ArrayList<Integer>();
        list6.add(1);
        list6.add(2);
        list6.add(1);
        list6.add(2);
        list7.add(1);
        list7.add(2);
        list7.add(2);
        list8.add(2);
        list5.add(list6);
        list5.add(list7);
        list5.add(list8);
        int result11 = new Test33().getLongestSize(list5);
        int[][] people = {{7,0}, {4,4},{7,1},{5,0},{6,1},{5,2}};
        people = new Test33().reconstructQueue(people);
        int[] nums11 = {200, 100};
        int result12 = new Test33().bagOfTokensScore(nums11, 150);
        int[][] nums12 = {{4289383,51220269},{81692777,96329692},{57747793,81986128},
                {19885386,69645878},{96516649,186158070},{25202362,75692389},{83368690,85888749},{44897763,112411689},
                {65180540,105563966},{4089172,7544908}};
        int result13 = new Test33().findMinArrowShots(nums12);
        int[] nums13 = {1,1,1,2,2};
        int[] result14 = new Test33().rearrangeBarcodes((nums13));
        String[] nums14 = {"zaaaz"};
        int[] result15 = new Test33().getQuery(nums14);
        String[] nums15 = "hello".split("");
        int[] nums16 = {-1,0,1,2,-1,-4};
        int[] nums17 = {2,3,1,2,4,3};
        int[] nums18 = {10,9,2,5,3,7,101,18};
        int[] nums19 = {101,56,69,48,30};
        int result16 = new Test33().findNthDigit(Integer.MAX_VALUE);
        int[] nums20 = {1,2,1,2,3};
        int[] nums21 = {4,0,5,3,1,2};
        int[] nums22 = {6,10,9,6,7,2};
        int[] nums23 = {2,3,3,4,6,7};
        int[][] nums24 = {{1,4},{3,6},{2,8},{3,9},{3,8}};
        int[] nums25 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int[][] nums26 = {{4, 10}};
        int[] nums27 = {1000000000,1000000000,1000000000,1000000000};
        int[] nums28 = {55,30,5,4,2};
        int[] nums29 = {100,20,10,10,5};
        int[] nums30 = {1,1,4,2,3};
        int[] nums31 = {1,3,2};
        int[] nums32 = {1,3,2,4};
        int[] nums33 = {1,2};
        int[] nums34 = {5,1,2,3,4};
        int[] nums35 = {4,4,1,5,1};
        int[][] nums36 = {{1,2},{2,3},{3,4},{1,3}};
        int[] nums37 = {1,2,3,3,4,4,5,5};
        int[][] nums38 = {{5,9},{-1,8},{-6,-2},{8,9},{4,8},{3,6},
                {2,6},{5,9},{-1,6},{-8,-7}};
        int[] nums39 = {4,2,7,6,9,14,12};
        int[] nums40 = {2,3,4,8};
        int[] nums41 = {3,2,4,3};
        int[] nums42 = {2,2,3,3};
        System.out.println(new Test33().wateringPlants(nums42, 5));
    }
}
