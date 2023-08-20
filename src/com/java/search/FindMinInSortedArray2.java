package com.java.search;

public class FindMinInSortedArray2 {
	
public static int findMin(int[] nums) {
      int low=0;int high=nums.length-1;
      int mid=0;int ans=Integer.MAX_VALUE;
      if(nums.length==1) return nums[0];
      while(low<=high) {
    	  mid=low+(high-low)/2;
    	  if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
        	  ans=Math.min(ans,nums[high]);
        	  low++;
        	  high--;
        	  continue;
          }
    	  //if the left part is sorted.
    	  if(nums[low]<=nums[mid]) {
    		  ans=Math.min(ans, nums[low]);
    		 low=mid+1;
    	  }else 
    	  //if the right half is sorted.
    	  {
    		  high=mid-1;
    		  ans=Math.min(ans, nums[mid]);
    		  }
    	  }
      return ans;
    }
	public static void main(String[] args) {
		int[] nums= {10,1,10,10,10};
		System.out.println(findMin(nums));
	}
}
