package com.java.array;


import java.util.Stack;
//https://www.youtube.com/watch?v=g7FAZOJKGUA
public class MaxChunksToMakeSortedII {

    public static int maxChunksToSorted(int[] arr) {
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<arr.length;i++){
         int a=arr[i];
         while(!st.isEmpty() && st.peek()>arr[i]){
             a=Math.max(st.peek(),a);
             st.pop();
         }
         st.push(a);
     }
     return st.size();
    }


    public static void main(String[] args) {
        int[] arr={49, 94 ,49 ,13, 45 ,27 ,46 ,58};
        System.out.println(maxChunksToSorted(arr));
    }
}
