package com.BinarySearch;

public class CeilingofaNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 14;
        int index = ceiling(arr, target);
        System.out.println(arr[index]);
    }
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end){
            int mid =start + (end - start) / 2;
            if(target <= arr[mid]){
                end = mid;//this might be the possible ans
            }
            if(target > arr[mid]){
                start = mid + 1;
            }

        }

        return end;
    }
}
