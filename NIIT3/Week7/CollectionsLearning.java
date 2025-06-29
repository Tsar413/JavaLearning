package com.company.javaRelearn.NIIT3.Week7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CollectionsSort{
    public void sortCollections(List<Integer> list){
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list);
    }

    public void sortCollections2(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);
    }

    public void sortCollections3(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    for (int i = 0; i < o1.length(); i++) {
                        if(o1.charAt(i) != o2.charAt(i)){
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                    return 0;
                } else {
                    return o1.length() - o2.length();
                }
            }
        });
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 9, 4, 7, 5);
        new CollectionsSort().sortCollections(list);

        List<String> list1 = Arrays.asList("aedfa", "fweagfv", "agwawe");
        new CollectionsSort().sortCollections2(list1);

        List<String> list2 = Arrays.asList("aa", "cb", "b");
        new CollectionsSort().sortCollections3(list2);
    }
}

class ArraysSort{
    public void arraysSort(int[][] array){
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o2[1] - o1[1];
            }
        });
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{152, 28}, {3293, 50}, {2783, 40}, {212, 40}, {321, 45}};
        ArraysSort arraysSort = new ArraysSort();
        arraysSort.arraysSort(array);
    }
}

public class CollectionsLearning {
}
