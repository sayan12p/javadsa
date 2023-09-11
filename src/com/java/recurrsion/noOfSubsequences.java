package com.java.recurrsion;

public class noOfSubsequences {
    static void printsubsequences(int i,String s,String f){
        if(i==s.length()){
            System.out.println(f+" ");
            return;
        }
        //inserting next character
        printsubsequences(i+1,s,f+s.charAt(i));
        //popping the last character
        printsubsequences(i+1,s,f);
    }
    public static void main(String[] args) {
        printsubsequences(0,"abcbdf","");
    }
}
