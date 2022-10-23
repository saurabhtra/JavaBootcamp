package com.flow_of_program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter Year : ");
        Scanner in = new Scanner(System.in);
        int Year = in.nextInt();
        if ( (Year % 4 == 0 && Year % 100 == 0 ) || Year % 400 == 0 ){
        System.out.println("LEAP YEAR");
        }
        else{
        System.out.println("NON Leap Year");
        }
    }
}