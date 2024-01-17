package com.java.array;

import java.util.Arrays;

public class SortColors {
//Whenever I see 0, I swap it with element present at low position.
//When I get 1, I just let it be and when i encounter 2 I swap it with element at high position.
    public static void sortColors(int[] nums) {
        int l=0;int m=0;int r=nums.length-1;
        while(m<=r){
            if(nums[m]==2){
                nums[m]=nums[r];
                nums[r]=2;
                r--;
            }
            if(nums[m]==0){
                nums[m]=nums[l];
                nums[l]=0;
                m++;
                l++;
            }
            if(nums[m]==1){
                m++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,0,0,1,2,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
