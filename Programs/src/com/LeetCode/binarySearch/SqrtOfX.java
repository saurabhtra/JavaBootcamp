package com.LeetCode.binarySearch;

public class SqrtOfX {
    public static void main(String[] args) {
        int x = 2147395599;
        int ans = (int)sqrt(x);
        System.out.println(ans);
    }
    static long sqrt(int x){

        if(x == 0 || x == 1){
            return x;
        }
        //find potential range of our ans
        long start = 1;
        long end = x;
        while (start <= end){
            long mid = start + (end -start) / 2;
            if(mid * mid > x){
                end = mid - 1;
            }
            else {
                start = mid + 1;//as start might be my potential ans
            }
        }

        return end;
    }
}
