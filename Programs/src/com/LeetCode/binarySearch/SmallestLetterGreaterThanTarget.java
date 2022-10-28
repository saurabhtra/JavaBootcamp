package com.LeetCode.binarySearch;
//@ https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = { 'e','e','e','e','e','e','n','n','f'};

        char target = 'e';
        int out = smallestGreater(letters, target);
        System.out.println(letters[out]);
    }
    static int smallestGreater(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        if(target >= arr[end]){
            return 0;
        }
        while(start <= end){
            int mid = start + (end- start)/2;
            if (target >= arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }

        }

        return start;



    }
}
