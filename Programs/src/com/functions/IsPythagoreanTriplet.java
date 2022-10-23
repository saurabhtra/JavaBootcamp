package com.functions;

import java.util.Scanner;

public class IsPythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter first number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter first number 3: ");
        int num3 = in.nextInt();
        boolean check = IsPythagorean(num1, num2, num3);
        if(check){
            System.out.println("Its an Pythagorean Triplet");
        }
        else {
            System.out.println("Its not an Pythagorean Triplet");
        }
    }

    private static boolean IsPythagorean(int num1, int num2, int num3) {
        return num1 * num1 == num2 * num2 + num3 * num3 || num2 * num2 == num1 * num1 + num3 * num3 || num3 * num3 == num2 * num2 + num1 * num1;
    }
}
