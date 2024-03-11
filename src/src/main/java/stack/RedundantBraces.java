package com.java.stack;

import java.util.ArrayDeque;

public class RedundantBraces {
    public static boolean hasRedundantBraces(String s) {
        // You can code here
        ArrayDeque<Character> stack=new ArrayDeque<>();
        boolean result=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='+'|| c=='-'|| c=='*' || c=='/'){
                stack.push(c);
            }
            if(c=='('){
                stack.push(c);
            }
            if(c==')'){
            if(!stack.isEmpty() && stack.peek()=='(') result=true;
            while(!stack.isEmpty() && (stack.peek()=='+'|| stack.peek()=='-'||stack.peek()=='*'|| stack.peek()=='/')){
                stack.pop();
            }
            if(!stack.isEmpty()) stack.pop();
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="((a+b)+(c+d))";
        System.out.println(hasRedundantBraces(s));
    }
}
