package com.java.recurrsion;

import java.util.*;
import java.util.stream.Collectors;

public class MoreSubsequence {

    static String moreSubsequence(int n, int m, String a, String b) {
        // Write your code here
        List<String> s1=new ArrayList<>();
        List<String> s=new ArrayList<>();
        checkcountofsubsequences(n,a,s,s1,0);
        s=s.stream().distinct().collect(Collectors.toList());
        int count1=s.size();
        System.out.println(s);
        s1.clear();
        s.clear();
        checkcountofsubsequences(m,b,s,s1,0);
        s=s.stream().distinct().collect(Collectors.toList());
        System.out.println(s);
        int count2=s.size();
        return count1>count2?a:b;
    }

    static void checkcountofsubsequences(int n, String a, List<String> s,List<String> s1,int i){
        if(i==n){
            return;
        }
        if(s1.isEmpty()){
            s1.add(String.valueOf(a.charAt(i)));
        }else s1.add(s1.get(s1.size()-1)+a.charAt(i));
        s.addAll(s1);
        checkcountofsubsequences(n,a,s,s1,i+1);
        s1.remove(s1.size() - 1);
        checkcountofsubsequences(n,a, s,s1,i+1);
    }
    public static void main(String[] args) {
        System.out.println(moreSubsequence(4,4,"abcd","ddda"));
    }
}
