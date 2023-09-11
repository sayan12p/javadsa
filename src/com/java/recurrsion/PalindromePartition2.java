package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromePartition2 {

    public static List<String> generatePalindromes(String s) {
        // write your code here
        List<String> result=new ArrayList<>();
        generatePalindromeshelper(s,result,"");
        return result;
    }

    private static void generatePalindromeshelper(String s, List<String> result, String cur) {

        if(cur.length()==s.length()){
            if(!result.contains(cur) && ispalindrome(cur))
            result.add(cur);
            return;
        }
        for(int i=0;i<s.length();i++){
            cur=cur+s.charAt(i);
            generatePalindromeshelper(s,result,cur);
            cur=cur.substring(0,cur.length()-1);
        }
    }

    private static boolean ispalindrome(String cur) {
        int i=0;int j=cur.length()-1;
        while(j>=0 && i<=cur.length()){
             if(cur.charAt(i)!=cur.charAt(j)) return false;
            j--;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(generatePalindromes("aabb"));
    }
}
