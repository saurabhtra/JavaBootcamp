package com.LeetCode.Recursion;

import java.util.Arrays;

// [Reverse String](https://leetcode.com/problems/reverse-string/)
public class ReverseString {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        System.out.println(reverse(s, 0, s.length -1));
        System.out.println(Arrays.toString(s));
    }
    static char[] reverse(char[] str, int s, int e){

        if(s <= e){
            char temp = str[s];

            str[s] = str[e];
            str[e] = temp;
            return reverse(str, s + 1, e - 1);
        }
        return str;

    }
}
