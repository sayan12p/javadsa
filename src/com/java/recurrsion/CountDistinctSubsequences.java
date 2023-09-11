package com.java.recurrsion;

import java.util.HashMap;

public class CountDistinctSubsequences {
   // https://www.youtube.com/watch?v=9UEHPiK53BA
    static long countnoofSubsequences(String s){
        long[] dp=new long[s.length()+1];
        dp[0]=1;
        HashMap<Character,Integer> lo=new HashMap<>();
        for(int i=1;i<dp.length;i++){
            dp[i]=2*dp[i-1];
            char ch=s.charAt(i-1);
            if(lo.containsKey(ch)){
                int index=lo.get(ch);
                dp[i]=dp[i]-dp[index-1];
            }
            lo.put(ch,i);
        }
        return dp[s.length()]-1;
    }
    public static void main(String[] args) {
        System.out.println(countnoofSubsequences("abccd"));
    }
}
