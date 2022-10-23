package com.conditional_loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st = in.nextLine();
        StringBuilder rv = new StringBuilder();
        int len = st.length();

        while(len > 0){

            rv.append(st.trim().charAt(len - 1));

            len--;
        }
        System.out.print(rv);

    }
}
