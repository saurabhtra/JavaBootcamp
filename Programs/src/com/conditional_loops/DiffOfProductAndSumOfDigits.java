package com.conditional_loops;

import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer
public class DiffOfProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = in.nextInt();
        int sum = 0, pro = 1, tem = num;
        while (tem > 0){
            int rem = tem % 10;
            sum += rem ;
            pro *= rem ;
            tem /= 10;
        }
        System.out.print("Difference of  the Product and Sum of Digits of " + num + " is " + (pro - sum));

    }

}
