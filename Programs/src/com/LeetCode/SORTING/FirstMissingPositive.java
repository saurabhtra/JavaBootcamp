package com.LeetCode.SORTING;

import java.util.Arrays;

/*
//https://leetcode.com/problems/first-missing-positive/
problem : Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.

nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.

 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        //first lets sort the given array
        //ignoring negative numbers and numbers > length of array
        int j  = 0;
        while (j < arr.length ){
            int correct = arr[j] - 1 ; //correct index of ith term  = value
            //arr[j] < arr.length condition to ignore the values with are greater than tha last index
            //as we can store them
            if(arr[j] > 0 && arr[j] < arr.length && arr[correct] != arr[j]){
                swap(arr, j, correct);
            }
            else{
                j++;
            }

        }
        System.out.println(Arrays.toString(arr));
        //finding missing number
        int correct = 1; //starting from to check
        boolean flag = false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != correct && arr[i] > 0){
                flag  = true;
                System.out.println(correct );

            }
            else if(arr[i] == correct) {
                correct++;
            }


        }
        if(!flag){
            System.out.println(correct);
        }

    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
