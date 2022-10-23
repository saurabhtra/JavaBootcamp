package com.LeetCode.Arrays;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        runningsum(nums);
    }
    static void runningsum(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            int sum = 0;
            while(j <= i){
                System.out.print(arr[j] +" ");
                sum += arr[j];
                j++;
            }
            arr[i] = sum;
            System.out.println();
            System.out.println("sum" + sum);

        }
        System.out.println(Arrays.toString(arr));
    }
}
