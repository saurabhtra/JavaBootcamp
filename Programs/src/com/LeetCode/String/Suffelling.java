package com.LeetCode.String;

import java.util.Arrays;

public class Suffelling {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(s.charAt(1));
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        while(i < indices.length){
            sb.setCharAt(indices[i], s.charAt(i));
            i++;
        }
        System.out.println(sb.toString());

    }


}
