package com.GFG.Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int len  = (int)(Math.log10(num) + 1);
//        reverse(num, len);
        System.out.println((reverse(num, len - 1)));
    }

    static int reverse(int n, int len){
        if (n == 0) {
            return 0;
        }
        return  (int)((n % 10 ) * Math.pow(10, len ) + reverse(n /10, --len));


    }
}
