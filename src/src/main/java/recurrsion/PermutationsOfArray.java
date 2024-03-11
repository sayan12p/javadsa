package com.java.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArray {
    public static List<List<Integer>> permute(int[] nums) {
        //You can code here
        List<Integer> permutations=new ArrayList<>();
        List<List<Integer>> permutationslist=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        Arrays.sort(nums);
        return getallpermutations(nums,visited,permutations,permutationslist);
    }

    static List<List<Integer>> getallpermutations(int[] nums,boolean[] visited,List<Integer> permutations,List<List<Integer>> permutationslist){
        if(nums.length==0){
            permutationslist.add(permutations);
            return permutationslist;
        }
        if(nums.length==1){
            permutations.add(nums[0]);
            permutationslist.add(permutations);
            return permutationslist;
        }
        if(nums.length==permutations.size()){
            permutationslist.add(new ArrayList<>(permutations));
            return permutationslist;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            permutations.add(nums[i]);
            visited[i]=true;
            getallpermutations(nums,visited,permutations,permutationslist);
            permutations.remove(permutations.size()-1);
            visited[i]=false;
        }
        return permutationslist;
    }


    public static void main(String[] args) {
        System.out.println( permute(new int[]{1,2,3}));
    }
}
