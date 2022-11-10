package com.GFG.Recursion;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(findmin(arr, arr.length));
    }
    static int findmin(int[] arr, int n){
        //if there is only one element in the array return that element as min
        if(n == 1){
            return arr[n -1];
        }
        //else
        return Math.min(arr[n -1],findmin(arr, n -1) );


    }
}
