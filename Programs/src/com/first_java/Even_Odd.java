package com.first_java;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Enter a Number :: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if ( num % 2 == 0){
            System.out.print("The number " + num + " is Even");
        }
        else{
            System.out.print("The number " + num + " is Odd");
        }
    }
}
