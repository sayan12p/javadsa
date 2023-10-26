package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifference {

    public static List<List< Integer>> minimumAbsDifference(int[] arr)
    {
        //You can code here
        Arrays.sort(arr);
        int n=arr.length;
        int mindiff=arr[1]-arr[0];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<n-1;i++) {
            int j = i + 1;
            int diff = Math.abs(arr[j] - arr[i]);
            if (diff < mindiff) mindiff = diff;
        }
        for(int i=0;i<n-1;i++) {
            int j=i+1;
            int diff=Math.abs(arr[j]-arr[i]);
            if (diff == mindiff) {
                List<Integer> sub = new ArrayList<>();
                sub.add(arr[i]);
                sub.add(arr[j]);
                result.add(sub);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={-131, -80, 162, -101, -89 ,-4, 29, 100 ,10 ,-163 ,21 ,-157, -31 ,-184, 135, 124, -56};
        System.out.println(minimumAbsDifference(arr));
    }
}
