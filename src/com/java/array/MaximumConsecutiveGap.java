package com.java.array;

import java.util.Arrays;

public class MaximumConsecutiveGap {

    public static int maximumGap(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        if(n<2) return 0;
        int i=0,j=1;
        int max=Integer.MIN_VALUE;
        while(i<n && j<n){
            max=Math.max(arr[j]-arr[i],max);
            i++;
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximumGap(new int[]{4, 4, 2, 5, 2, 9, 10, 3, 6, 6}));
    }
}
