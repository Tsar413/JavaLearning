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
        System.out.println(Arrays.toString(result14));
    }
}
