package com.first_java;

import java.util.Scanner;

//(100, 400) => 153 370 371

public class Armstong {
    // Prints Armstrong Numbers in given range
    static void findArmstrong(int low, int high)
    {
        int temp = 0 ;
        for (int i = low + 1; i < high; ++i) {

            // number of digits calculation
            int x = i;
            int n = 0;
            while (x != 0) {
                x /= 10;
                ++n;
            }

            // compute sum of nth power of
            // its digits
            int pow_sum = 0;
            x = i;
            while (x != 0) {
                int digit = x % 10;
                pow_sum += Math.pow(digit, n);
                x /= 10;
            }

            // checks if number i is equal
            // to the sum of nth power of
            // its digits
            if (pow_sum == i) {
                System.out.print(i + " ");
                temp = 1;
            }


        }
        if(temp == 0 ){
            System.out.print("No Armstrong Number Found");
        }
    }

    // Driver code
    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter Low : ");
        int num1 = in.nextInt();
        System.out.print("Enter High : ");
        int num2 = in.nextInt();
        findArmstrong(num1, num2);
        System.out.println();
    }

    }

