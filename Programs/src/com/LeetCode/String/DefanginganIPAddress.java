package com.LeetCode.String;
// [Defanging an Ip address](https://leetcode.com/problems/defanging-an-ip-address/)
public class DefanginganIPAddress {
    public static void main(String[] args) {
        String adress = " 1.1.1.1";
//        String ans = adress.replace(".", "[.]");
        StringBuilder ans = new StringBuilder();
        for (char ch: adress.toCharArray()
             ) { ans.append(ch == '.' ? "[.]" : ch);

        }
        System.out.println(ans);
    }
}
