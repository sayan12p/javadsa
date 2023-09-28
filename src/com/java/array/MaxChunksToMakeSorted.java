package com.java.array;

public class MaxChunksToMakeSorted {
    //https://www.youtube.com/watch?v=XZueXHOhO5E
    public static int maxChunksToSorted(int[] arr) {
        //You can code here
        int max=0; int count=0;int i=0;
        for(;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            if(i==max) count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(maxChunksToSorted(arr));
    }
}

