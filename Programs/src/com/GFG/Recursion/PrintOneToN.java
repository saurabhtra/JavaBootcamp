package com.GFG.Recursion;
//[Print 1 To N Without Loop]
// (https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1/) `GFG`
public class PrintOneToN {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n -1);
    }
}
