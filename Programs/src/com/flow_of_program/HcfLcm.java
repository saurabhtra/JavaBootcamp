package com.flow_of_program;

import java.util.Scanner;

public class HcfLcm {
    static int Hcf(int a, int b) {
        int hcf = 0;
        for(int i = 1; i <= a || i <= b; i++) {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF OF Num1 and Num2 :: " + hcf);
        return hcf;
    }
    static void Lcm(int a, int b, int hcf){
//        int lcm(int a, int b)
//        {
//            return (a / gcd(a, b)) * b;
//        }
        System.out.println("LCM OF " + a + "and " + b + "is ::" + (a / hcf * b) );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number");
        int num2 = in.nextInt();
        int hcf = Hcf(num1, num2);
        Lcm(num1, num2, hcf);
    }
}
