package com.LeetCode.Arrays;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0} };
        int s = image.length;
        //flipping
        for(int i= 0; i < s ; i++){
            int l = image[i].length - 1;
            int j = 0;
            while(j < l){
                int temp = image[i][j];
                image[i][j] = image[i][l];
                image[i][l] = temp;
                j++;
                l--;

            }
        }
        //inverting;
        for(int i= 0; i < s ; i++){
            int len = image[i].length;
            for(int j = 0; j < len; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }

            }
        }
        for (int[] row : image
             ) {
            System.out.println(Arrays.toString(row));
        }
//
    }
}
