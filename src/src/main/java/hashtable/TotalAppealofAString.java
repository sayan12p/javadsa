package com.java.hashtable;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TotalAppealofAString {

    public static long appealSum(String s) {
        //You can code here
        int[] a = new int[26];
        long c=0;
        long ans=0;
        for(int i=0;i<s.length();i++)
        {
            c-=a[s.charAt(i)-'a'];
            ans+=c+=a[s.charAt(i)-'a']=i+1;
        }
        return ans;
    }
    public static void main(String[] args) {
      String s="mluoeqzxpz";
        System.out.println(appealSum(s));
    }
}
