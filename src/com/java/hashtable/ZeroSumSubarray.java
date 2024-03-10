package com.java.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZeroSumSubarray {

    public static boolean findsum(int arr[], int n)
    {
        //You can code here
        HashMap<Integer,Integer> map=new HashMap<>();int sum=arr[0];
        map.put(0,arr[0]);
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            map.put(i,sum);
        }
        HashSet<Integer> sumlist=new HashSet<>(map.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList()));
        if (sumlist.size()!=map.values().size()) return  true;
        return false;
    }
    public static void main(String[] args) {
        int[] a=new int[]{4, 2, -3, 1, 6};
        System.out.println(findsum(a,5));
    }
}
