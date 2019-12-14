package cn.leetcode.t20;

import java.util.Stack;

public class Solution {


    public static void main(String[] args){

        String s = "[])";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }


    public boolean isValid(String s) {
        Stack stack = new Stack();
        String[] symbolArr = s.split("");

        for (int i = 0; i < symbolArr.length; i++) {

            String symbol = symbolArr[i];
            if("{".equals(symbol) || "[".equals(symbol) || "(".equals(symbol)){
                stack.push(symbol);
            }

            if("}".equals(symbol)){
                if(stack.empty() || !"{".equals((String) stack.pop())){
                    return false;
                }
            }else if("]".equals(symbol)){
                if(stack.empty() || !"[".equals((String) stack.pop())){
                    return false;
                }
            }else if(")".equals(symbol)){
                if(stack.empty()|| !"(".equals((String) stack.pop())){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
