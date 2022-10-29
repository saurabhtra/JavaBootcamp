package com.LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> bool = new ArrayList<Boolean>(candies.length);


        int max = 0;
        for(int candy  : candies){
            max = Math.max(max, candy);
        }
        System.out.println("max  :"+ max);
        for(int i = 0; i < candies.length;i++){
            if(candies[i] + extraCandies >= max){
                bool.add(true);
            }
            else{
                bool.add(false);

            }
        }

        System.out.println(Arrays.toString(bool.toArray()));;
    }
}
