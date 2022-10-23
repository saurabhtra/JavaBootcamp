package com.conditional_loops;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the NUM : ");
        int num = in.nextInt();
        double squ_root = Math.sqrt(num);
        if((int)(squ_root) *   (int)(squ_root) - num == 0){
            System.out.println("Its a perfect Number");
        }
        else {

            System.out.println("Not a perfect num");
        }
    }
}
