package com.conditional_loops;

import java.util.Scanner;

public class LargestTillNow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.print("Enter A number : ");
            int num = in.nextInt();
            if(num == 0){
                System.out.println("Largest Number till Now Is " + max);
                return ;
            } else if (num >= max) {
                max = num ;

            }
//            else if(num < max) {
//                System.out.println("");
//            }

        }
    }
}
