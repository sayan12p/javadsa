
package com.java;
import linklist.ListNode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test
{
    public static List<List<String>> groupAnagrams(List<String> strs) {

    List<List<String>> result=new ArrayList<>();
    for(int i=0;i<strs.size();i++){
        String currentword=strs.get(i);
        List<String> sublist=new ArrayList<>();
        sublist.add(currentword);
        for(int j=i+1;j<strs.size()-1;j++) {
            String nextword = strs.get(j);
            Map<Character, Long> freqmap1 = currentword.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            Map<Character, Long> freqmap2 = nextword.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            if (freqmap1.equals(freqmap2)) {
                if(!sublist.contains(nextword)) {
                    sublist.add(nextword);
                }
            }
        }
        result.add(sublist);
    }
    return result;
    }
    public static void main(String[] args) {
    List<String> anagramlist=new ArrayList<>(Arrays.asList("eat","tea","tan","ate","nat","bat"));
    System.out.println(groupAnagrams(anagramlist));
    }
}
