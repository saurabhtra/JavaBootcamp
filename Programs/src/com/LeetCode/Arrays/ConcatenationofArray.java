package com.LeetCode.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically , ans is the concatenation of two nums arrays.

 */
public class ConcatenationofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[10];
        for (int num: nums
             ) {
            num = in.nextInt();

        }

        int[] ans = new int[2 * nums.length];
        getConatenation(nums, nums.length);
    }

    private static void getConatenation(int[] nums, int len) {
        int[] ans = new int[2 * len];
        for (int i = 0; i < 2*len ; i++) {
            if(i < len){
                ans[i] = nums[i];
            }
            else {
                ans[i] = nums[i - len];
            }

        }
        System.out.println(Arrays.toString(ans));

    }


}
