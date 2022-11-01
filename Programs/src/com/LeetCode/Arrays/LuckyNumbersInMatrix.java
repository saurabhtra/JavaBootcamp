package com.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//[Lucky Number In a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
public class LuckyNumbersInMatrix {
    public static void main(String[] args) {
        int[][] matrix =  {{56216},{63251},{75772},{1945},{27014}};//{
//                {3, 7,  8 },
//                {9, 11, 13},
//                {15,16,17 },
//
//        };
        for (int n: luckNumbers(matrix)
             ) {
            System.out.println(n);

        }
    }
    static List<Integer> luckNumbers(int[][] mat){
        //as all values are distinct

         List<Integer> lucky = new ArrayList<Integer>();
        List<Integer> row = new ArrayList<Integer>();
        List<Integer> col = new ArrayList<Integer>();

        for (int[] ints : mat) {
            int rmin = Integer.MAX_VALUE;
            for (int anInt : ints) {
                rmin = Math.min(rmin, anInt);
            }
            row.add(rmin);

        }
//        for (int i = 0; i < row.size(); i++) {
//            System.out.println(row.get(i));
//
//        }
        for (int c = 0; c < mat[0].length; c++) {
            int cmax = Integer.MIN_VALUE;
            for (int[] ints : mat) {
                cmax = Math.max(cmax, ints[c]);
            }
            col.add(cmax);
        }
        for (Integer integer : row) {
            for (Integer value : col) {
//                System.out.println("ISEqual : " + row.get(i) + " , " + col.get(j));
                if (integer.equals(value)) {
                    lucky.add(integer);
                }

            }


        }
//        System.out.println(col.get(0) + "   column  ");
//        for (int num :row
//        ) {
//            System.out.print(num + "  ");
//
//        }

        return lucky;
    }
}
