package com.java.search;


public class SearchInRotatedSubArray {
public static int search(int[] nums, int target) {
//  Arrays.sort(nums);
  int low=0;int high=nums.length-1;int mid=0;
  while(low<=high) {
	  mid=(high+low)/2;
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
	  }else {
		  high=mid-1;
	  }
	  }
  }
 
  return -1;

    }
	public static void main(String[] args) {
		int[] nums=new int[] {555 ,571 ,600 ,603, 615, 617 ,627 ,633 ,637 ,659 ,671 ,678, 689, 700, 759, 771, 774,789 ,819, 844 ,852,877, 883, 893, 913 ,938 ,
				939, 944, 980, 982, 986 ,3 ,12, 23, 36, 39, 57, 62, 68, 93 ,103 ,127 ,154, 184 ,196 ,216 ,218 ,245, 283 ,290, 294, 298, 299
				,317, 329, 337, 344, 368, 378, 382, 392, 417, 439, 461, 490, 504, 513, 517, 555};
		System.out.println(search(nums,337));
	}
}
