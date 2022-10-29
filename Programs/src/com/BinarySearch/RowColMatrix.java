package com.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {11,21,31,45},
                {15,25,36,48},
                {18,29,39,50},

        };
        int target = 31;
        System.out.println(Arrays.toString(search(matrix,target)));

    }
    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[] { r, c};
            }
            else if(arr[r][c] > target){
                c--;

            }
            else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
