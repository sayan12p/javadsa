package com.java.recurrsion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak2 {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
    return getwordBreak(s,set,0,new HashMap<>());
    }

    private static List<String> getwordBreak(String s, HashSet<String> set, int start, HashMap<Integer,List<String>> hm) {
        List<String> result=new ArrayList<>();
        if(hm.containsKey(start)){
            return hm.get(start);
        }
        if(start==s.length()){
            result.add("");
        }
        for(int end=start+1;end<=s.length();end++){
            String prefix=s.substring(start,end);
            if(set.contains(prefix)) {
               List<String> sufixes=getwordBreak(s,set,end,hm);
               for(String a:sufixes) {
                   result.add(prefix + (a.equals("")?"":" ")+ a);
               }
            }
        }
        hm.put(start,result);
        return result;
    }

    public static void main(String[] args) {
        List<String> worddict=List.of("cat","cats","and","sand","dog");
        System.out.println(wordBreak("catsanddog",worddict));
    }
}
