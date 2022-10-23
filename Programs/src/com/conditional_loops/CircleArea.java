package com.conditional_loops;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Radius of Circle : " );
        float r = in.nextFloat();
        System.out.print("Area of the Circle is :: " + (3.14 * r * r));
    }
}
