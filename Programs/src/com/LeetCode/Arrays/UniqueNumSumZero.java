package com.LeetCode.Arrays;

import java.util.Arrays;

// [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
/*
Given an integer n, return any array containing n unique integers such that they add up to 0.
Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 */
public class UniqueNumSumZero {
    public static void main(String[] args) {
        int n = 1;
        int[] nums = new int[n];
        System.out.println(Arrays.toString(randomArraySumZero(nums)));
    }
    static int[] randomArraySumZero(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        int n = (end + 1) / 2;
        while(start < end){
            nums[start] = n * (-1);
            nums[end] = n;
            n--;
            start++;
            end--;
        }
        return nums;

    }
}
