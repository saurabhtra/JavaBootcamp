package com.first_java;

import java.util.Scanner;

public class LargerNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        float num1 = in.nextFloat();

        System.out.print("Enter The Second Number : ");
        float num2 = in.nextFloat();
        if(num1 > num2){
            System.out.print("The Larger Num is  : " + num1 );
        }
        else {
            System.out.print("The Larger Num is  : " + num2 );
        }
    }
}
