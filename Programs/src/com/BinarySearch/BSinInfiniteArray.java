package com.BinarySearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class BSinInfiniteArray {
    public static void main(String[] args) {
        int[] nums =  {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        int index = ans(nums, target);
        System.out.println(index);

    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){

                int temp = end;
                end = end + (end - start) * 2;
                start = temp + 1;


        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr, int target,int start, int end){

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
