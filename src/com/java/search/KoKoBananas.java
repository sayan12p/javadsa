package com.java.search;

import java.util.Arrays;

public class KoKoBananas {

public static int minEatingSpeed(int[] piles, int h) {
		Arrays.sort(piles);
        int l=piles[0];int high=piles[piles.length-1];int mid=0;
        while(l<=high) {
        	mid=(high+l)/2;
        	if(count(mid,piles)<=h) {
        		high=mid-1;
        	}else {
        		l=mid+1;
        	}
        }
        return l;
    }

private static int count(int mid,int[] piles) {
	int count=0;
	for(int i=0;i<piles.length;i++) {
	if(piles[i]%mid>0) count+=piles[i]/mid+1;
	if(piles[i]%mid==0) count+=piles[i]/mid;
	}
	return count;
}

public static void main(String args[]) {
	int[] piles=new int[] {3,6,7,11};
	System.out.println(minEatingSpeed(piles, 8));
}
}
