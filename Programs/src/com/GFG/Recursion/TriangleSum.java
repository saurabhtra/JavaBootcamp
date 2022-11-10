package com.GFG.Recursion;
//https://www.geeksforgeeks.org/sum-triangle-from-array/

import java.util.Arrays;

/*
Given an array of integers, print a sum triangle from it such that the first level has all array elements.
From then, at each level number of elements is one less than the previous level and elements at the level
is be the Sum of consecutive two elements in the previous level.
Example :
Input : A = {1, 2, 3, 4, 5}
Output : [48]
         [20, 28]
         [8, 12, 16]
         [3, 5, 7, 9]
         [1, 2, 3, 4, 5]
 */
public class TriangleSum {
    public static void main(String[] args) {
        int[] A = { 1,2,3,4,5};
        printTraingle(A);
    }
    static void printTraingle(int[] A){
        //base condition
        // if Array length is 0 or 1 just print it
        if(A.length < 2) {
            System.out.println(Arrays.toString(A));
            return;
        }
        //else create a new buffer of length = A.length - 1
        //to store the sum of consecutive numbers
        int[] temp = new int[A.length - 1];
        for (int i = 0; i < A.length -1; i++) {
            temp[i] = A[i] + A[i + 1];

        }
        //and the pass this new buffer array to new fucntion call
        printTraingle(temp);
        //in the last print the original array
        System.out.println(Arrays.toString(A));

    }
}
