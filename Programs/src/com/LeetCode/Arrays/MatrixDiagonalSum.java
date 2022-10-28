package com.LeetCode.Arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        int len = mat.length -1;
        for (int i = 0, j = len; i < len + 1; i++) {
            if( i == j){
                sum += mat[i][j];
            }
            else {
                sum = sum+ mat[i][i] + mat[i][j];
            }
            j--;


        }
        System.out.println("Sum : " + sum);
    }
}
