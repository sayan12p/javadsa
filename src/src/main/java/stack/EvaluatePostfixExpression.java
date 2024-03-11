package com.java.stack;

import java.util.Stack;

public class EvaluatePostfixExpression {

    public static int evalPostfix(String[] A)
    {
        //You can code here
        Stack<String> a=new Stack<>();
        int subresult=0;
        for(int i=0;i<A.length;i++){
           String cur=A[i];
            String first;
            String second;
           if(cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/")){
               if(!a.isEmpty()){
                   second=a.pop();
                   first=a.pop();
                   subresult=evaluateexpression(Integer.parseInt(first),Integer.parseInt(second),cur);
                   a.push(String.valueOf(subresult));
               }
           }else{
               a.push(cur);
           }
        }

        return !a.isEmpty()?Integer.parseInt(a.peek()):0;
    }

    public static int evaluateexpression(int first,int second,String operand){
        int result=0;
        switch (operand){
            case "+": result=first+second;break;
            case "-": result=first-second;break;
            case "*": result=first*second; break;
            case "/": result=first/second; break;
        }
        return result;
    }
    public static void main(String[] args) {
    String a[]={"2", "1", "+", "3", "*"};
        System.out.println(evalPostfix(a));
    }
}
