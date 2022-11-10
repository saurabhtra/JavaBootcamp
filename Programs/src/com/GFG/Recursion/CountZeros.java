package com.GFG.Recursion;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1020640;
        int c = 0;
        System.out.println(count(n ,c));
    }
    static int count(int n , int c){
       if(n == 0){
            return c;
        }
        if(n % 10 == 0){
           return count( n / 10 , ++c);
        }
        else {
           return count( n /10, c);
        }

    }

}
