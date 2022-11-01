package com.LeetCode.SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
/*
Given an array nums of n integers where nums[i] is in the range [1, n],
 n return an array of all the integers in the range [1, n] that do not appear in nums. */
class FindDisapperedNumsInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.print("[");
        for (int num: findDisappearedNumbers(nums)
             ) {
            System.out.print(num);

        }
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>(5);

        int j  = 0;
        while (j < arr.length ){
            int correct = arr[j] - 1; //correct index of ith term  = value - 1
            //arr[j] < arr.length condition to ignore the values with are greater than tha last index
            //as we can store them
            if(arr[correct] != arr[j]){
                swap(arr, j, correct);
            }
            else{
                j++;
            }

        }
        //searching for first missing number
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != i + 1) {
                ans.add(i+1);
            }
            i++;

        }
        return ans;
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}