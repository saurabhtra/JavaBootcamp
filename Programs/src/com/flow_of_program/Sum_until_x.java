package com.flow_of_program;

import java.util.Scanner;

public class Sum_until_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter X : ");
        int x = in.nextInt();

        int sum = 0;
        while(true)
        {
            System.out.print("Enter a number :: " );
            int temp = in.nextInt();
            sum += temp;
            if (temp == x){
                System.out.print("com.flow_of_program.Sum is :" + sum);
                break;
            }

        }
    }
}
