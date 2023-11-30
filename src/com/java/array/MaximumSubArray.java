package com.java.array;

import java.util.ArrayDeque;

public class MaximumSubArray {

    public static int maxsubArray(int[] nums){
    int sum=0;int max=nums[0];
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        if(sum>max) {
            System.out.println(nums[i]);
            max=sum;
        }
        if(sum<0) sum=0;
    }
    return max;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxsubArray(nums));
    }
}
