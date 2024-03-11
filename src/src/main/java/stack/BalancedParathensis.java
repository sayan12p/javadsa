package com.java.stack;

import java.util.ArrayDeque;

public class BalancedParathensis {

    public static int isBalanced(String A) {
        //You can code here
        ArrayDeque<Character> stack=new ArrayDeque<>();
        int n=A.length();
        for(int i=0;i<n;i++){
            char cur=A.charAt(i);
            if(cur=='('){
                stack.push(cur);
            }
            else{
                if(stack.isEmpty()) return 0;
                char top=stack.pop();
                if(A.charAt(i)==')'&& top=='('){
                   continue;
                    }
            }
        }
        return stack.isEmpty()?1:0;
    }

    public static void main(String[] args) {
    String A="(()";
        System.out.println(isBalanced(A));
    }
}
