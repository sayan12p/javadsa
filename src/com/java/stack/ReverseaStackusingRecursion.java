package com.java.stack;

import java.util.Stack;

public class ReverseaStackusingRecursion {
    public static void reverseStack(Stack<Integer> s) {
        //You can code here
           reverse(s);
        }
        public static void reverse(Stack<Integer> s){
        if(!s.isEmpty()) {
            int top = s.pop();
            reverse(s);
            insertatbottom(s, top);
        }
    }

    private static void insertatbottom(Stack<Integer> s,int item) {
        if(s.isEmpty()){
           s. push(item);
        }else{
            int top=s.pop();
            insertatbottom(s,item);
            s.push(top);
        }
    }

    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    reverseStack(s);
        System.out.println(s);
    }
}
