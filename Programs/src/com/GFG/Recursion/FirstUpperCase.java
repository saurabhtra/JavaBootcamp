package com.GFG.Recursion;
//https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUpperCase {
    public static void main(String[] args) {
    String s = "leetCode";
        System.out.println(firstupper(s));
    }
    static char firstupper(String s){

        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                return s.charAt(i);

            }
        }
        return '0';
    }
}
