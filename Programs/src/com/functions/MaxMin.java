package com.functions;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class MaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter first number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter first number 3: ");
        int num3 = in.nextInt();
        int max = max(num3, num2, num1);
        int min = min(num3, num2, num1);
        System.out.println(" Maximum among these three number is : " + max);
        System.out.println(" Minimun among these three number is : " + min);
    }
    static int max(int a, int b, int c){
        return Math.max(c, (Math.max(a,b)) );
    }
    static int min(int a, int b, int c){
        return Math.min(c, (Math.min(a,b)) );
    }

}
