package com.functions;

import java.util.Scanner;

public class IsEven_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        boolean check = even_odd(num);
        if(check){
            System.out.println("Its an Even");
        }
        else {
            System.out.println("Its an odd");
        }
    }

    static boolean even_odd(int num) {
        return num % 2 == 0;
    }
}
