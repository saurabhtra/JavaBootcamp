package com.first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A String : ");
        String st = in.next().toLowerCase();
        int len = st.length();
        int i = 0 , j = len - 1;
        while ( i < j){
            if (st.charAt(i) != st.charAt(j)){
                System.out.print("NOT a Palindrome");
                return ;
            }
            i++;
            j--;
        }
        System.out.print("A Palindrome");


    }
}
