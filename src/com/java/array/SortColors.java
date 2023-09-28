package com.java.array;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {
        int l=0;int m=0;int r=nums.length-1;
        while(m<=r){
            if(nums[m]==2){
                nums[m]=nums[r];
                nums[r]=2;
                m++;
                r--;
            }
            if(nums[m]==0){
                nums[m]=nums[l];
                m++;
                l++;
            }
            if(nums[m]==1){
                m++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums=new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
