package com.LeetCode.Arrays;
//https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
    static int maxSum(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int l = arr.length ;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            //sum till now
            sum += arr[i];
            maxsum = Math.max(maxsum , sum);
            if(sum < 0){
                sum = 0;
            }

        }


        return maxsum;
    }
}
