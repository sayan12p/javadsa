package com.java.array;

import java.util.Arrays;

public class MinimiseTheMaximumDifferenceBetweenTheHeights {

    public static int getMinDiff(int[] A, int n, int k) {
        //You can code here
        Arrays.sort(A);
        int ans=A[n-1]-A[0];
        for(int x=1;x<n-1;x++){
            int min=Math.min(A[x]-k,A[0]+k);
            int max=Math.max(A[x-1]+k,A[n-1]-k);
            ans=Math.min(max-min,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getMinDiff(new int[]{1, 15, 10},3,6));
    }
}
