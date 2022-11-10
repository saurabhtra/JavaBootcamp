package com.GFG.Recursion;

public class LengthofString {
    public static void main(String[] args) {
        String s = "Saurabh";
        StringBuilder str = new StringBuilder(s);


        System.out.println(len(s));
    }
    static int len(String s){
        if(s == ""){
            return 0;
        }
//        System.out.println(s.substring(1));
        return 1 + len(s.substring(1));
    }

}
