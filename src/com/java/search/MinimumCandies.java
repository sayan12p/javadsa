package com.java.search;

import java.util.Arrays;

public class MinimumCandies {
	 public static int maximumCandies(int[] candies, long k) {
		 Arrays.sort(candies);int sum=0;
		 for(int i:candies) sum+=i;
	     int low=1;int high=sum;int mid=0;
	     while(low<=high) {
	    	 mid=low+(high-low)/2;
	    	 if(mid==0) return high;
	    	 if(countofcandies(mid,candies)>=k) {
	    		 low=mid+1;
	    	 }else {
	    		 high=mid-1;
	    	 }
	     }
	     return  low-1;
	    }
	 private static int countofcandies(int mid,int[] candies) {
		 int countoftotalcandies=0; 
		 for(int i=0;i<candies.length;i++) {
			 countoftotalcandies+=candies[i]/mid;
		 }
		 return countoftotalcandies;
	 }
	 
	 public static void main(String args[]) {
		 int[] candies=new int[] {5,8,6};
		 System.out.println(maximumCandies(candies, 3));
	 }
}
