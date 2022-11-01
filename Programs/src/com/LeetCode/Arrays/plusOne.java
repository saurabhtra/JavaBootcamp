package com.LeetCode.Arrays;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] digits = {1,9,9,9,9};
        int k = 1;
        int end = digits.length - 1;
        int[] ans = new int[end + 2];
        while(k > 0 && end >= 0){
            int temp = digits[end];
            digits[end] = (digits[end] + k) % 10;
            k = (temp + k) / 10;
            end --;


        }
        if(k != 0){
            //if in final sum thers is one more digit than the given array e.g 9(single digit) + 1 = 10 (one more digit)
            //copy the digits into ans and return ans
            ans[0] = k;
            for(int i = 1;i <end + 2;i++){
                ans[i] = digits[i - 1];
            }
            System.out.println(Arrays.toString(ans));
        }
        else {
            System.out.println(Arrays.toString(digits));
        }
    }
}
