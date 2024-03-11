package com.java.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberinWindow {

    public static List<Integer> firstNegative(int[] arr, int n, int k)
    {
        //You can code here
        List<Integer> list=new ArrayList<>();
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        int i=0;
       for(int j=0;j<n;j++) {
           if (arr[j] < 0) {
               queue.offer(arr[j]);
           }
           if (j - i + 1 == k) {
               if (queue.isEmpty()) list.add(0);
               else {
                   int num = queue.peek();
                   list.add(num);
                   if (num == arr[i]) queue.pop();
               }
               i++;
           }
       }
        return list;
    }
    public static void main(String[] args) {
    int[] arr=new int[]{-8, 2, 3, -6, 10};
        System.out.println(firstNegative(arr,5,2));
    }
}
