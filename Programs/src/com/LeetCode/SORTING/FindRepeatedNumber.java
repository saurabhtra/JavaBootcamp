package com.LeetCode.SORTING;

public class FindRepeatedNumber {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(dupicatesIn(nums));
    }
    static int dupicatesIn(int[] arr){
        int j  = 0;
        while (j < arr.length ){
            int correct = arr[j] - 1; //correct index of ith term  = value - 1
            //arr[j] < arr.length condition to ignore the values with are greater than tha last index
            //as we can store them
            if(arr[correct] != arr[j]){
                swap(arr, j, correct);
            }
            else{
                j++;
            }

        }
        //searching for first missing number
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] -1;
            if (arr[i] != i + 1) {
                return arr[i];
            }
            i++;

        }
        return -1;

    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
