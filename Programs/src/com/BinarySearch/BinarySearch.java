package com.BinarySearch;



public class BinarySearch {
    public static void main(String[] args) {
        //sorted array
        int[] arr = {1,2,3,4,9,15,25,28};
        int target = 100;
        int index = binarySearch(arr, target);
        System.out.println(index);
    }
    //if found return index of target else return -1;
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end- start)/2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return -1;
    }
}
