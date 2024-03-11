package com.java.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/
public class SubsetsWithDuplicates {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        Arrays.sort(nums);
        getsubsetshelper(nums,0,subset,result);
        return result;
    }

    private static void getsubsetshelper(int[] nums, int i, List<Integer> subset, List<List<Integer>> result) {
        if (nums.length == 0) {
            result.add(new ArrayList<>(subset));
        }
        if(!result.contains(subset))
        result.add(new ArrayList<>(subset));
        for(int index=i;index<nums.length;index++){
            subset.add(nums[index]);
            getsubsetshelper(nums,index+1,subset,result);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }
}
