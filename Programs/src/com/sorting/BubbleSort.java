package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){

        boolean flag; //swap flag
        // the outer loop will be run for n - 1 times
        for (int i = 0; i < arr.length; i++) {
            //for each value of i the inner loop will be run for n - i - 1 times
            //as at for i = x ,x biggest element have been sorted
            flag = false;
            for (int j = 1; j < arr.length - i; j++) {

                if(arr[j] < arr[j - 1]){
                    //swap the values
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }

            }
            //if no swap occur at ith level -> array has been sorted     .so break.
            if(!flag){
                break;
            }

        }
    }
}
