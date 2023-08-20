package com.java.recurrsion;

public class PalindromeString {

    static boolean checkpalindrome(String s){
        return checkpalindromehelper(s,0,s.length()-1);
    }

    static boolean checkpalindromehelper(String s, int l,int r){
        if(l>=r) return true;
        if(s.charAt(l)==s.charAt(r)){
            return checkpalindromehelper(s,l+1,r-1);
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(checkpalindrome("abba"));
    }
}
