package com.LeetCode.binarySearch;

public class FloorofaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 13;
        int index = floor(arr, target);
        System.out.println(arr[index]);
    }
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end){
            int mid =start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            if(target >= arr[mid]){
                start = mid ;//this might be the possible ans
            }

        }

        return start;
    }
}
