package com.LeetCode.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {0};
        boolean flag = true;
        int jump = 0;//to store the jumps to make at a particular index

        //this loop is to ensure we reached to the end of the arr
        for(int i = 0; i < nums.length - 1;i++){
            jump = nums[i];
            //if jump == 0 we cant jump ans we are stuck at this point
            if(jump == 0){
                flag = false;
                break;
            }
            i = i + jump - 1;

        }
        System.out.println(flag);
    }
}
