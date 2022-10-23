package com.flow_of_program;

import java.util.Scanner;

public class Multable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Num  : ");
        int Int1 = in.nextInt();
        int count = 0;
        while(count < 10){
            System.out.println((Int1 * (count + 1)));
            count++;
        }
    }
}
