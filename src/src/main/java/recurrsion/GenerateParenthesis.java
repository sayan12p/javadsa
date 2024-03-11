package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        generateParenthesishelper(result,"",n,0,0,0);
        return result;
    }

    private static void generateParenthesishelper(List<String> result, String s, int n, int index,int open,int close) {
        if(index==2*n){
            result.add(s);
            return;
        }
        if(open<n){
            s=s+"(";
            generateParenthesishelper(result,s,n,index+1,open+1,close);
            s=s.substring(0,s.length()-1);
        }
        if(close<open){
            s=s+")";
            generateParenthesishelper(result,s,n,index+1,open,close+1);
        }

    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
