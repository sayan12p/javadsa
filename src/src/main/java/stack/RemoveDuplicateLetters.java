package com.java.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;


public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        //You can code here
        int[] ch=new int[26];ArrayDeque<Character> stack=new ArrayDeque<>();
        boolean[] visited=new boolean[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int index = s.lastIndexOf(c);
            ch[c-'a']=index;
        }

        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(visited[cur-'a']) continue;
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()>cur && ch[stack.peek()-'a']>i){
                    int top=stack.peek();
                    stack.pop();
                    visited[top-'a']=false;
                }
            }
                stack.push(cur);
                visited[cur-'a']=true;
            }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String s="cbabc";
        System.out.println(removeDuplicateLetters(s));
    }
}
