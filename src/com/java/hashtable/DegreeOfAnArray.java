package com.java.hashtable;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {
        //You can code here
    Map<Integer,Integer> countmap=new HashMap<>();
    Map<Integer,Integer> firstmap=new HashMap<>();
    Map<Integer,Integer> secondmap=new HashMap<>();
    int minlength=Integer.MAX_VALUE;int maxfreq=0;
    int degree=0;
    for(int i=0;i<nums.length;i++) {
        if (!firstmap.containsKey(nums[i])) {
            firstmap.put(nums[i], i);
        }
        secondmap.put(nums[i],i);
        countmap.put(nums[i], countmap.getOrDefault(nums[i], 0) + 1);
        maxfreq=countmap.entrySet().stream().sorted((e1,e2)-> e2.getValue()-e1.getValue()).collect(Collectors.toList()).get(0).getValue();

    }
    for(Map.Entry<Integer,Integer> m:countmap.entrySet()){
        if(m.getValue()==maxfreq){
            minlength=Math.min(minlength,secondmap.get(m.getKey())-firstmap.get(m.getKey())+1);
        }
    }
    return minlength;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,2,2,3,1};
        System.out.println(findShortestSubArray(a));
    }
}
