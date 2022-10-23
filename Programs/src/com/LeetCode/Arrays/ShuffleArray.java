package com.LeetCode.Arrays;

import java.util.Arrays;
/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] arr = new int[2 * n];

        for(int i = 0 ,j = 0; i <  n; i ++ ){

            arr[j] = nums[i];//putting x's on their places
            j += 2;

        }
        System.out.println(Arrays.toString(arr));
        for(int i = n, j = 1; i < 2 * n ; i++){
            arr[j] = nums[i];//putting y's on their places
            j += 2;
        }
        System.out.println(Arrays.toString(arr));

    }
    }

