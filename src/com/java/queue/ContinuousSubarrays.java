package com.java.queue;

import java.util.ArrayDeque;

public class ContinuousSubarrays {

    public static long continuousSubarrays(int[] nums) {
        //You can code here
        ArrayDeque<Integer> maxqueue=new ArrayDeque<>();
        ArrayDeque<Integer> minqueue=new ArrayDeque<>();
        int n=nums.length;
         long result=0;int l=0;int r=0;
       while(r<n){
            int cur=nums[r];
            while(!maxqueue.isEmpty() && maxqueue.peekLast()<cur){
                maxqueue.pollLast();
            }
            while(!minqueue.isEmpty() && minqueue.peekLast()>cur){
                minqueue.pollLast();
            }
            maxqueue.offer(cur);
            minqueue.offer(cur);
            if(!maxqueue.isEmpty() && !minqueue.isEmpty()){
                while(maxqueue.peekFirst()-minqueue.peekFirst()>2){
                    if(nums[l]==maxqueue.peekFirst()) maxqueue.pollFirst();
                    if(nums[l]==minqueue.peekFirst()) minqueue.pollFirst();
                    l++;
                }
            }
            result+=r-l+1;
            r++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={5,4,2,4};
        System.out.println(continuousSubarrays(nums));
    }
}
