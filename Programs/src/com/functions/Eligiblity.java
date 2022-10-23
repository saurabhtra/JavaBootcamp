package com.functions;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class Eligiblity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = in.nextInt();
        boolean check = IsEligible(age);
        if(check){
            System.out.println("Congo. Your are eligible to vote");
        }
        else {
            System.out.println("Sorry you are not eligible to vote");
        }
    }

   static boolean IsEligible(int age) {
        return age >= 18 ;
    }
}
