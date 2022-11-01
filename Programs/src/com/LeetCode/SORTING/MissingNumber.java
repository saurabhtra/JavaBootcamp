package com.LeetCode.SORTING;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */



// im using cyclic sort here ...

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingnumber(nums));
    }
    static int missingnumber(int[] arr){
        //sorting the given array inplace(cyclic sort)
        int j  = 0;
        while (j < arr.length ){
            int correct = arr[j]; //as numbers are starting form 0 to n so index == value
            //arr[j] < arr.length condition to ignore the values with are greater than tha last index
            //as we can store them
            if(arr[j] < arr.length && correct != j){
                swap(arr, j, correct);
            }
            else{
                j++;
            }

        }
        //searching for first missing number
        int i = 0;
        while (i < arr.length) {
            int value = arr[i];
            if (value != i) {
                return i;
            }
            i++;

        }
        return arr.length ;
    }

    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
