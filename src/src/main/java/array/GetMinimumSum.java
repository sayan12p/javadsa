package com.java.array;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class GetMinimumSum {
//    https://www.geeksforgeeks.org/minimize-sum-of-an-array-by-at-most-k-reductions/
    public static  int sum(List<Integer> inputarray,int k){
        int minmum=0;
        PriorityQueue<Integer> p=new PriorityQueue<>((i,j)->j-i);
        for(int i:inputarray){
            p.offer(i);
        }
        System.out.println("queue elements before operation" + p);
        while(!p.isEmpty() && k>0){
            int m=p.poll();
            m= (int) Math.ceil(m/2);
            p.offer(m);
            k--;
        }
        System.out.println("queue elements after operation" + p);
        while(!p.isEmpty()){
         minmum+=p.poll();
        }
        return minmum;
    }

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(10, 4, 6, 16);
        System.out.println(sum(l,3));
    }
}
