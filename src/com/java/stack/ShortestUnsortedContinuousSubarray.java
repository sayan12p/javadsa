package com.java.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        //You can code here
        ArrayDeque<Integer> stack=new ArrayDeque<>();int pop=Integer.MAX_VALUE;
        int[] result=new int[nums.length];int lindex=0;int rindex=0;
        List<Integer> popedintergerlist=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while (!stack.isEmpty() && stack.peek()>nums[i]){
                pop= stack.pop();
                popedintergerlist.add(pop);
            }
            stack.push(nums[i]);
        }
        for(int i:popedintergerlist)
            insertatbottom(stack,i);
        System.out.println(stack);
        for(int i=result.length-1;i>=0;i--){
            result[i]=stack.pop();
        }
        for(int i=0;i<result.length;i++){
            if(result[i]!=nums[i]) {
                lindex = i;
                break;
            }
            }
        for(int i=result.length-1;i>=0;i--){
            if(result[i]!=nums[i]) {
                rindex = i;
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        return (rindex-lindex)!=0?rindex-lindex+1:0;
    }
    private static void insertatbottom(ArrayDeque<Integer> s, int item) {
        if(s.isEmpty() ||  s.peek()<item){
            s.push(item);
        }else if(s.peek()>item){
            int top=s.pop();
            insertatbottom(s,item);
            s.push(top);
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,2,3};
        System.out.println(findUnsortedSubarray(nums));
    }
}
