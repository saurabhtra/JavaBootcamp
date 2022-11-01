package com.sorting;

import java.util.Arrays;
/*
Works only when given arr of nums in range of (1,N) where N is the sizeofArr - 1;
 */
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};//here N is 5
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1){
                swap(arr , i);
            }

        }

    }
    static void swap(int[] arr , int i){
        int temp = arr[arr[i] -1];
        arr[arr[i ] - 1] = arr[i];
        arr[i] = temp;
    }

}
