package com.java.hashtable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] A)
    {
        //You can code here
        Set<Integer> set=new HashSet<>();
        for(int i:A){
            set.add(i);
        }
        int ans=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int len=1;
                while(set.contains(num+1)){
                    len=len+1;
                    num=num+1;
                }
                ans=Math.max(len,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] a=new int[]{1, 2, 0, 1};
        System.out.println(longestConsecutive(a));
    }
}
