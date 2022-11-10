package com.GFG.Recursion;
// [Write a recursive function to check whether an array is sorted or not.]
// (https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive) `GFG`
public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1,25,100,86,92};
        System.out.println(isSorted(arr, 0));

    }
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        else {
            //for accending check
            return (arr[index] < arr[index + 1] && isSorted(arr, index + 1));
        }


    }
}
