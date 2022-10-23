package com.conditional_loops;

import java.util.Scanner;
//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum_neg = 0 , sum_pos_even = 0 , sum_pos_odd = 0;
        while(true){
            int num = in.nextInt();
            if(num < 0){
                sum_neg += num;
            }
            else if (num > 0)
            {
                if(num % 2 == 0){
                    sum_pos_even += num;
                }
                else {
                    sum_pos_odd += num;
                }

            }
            else {
                break;

            }
        }
        System.out.println("Neg sum " + sum_neg +" Positive even sum "+ sum_pos_even + " Positive odd sum " + sum_pos_odd);

    }
}
