package com.java.search;

import java.util.Arrays;

public class FirstOccurence {

    public static int findfirstoccurence(int[] nums,int k){
        Arrays.sort(nums); int ans=-1;
        int l=0;int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<k){
                l=m+1;
            }
            else if(nums[m]>k){
                r=m-1;
            }
            else{
                r=m-1;
                ans =m;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,2,6,8,8};
        System.out.println(findfirstoccurence(nums,2));
    }
}
