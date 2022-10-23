package com.conditional_loops;

import java.util.Scanner;


public class PermutaionAndCombination {
    static int fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    static int per(int n, int r){
//        nPr = (n!) / (n-r)!
        int npr = fact(n) / fact((n-r));
        return npr;
    }
    static int com(int n, int r) {
//        nCr = n! / r! * (n - r)!
        int ncr = fact(n) /(fact(r) * fact((n-r)) );
        return ncr;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 'n' : ");
        int n = in.nextInt();
        System.out.print("Enter 'r' : ");
        int r = in.nextInt();
        int ncr = com(n, r);
        int npr = per(n, r);
        System.out.println("nPr == " + npr + " nCr == " + ncr );

    }
}
