package com.java.stack;

import java.util.ArrayDeque;

public class Removekdigits {

    public static String removeKdigits(String num, int k) {
        //You can code here
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String result="";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
                int cur = Character.getNumericValue(num.charAt(i));
                while (!stack.isEmpty() && stack.peek() > cur && k>0) {
                    stack.pop();
                    k--;
                }
                stack.push(cur);
        }
        while(k-->0) stack.pop();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        result=sb.reverse().toString();
        return result.isEmpty() ?"0":result;
    }

    public static void main(String[] args) {
        String s="1432219";
        System.out.println(removeKdigits(s,3));
    }
}
