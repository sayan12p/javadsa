package com.java.search;

import java.util.Arrays;

public class SearchInRotatedSubArray {
public static int search(int[] nums, int target) {
//  Arrays.sort(nums);
  int low=0;int high=nums.length-1;int mid=0;
  while(low<=high) {
	  mid=low+(high-low)/2;
	  if(nums[mid]==target) return mid;
	  if(nums[low]<=nums[mid]) { 
		if(nums[low]<=target && target<=nums[mid]) {
			//eliminate the right half
		  high=mid-1;
	  }else {
		  //eleimate the left helf
		  low=mid+1;
	  }
	  }else {
	  if(nums[mid]<=target && target<=nums[high]) {
		  low=mid+1;
	  }else {high=mid-1;}
	  }
  }
 
  return -1;

    }
	public static void main(String[] args) {
		int[] nums=new int[] {4,5,6,7,0,1,2};
		System.out.print(search(nums,2));
	}
}
