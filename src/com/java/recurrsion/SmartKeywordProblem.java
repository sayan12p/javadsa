package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class SmartKeywordProblem {

    public static List<String> letterCombinations(String digits) {
        //You can code here
        List<String> result=new ArrayList<>();
        String[] a={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        getlettercombinationhelper(a,result,"",0,digits);
        return result;
    }

    private static void getlettercombinationhelper(String[] a, List<String> result, String s, int i, String digits) {
        if(i==digits.length()){
            result.add(s);
            return;
        }
        int index=digits.charAt(i)-'0';
        String buttonstring=a[index];
        for( int b=0;b<buttonstring.length();b++){
            s=s+buttonstring.charAt(b);
            getlettercombinationhelper(a,result,s,i+1,digits);
            s=s.substring(0,s.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
