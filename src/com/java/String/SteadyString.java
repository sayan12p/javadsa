package com.java.String;

import java.util.HashMap;
import java.util.Map;

public class SteadyString {

    public static int getsteadystring(String s){
        Map<Character,Integer> frequencymap=new HashMap<>();
        int n=s.length();int i=0;
        int expectedfreq=n/4;int minlen=n;
        for(int a=0;a<n;a++){
            char cur=s.charAt(a);
                if (frequencymap.containsKey(cur)) {
                    frequencymap.put(cur, frequencymap.get(cur) + 1);
                } else {
                    frequencymap.put(cur, 1);
                }
        }
        if(!frequencymap.containsKey('Q')) frequencymap.put('Q',0);
        if(!frequencymap.containsKey('W')) frequencymap.put('W',0);
        if(!frequencymap.containsKey('E')) frequencymap.put('E',0);
        if(!frequencymap.containsKey('R')) frequencymap.put('R',0);
        for(int j=0;j<n;j++) {
            char cur = s.charAt(j);
            frequencymap.put(cur, frequencymap.get(cur) - 1);
            while (i <= j && frequencymap.get('Q') <= expectedfreq && frequencymap.get('W') <= expectedfreq
                    && frequencymap.get('E') <= expectedfreq
                    && frequencymap.get('R') <= expectedfreq) {
                minlen = Math.min(minlen, j - i + 1);
                System.out.println(s.substring(i,j+1));
                frequencymap.put(cur, frequencymap.get(cur) + 1);
                i++;
            }
        }
        return minlen;
    }
    public static void main(String[] args) {
        String s="WQWRWEQW";
        System.out.println(getsteadystring(s));
    }
}
