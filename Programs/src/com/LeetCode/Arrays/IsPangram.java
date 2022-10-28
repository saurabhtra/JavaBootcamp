package com.LeetCode.Arrays;

import java.util.Arrays;

public class IsPangram {
    public static void main(String[] args) {
        String sentence = "bcdefghijklmnopqrstuvwxyz";
        char[] alpha = new char[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = 'A';

        }
//        System.out.println(Arrays.toString(alpha));

        for(int i = 0; i < sentence.length(); i++){
            int ch = (int)(sentence.charAt(i) ) - 97;
            alpha[ch] ='P';

        }
        for (int i = 0; i < 26; i++) {
            if(alpha[i] == 'A'){
                System.out.println("Not Pangram");
                return ;
            }

        }
//        System.out.println(Arrays.toString(alpha));
    }
}
