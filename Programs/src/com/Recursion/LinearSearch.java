package com.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1,8,3,4,9,4};
        int target = 4;
        //start searcing form 0th index
//        System.out.println(search(arr, target, 0));
        //start searching form end of the array
//        System.out.println(search2(arr, target, arr.length -1));

        //seraching all indeices of the target by passing arraylist as a parameter
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        System.out.println(searchAll(arr ,target,0,list));
        ////seraching all indeices of the target without passing arraylist as a parameter
        System.out.println(search3(arr, target,0));
    }

    static int search(int[] arr, int target, int s){
        if(s == arr.length){
            return -1;
        }
        if(arr[s] == target){
            return s;
        }else {
            return search(arr, target,s+1);
        }


    }
    static int search2(int[] arr, int target, int e){
        if(e == -1){
            return -1;
        }
        if(arr[e] == target){
            return  e;
        }else {
            return search2(arr, target ,e - 1);

        }
    }
    static ArrayList<Integer> searchAll(int[] arr, int target , int s, ArrayList list){
        if(s == arr.length){
            return list;
        }
        if(arr[s] == target){
            list.add(s);
        }
            return searchAll(arr, target , s + 1, list);

    }
    static ArrayList<Integer> search3(int[] arr, int target, int s){
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(s == arr.length){
            return list;
        }
        if(arr[s] == target){
            list.add(s);

        }
        ArrayList<Integer> ansFromBelowCalls =  search3(arr , target ,s + 1);
        list.addAll(ansFromBelowCalls);
        return list;


    }
}
