package com.java.search;

import java.util.Arrays;
import java.util.List;

public class Peakelement {

    public static int findPeak(List<Integer> A)
    {
        //You Can Code Here
        Integer[] a = A.stream().toArray(Integer[]::new);
        int n=a.length;
        int low=0;int high=n-1;
        if(n==1) return 0;
        if(a[0]>a[1]) return 0;
        if(a[n-1]>a[n-2]) return n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1]) return mid;
            if(a[mid]>a[mid-1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> a= Arrays.asList(4, 5, 6, 7, 8, 1);
        System.out.println(findPeak(a));
    }
}
