package com.java.stack;

import java.util.ArrayDeque;

public class LongestValidParenthesis {

    public static int longestValidParentheses(String s)
    {
        int maxcount=0;
        //You can code here
        ArrayDeque<Character> ctstack=new ArrayDeque<>();
        ArrayDeque<Integer> indexstack=new ArrayDeque<>();
        indexstack.push(-1);
        for(int i=0;i<s.length();i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                ctstack.push(cur);
                indexstack.push(i);
            } else {
                if(ctstack.isEmpty()) continue;
                char top=ctstack.pop();
                if (cur == ')' && top=='('){
                    indexstack.pop();
                    maxcount=Math.max(maxcount,i-indexstack.peek());
                }else{
                    indexstack.push(i);
                }
            }
        }
        return maxcount;
    }
    public static void main(String[] args) {
    String s="(((())))(()()((()()))))()(()((()((()))))())))()((()())())()(((((()(()";
        System.out.println(longestValidParentheses(s));
    }
}
