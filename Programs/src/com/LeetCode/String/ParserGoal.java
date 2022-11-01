package com.LeetCode.String;

public class ParserGoal {
    public static void main(String[] args) {
        String command = "G()(al)";
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans.append('G');
            }
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == 'a'){
                    ans.append("at");
                }
                else{
                    ans.append('o');
                }
            }
        }
        System.out.println(ans);
    }
}
