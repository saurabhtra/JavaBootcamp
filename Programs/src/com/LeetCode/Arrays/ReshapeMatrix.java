package com.LeetCode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

// [Reshape the Matrix](https://leetcode.com/problems/reshape-the-matrix/)
public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };
        int r = 2, c =6;
//        System.out.println(Arrays.toString(matrixReshape(mat, r,c)));
        matrixReshape(mat, r,c);
    }
    static void matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
//        for (int[] row: ans) {
//            for (int num: row) {
//                num = 0;
//            }
//        }


        if(r*c != mat.length * mat[0].length || (r == 0 && c == 0)){
//            return mat;
            return;
        }

        else{
            int col = 0;
            int row = 0;
            for(int i = 0; i < mat.length;i++){
                for(int j = 0; j< mat[i].length;j++){
                    ans[row][col] = mat[i][j];
                    System.out.println( ans[row][col] + "  " + mat[i][j]);
                    col++;
//
                    if(col == c){
                        row++;
                        col = 0;
                    }
                    //break condition
                    if(col > c){
//                        return mat;
                        return;
                    }

                }
                System.out.println();

            }
        }
        for (int[] row: ans) {
            for (int num: row) {
                System.out.print(" " + num + " ");
            }
            System.out.println();
        }
//        return ans;
            return;
    }
}
