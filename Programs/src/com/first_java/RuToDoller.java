package com.first_java;

import java.util.Scanner;

public class RuToDoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount In Ruppes : ₹ ");
        int ru = in.nextInt();
        System.out.print("Amount in USD is : $ " + (ru * 65));
    }
}
