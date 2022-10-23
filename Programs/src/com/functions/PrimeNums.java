package com.functions;

import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers.
public class PrimeNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Range to find prime Numbers e.g. low  high : ");
        int low = in.nextInt(), high = in.nextInt();
        primes(low, high);
    }

    static void primes(int low, int high) {
        for (int i = low + 1 ; i < high ; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }

        }
    }

    static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        int c = 2;
        while( c * c < num){
            if( num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
