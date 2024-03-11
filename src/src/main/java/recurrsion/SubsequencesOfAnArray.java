package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesOfAnArray {

    static void subsequences(int[] a){
        List<Integer> cur=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        helpersubsequence(a,cur,result,0);
        System.out.println(result);
    }

    static void helpersubsequence(int[] a, List<Integer> cur, List<List<Integer>> result, int index){
        result.add(new ArrayList<>(cur));
        for(int i=index;i<a.length;i++){
            cur.add(a[i]);
            helpersubsequence(a,cur,result,i+1);
            cur.remove(cur.size()-1);
        }
    }
    public static void main(String[] args) {
        subsequences(new int[]{4,5,6});
    }
}
