package com.first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Principal : ");
        int p = in.nextInt();

        System.out.print("Time : ");
        int t = in.nextInt();

        System.out.print("Rate : ");
        int r = in.nextInt();

        System.out.print("Interest :: " + ( ( p * r * t) / 100) );


    }
}
