package com.LeetCode.String;

import java.util.Arrays;

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] slpitted = s.split( " ");
        String[] helper  = new String[slpitted.length];
        StringBuilder ans =  new StringBuilder();

        for (int i = 0; i < slpitted.length; i++) {
            int index = slpitted[i].charAt(slpitted[i].length() - 1)- '0';//getting the last digit for getting the correct index where that word belongs to
            helper[index -1] = slpitted[i].substring(0, slpitted[i].length() - 1); //removing last digit and storing that word into helper
        }
        for (String st: helper
             ) { ans.append(st + " ");

        }

        ans.toString().toLowerCase();
        System.out.println(ans.toString().toLowerCase());


    }
}
