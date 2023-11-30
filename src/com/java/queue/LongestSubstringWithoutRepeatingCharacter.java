package com.java.queue;


import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {
        //You can code here
        HashSet<Character> set=new HashSet<>();
       int maxlen=Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<s.length();r++){
            char cur=s.charAt(r);
            if(set.contains(cur)) {
                while (!set.isEmpty() && set.contains(s.charAt(l)) && l < r) {
                    set.remove(cur);
                    l++;
                }
            }
                set.add(cur);
                System.out.println("substring " + s.substring(l, r + 1));
                maxlen = Math.max(r - l + 1, maxlen);
        }
return maxlen;
    }
    public static void main(String[] args) {
        String s="abcaabcdba";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
