package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target)
    {
        //You can code here
        List<Integer> subset=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        combinationsumhelper(candidates,subset,result,target,0);
        return result;
    }

    private static void combinationsumhelper(int[] candidates, List<Integer> subset, List<List<Integer>> result, int sum, int i) {
        if(sum==0){
            if(!result.contains(subset))
                result.add(new ArrayList<>(subset));
            return;
        }
        for(int index=i;index<candidates.length;index++){
            if(candidates[index]>sum) continue;
            subset.add(candidates[index]);
            combinationsumhelper(candidates,subset,result,sum-candidates[index],index+1);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5},8));
    }
}
