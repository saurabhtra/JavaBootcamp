package com.LeetCode.Arrays;

import java.util.Arrays;

public class CellsWithOddValueInMatrix {
    public static void main(String[] args) {
        int[][] indices = {{0,1}, {1,1}};
        int m = 2;
        int n = 3;
        int[][] mat = new int[m][n];
//        for (int[] row: mat
//             ) {
//            System.out.println(Arrays.toString(row));
//
//        }

        for(int[] row : indices){
            int r = row[0];
//            System.out.println("r" + r);
//            System.out.println(Arrays.toString(mat[r]));
            for (int i = 0; i < mat[r].length; i++) {
                mat[r][i] += 1;

            }
            int c = row[1];
            for(int[] x : mat){
                x[c] += 1;
            }
        }
        for (int[] row: mat
        ) {
            System.out.println(Arrays.toString(row));

        }
    }
}

