package com.LeetCode.binarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/

public class PeakMountain {
    public static void main(String[]args){
        int[] nums = { 1,2,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        int ans = highest(nums);
        System.out.println( nums[ans]);
    }
    static int highest(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end- start)/2;
            if (arr[mid] > arr[mid + 1]){//desecending part of the array
                end = mid;//as this mid might be the possible ans
            } else {
                start = mid + 1;
            }

        }

        return end;//or return start as both will be same at this point
    }
}
