package com.functions;

import java.util.Scanner;

//8. Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail

public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your marks");
        float marks = in.nextFloat();
        String grade = grade(marks);
        System.out.println(grade);
    }

    static String grade(float n) {
        if(n >= 91 && n <=100){
            return "AA";
        }
        if(n >= 81 && n < 91){
            return "AB";
        }
        if(n >= 71 && n < 81){
            return "BB";
        }
        if(n >= 61 && n < 71){
            return "BC";
        }
        if(n >= 51 && n < 61){
            return "CD";
        }
        if(n >= 41 && n < 51){
            return "DD";
        }
        if(n < 41){
            return "FAIL";
        }
        else {
            return "PLEASE ENTER A VALID MARKS";
        }


    }
}
