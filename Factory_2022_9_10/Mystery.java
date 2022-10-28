package com.company.javaRelearn.Factory_2022_9_10;

public class Mystery {
    public static int c = 0;
     public static void main(String[] args) {
        int[] a = {8,1,-3,12,4};
        System.out.println(go(a,0,a.length));
        }

        public static int go(int[] a,int le,int ri) {
        c += 1;
            System.out.println(c);
        if(ri - le <= 1) {
            return a[le];
            }
        else {
            int cp = le+(ri-le)/2;
            int m1 = go(a,le,cp);
            int m2 = go(a,cp,ri);
            if(m1 > m2){
                return m1;
                }else {
                return m2;
                }
            }
        }

}
