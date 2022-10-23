package com.first_java;

import java.util.Scanner;

public class MathOp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        float num1 = in.nextFloat();

        System.out.print("Enter The Second Number : ");
        float num2 = in.nextFloat();

        System.out.print("Enter The operation ( + , - , /, * ) : ");
        char op = in.next().charAt(0);
        if (op == '+'){
            System.out.print("Sum of" + num1 + " and " + num2 + " is " + (num1 + num2));
        }
        else if (op == '-'){
            System.out.print("Diff.  of" + num1 + " and " + num2 + " is " + (num1 - num2));
        }
        else if (op == '/'){
            System.out.print("Div. of" + num1 + " and " + num2  + " is " + (num1 / num2));
        }
        else if (op == '*'){
            System.out.print("Product of" + num1 + " and " + num2 + " is "  + (num1 * num2));
        }
        else {
            System.out.print("Invalid Operation ");
        }



    }
}
