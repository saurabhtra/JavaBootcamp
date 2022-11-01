package com.LeetCode.SORTING;

import java.util.Arrays;
/*
 [Set Mismatch](https://leetcode.com/problems/set-mismatch/)
 */
public class SetMissmatch {
    public static  void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static  int[] findErrorNums(int[] nums) {
        //first sort the array using cycle sort(as numbers in array are in range of 1 to n)
        sort(nums);
        return finderror(nums);

    }
    static  void sort(int [] arr ){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            //if the ith term is at wrong place and and at its correct place the value is different i.e.                   //handling the duplictes
            if(arr[i] != arr[correct]){
                swap(arr, correct , i);
            }
            //NOTE: if we found duplicate here then we can say that its on the missing number's place for that
            //we have to sort the array first then return the respective number
            else{
                i++;
            }
        }

    }

    //finding the error in the given array
    static  int[] finderror(int[] arr){
        //check which element is not is in its place
        for(int i = 0; i < arr.length; i++){
            //we caught the duplicate  and the missing number = index + 1 according to our                                  //sorting ALGO.
            if(arr[i] != i + 1){
                return new int[] { arr[i] , i + 1};
            }
        }
        //if we dont find any error just return {-1, -1}
        return new int[] {-1, -1};


    }


    //swapping function
   static void swap(int[] arr , int first ,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;
    }
}
