package com.first_java;

import java.util.Scanner;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class FibonacciSeries {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter A num For Fabbi. : " );
        int n = in.nextInt();

        int n1 = 0 , n2 = 1 , n3 = 1 ;
        System.out.print(n1 + " " + n2);
       for ( int i = 2 ; i < n; i++){
            n3 = n1 + n2;
           System.out.print(" " + n3);
           n1 = n2;
           n2 = n3;
       }
    }
}
