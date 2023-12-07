package com.java.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static List<Integer> maxSlidingWindow(int[] nums, int k)
    {
        //You can code here
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        List<Integer> result=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(!queue.isEmpty() && i==k-1){
                queue.pop();
            }
            int cur=nums[i];
            while(!queue.isEmpty() && nums[queue.peekLast()]<cur){
                queue.pollLast();
            }
            queue.push(i);
            if(i>=k-1){
               result.add(nums[queue.peek()]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
    int[] nums=new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3));
    }
}
