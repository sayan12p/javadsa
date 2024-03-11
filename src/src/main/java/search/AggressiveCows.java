package com.java.search;

import java.util.Arrays;

public class AggressiveCows {
    public static int solve(int n, int k, int[] stalls) {
        //You can code here
        Arrays.sort(stalls);
        int low=1;int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(mincowdistance(stalls,mid,k)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }

    public static  boolean mincowdistance(int[] stalls,int mid,int k){
        int lastdistance=stalls[0];
        int n=stalls.length;int countofcows=1;
        for(int i=1;i<n;i++){
            if(stalls[i]-lastdistance>=mid){
                countofcows++;
                lastdistance=stalls[i];
            }
            if(countofcows>=k) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] stalls={1 ,2 ,4, 8, 9};
        System.out.println(solve(5,3,stalls));
    }
}
