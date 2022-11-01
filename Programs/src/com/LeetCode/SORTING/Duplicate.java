package com.LeetCode.SORTING;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(nums[i] == nums[j] && Math.max(i , j) - Math.min(i , j) <= k && i != j){
                    return true;
                }
            }
        }
        return false;
    }
}
