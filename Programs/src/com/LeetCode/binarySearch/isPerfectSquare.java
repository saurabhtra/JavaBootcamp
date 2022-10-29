package com.LeetCode.binarySearch;

public class isPerfectSquare {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(isPerfect(num));
    }
    static boolean isPerfect(int num){
        if(num == 1|| num == 0 ){
            return true;
        }
        long start = 0;
        long end = num - 1;
        while (start <= end){
            long mid = start + (end - start) / 2;
            if(mid * mid < (num)){
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;

            }
            else {
                return true;
            }
        }
        return false;
    }
}
