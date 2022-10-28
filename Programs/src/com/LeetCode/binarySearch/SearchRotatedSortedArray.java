package com.LeetCode.binarySearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
//        int pivot = findpivot(nums);
        int pivot = findpivotWithDuplicates(nums);
//        System.out.println(pivot);
        //if pivot == -1 means array is not rotated hence do normal binary search
        if (pivot == -1 ){
            int index = binarysearch(nums,target,0,nums.length -1);
            System.out.println(index);

        }
        else if(target >= nums[0]){
            int index = binarysearch(nums,target,0,pivot);
            System.out.println(index);


        }
        else if(target < nums[0]) {
            int index = binarysearch(nums,target,pivot +1, nums.length -1);
            System.out.println(index);

        }
//        else {
//            System.out.println(pivot + 1);
//        }

    }
    //normal binary search
    static int binarysearch(int[] arr, int target, int start,int end){
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
//finding the pivot i.e. the largest element in sorted rotated array
    //this will work for non duplicate elements in an array
    private static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start &&  arr[mid] < arr[mid - 1]){
                return mid - 1;

            }
            if (arr[start] > arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
    //finding pivot for duplicate elements in an array
    static int findpivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start &&  arr[mid] < arr[mid - 1]){
                return mid - 1;

            }
            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]){
                    return  end - 1;
                }
                end --;
            }
            //if pivote lies on the right end side
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;

            }
            //else pivot lies on the left side
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
