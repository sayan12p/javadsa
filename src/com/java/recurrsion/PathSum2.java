package com.java.recurrsion;

import java.util.ArrayList;
import java.util.List;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class PathSum2 {

    public static List<List<Integer>> pathSum(TreeNode root,int targetSum) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        getPathSumhelper(result,root,targetSum,subset);
        return result;
    }

    private static void getPathSumhelper(List<List<Integer>> result, TreeNode root, int targetSum, List<Integer> subset) {
        if(root==null) return;
       if(root.left==null && root.right==null){
           if(targetSum-root.val==0){
               List<Integer> r=new ArrayList<>(subset);
               r.add(root.val);
               result.add(r);
           }
           return;
       }
        subset.add(root.val);
        getPathSumhelper(result,root.left,targetSum- root.val,subset);
        getPathSumhelper(result,root.right,targetSum- root.val,subset);
        subset.remove(subset.size()-1);
    }


    public static void main(String[] args) {
        System.out.println(pathSum(new TreeNode(5,new TreeNode(4,
                new TreeNode(11,new TreeNode(7),new TreeNode(2)),null),
                new TreeNode(8,new TreeNode(13,null,null),
                        new TreeNode(4,new TreeNode(5,null,null),
                                new TreeNode(1,null,null)))),22));
    }
}
