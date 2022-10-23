package com.first_java;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        System.out.print("What's your name ? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        if (name.length() != 0){
            System.out.print("Hello, " + name + " !");
        }
        else{
            System.out.print("Hello, World !");
        }

    }
}
