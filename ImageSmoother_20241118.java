package com.company.javaRelearn;

public class ImageSmoother_20241118 {
    public int[][] imageSmoother(int[][] img) {
        int[][] result = new int[img.length][img[0].length];
        int m = img.length - 1;
        int n = img[0].length - 1;
        if(m == 1 && n == 1){
            return img;
        } else if(m == 1){
            for (int i = 0; i < img[0].length; i++) {
                if(i == 0){
                    int temp = img[0][0] + img[0][1];
                    result[0][0] = (int) Math.floor(temp / 2.0);
                } else if(i == n){
                    int temp = img[0][n] + img[0][n - 1];
                    result[0][n] = (int) Math.floor(temp / 2.0);
                } else {
                    int temp = img[0][n] + img[0][n - 1] + img[0][n + 1];
                    result[0][i] = (int) Math.floor(temp / 3.0);
                }
            }
            return result;
        } else if(n == 1){
            for (int i = 0; i < img.length; i++) {
                if(i == 0){
                    int temp = img[0][0] + img[1][0];
                    result[0][0] = (int) Math.floor(temp / 2.0);
                } else if(i == n){
                    int temp = img[m][0] + img[m - 1][0];
                    result[m][0] = (int) Math.floor(temp / 2.0);
                } else {
                    int temp = img[m][0] + img[m - 1][0] + img[m + 1][0];
                    result[i][0] = (int) Math.floor(temp / 3.0);
                }
            }
            return result;
        } else {
            for (int i = 0; i < img.length; i++) {
                for (int j = 0; j < img[0].length; j++) {
                    if(i == 0 && j == 0){
                        int temp = img[0][0] + img[0][1] + img[1][0] + img[1][1];
                        result[0][0] = (int) Math.floor(temp / 4.0);
                    } else if(i == 0 && j == n){
                        int temp = img[0][n] + img[0][n - 1] +
                                img[1][n] + img[1][n - 1];
                        result[0][n] = (int) Math.floor(temp / 4.0);
                    } else if(i == m && j == n){
                        int temp = img[m][n] + img[m][n - 1] +
                                img[m - 1][n] + img[m - 1][n - 1];
                        result[m][n] = (int) Math.floor(temp / 4.0);
                    } else if(i == m && j == 0){
                        int temp = img[m][0] + img[m][1] +
                                img[m - 1][0] + img[m - 1][1];
                        result[m][0] = (int) Math.floor(temp / 4.0);
                    } else if(i == 0){
                        int temp = img[0][j] + img[0][j - 1] + img[0][j + 1] +
                                img[1][j] + img[1][j - 1] + img[1][j + 1];
                        result[0][j] = (int) Math.floor(temp / 6.0);
                    } else if(i == m){
                        int temp = img[m][j] + img[m][j - 1] + img[m][j + 1] +
                                img[m - 1][j] + img[m - 1][j - 1] + img[m - 1][j + 1];
                        result[m][j] = (int) Math.floor(temp / 6.0);
                    } else if(j == 0){
                        int temp = img[i][0] + img[i - 1][0] + img[i + 1][0] +
                                img[i][1] + img[i - 1][1] + img[i + 1][1];
                        result[i][0] = (int) Math.floor(temp / 6.0);
                    } else if(j == n){
                        int temp = img[i][n] + img[i - 1][n] + img[i + 1][n] +
                                img[i][n - 1] + img[i - 1][n - 1] + img[i + 1][n - 1];
                        result[i][n] = (int) Math.floor(temp / 6.0);
                    } else {
                        int temp = img[i][j] + img[i - 1][j] + img[i + 1][j] +
                                img[i][j - 1] + img[i][j + 1] + img[i - 1][j - 1] +
                                img[i + 1][j + 1] + img[i + 1][j - 1] + img[i - 1][j + 1];
                        result[i][j] = (int) Math.floor(temp / 9.0);
                    }
                }
            }
            return result;
        }
    }
}
