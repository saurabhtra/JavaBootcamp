package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 5,8,36,9,8,88};
        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j);
                }
                else {
                    break;
                }

            }

        }
    }
    static void swap(int[] arr , int i ){
        int temp = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = temp;
    }
}
