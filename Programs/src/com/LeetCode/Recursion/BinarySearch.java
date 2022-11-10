package com.LeetCode.Recursion;
//https://leetcode.com/problems/binary-search/submissions/
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bs(nums, target, 0 , nums.length -1));
    }

   static int bs(int[] arr, int target , int s, int e){
        //dont found the ans
        if(s > e){
            return  -1;
        }
        //else
        int m = s + (e -s) / 2;
        if(arr[m] == target){
            return m;
        }
        else if(arr[m] < target){
            return bs(arr, target, m + 1, e);
        }
        else{
            return bs(arr, target, s , m - 1);
        }
    }
}
