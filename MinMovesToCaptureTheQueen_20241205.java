package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinMovesToCaptureTheQueen_20241205 {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if (a == c && c == e) {
            if (b < d && d < f) {
                return 2;
            } else if (f < d && d < b) {
                return 2;
            } else {
                return 1;
            }
        }
        if (b == d && d == f) {
            if (a < c && c < e) {
                return 2;
            } else if (e < c && c < a) {
                return 2;
            } else {
                return 1;
            }
        }
        if (a == e || b == f) {
            return 1;
        }
        if (c > a && a > e && d > b && b > f) {
            if ((d - b) / (c - a) == (f - b) / (e - a) && (f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 2;
            } else if ((d - b) / (c - a) != (f - b) / (e - a) && (f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 1;
            }
        } else if (c < a && a < e && d < b && b < f) {
            if ((d - b) / (c - a) == (f - b) / (e - a) && (f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 2;
            } else if ((d - b) / (c - a) != (f - b) / (e - a) && (f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 1;
            }
        } else if (c > a && a > e && d < b && b < f) {
            if ((d - b) / (c - a) == (f - b) / (e - a) && (f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 2;
            } else if ((d - b) / (c - a) != (f - b) / (e - a) && (f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 1;
            }
        } else if (c < a && a < e && d > b && b > f) {
            if ((d - b) / (c - a) == (f - b) / (e - a) && (f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 2;
            } else if ((d - b) / (c - a) != (f - b) / (e - a) && (f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 1;
            }
        } else if (a > c && c > e && b > d && d > f) {
            if ((f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 1;
            } else {
                return 2;
            }
        } else if (a < c && c < e && b < d && d < f) {
            if ((f - d) / (e - c) == 1 && (f - d) % (e - c) == 0) {
                return 1;
            } else {
                return 2;
            }
        } else if (a > c && c > e && b < d && d < f) {
            if ((f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 1;
            } else {
                return 2;
            }
        } else if (a < c && c < e && b > d && d > f) {
            if ((f - d) / (e - c) == -1 && (f - d) % (e - c) == 0) {
                return 1;
            } else {
                return 2;
            }
        }
        if(e != c){
            if (((f - d) / (e - c) == -1 || (f - d) / (e - c) == 1) && (f - d) % (e - c) == 0) {
                return 1;
            } else {
                return 2;
            }
        }
        return 2;
    }

    public int fro(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fro(n - 1) + fro(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(new MinMovesToCaptureTheQueen_20241205().minMovesToCaptureTheQueen(4,5,6,8,2,1));
        System.out.println(new MinMovesToCaptureTheQueen_20241205().fro(10));
    }
}
