package com.Recursion;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arrRotated = { 9,10,12,1,2,3};
        int target = 12;
        int index = search(arrRotated, target,0,arrRotated.length - 1);
        System.out.println(index);

    }
    static int search(int[] arr,int target, int s , int e){
        int mid = s + (e - s) / 2;
        //base condition
        if(arr.length == 0){
            return -1;
        }
        if(arr[mid] == target){
            return mid;
        }
        if(s >= e){
            return -1;
        }

        if (arr[s] < arr[mid]){
            if (target >= arr[s] && target <= arr[mid]){
//                e = mid -1;
                return search(arr, target ,s ,mid - 1);
            }
            else {
               // s = mid + 1;
                return search(arr, target ,mid + 1, e);
            }
        }
        else {
            if (target >= arr[mid] && target <= arr[e]){
                //s = mid + 1;
                return search(arr , target ,mid + 1, e);
            }
            else {
                //end = mid - 1;
                return search(arr, target, s, mid - 1);
            }
        }
    }
}
