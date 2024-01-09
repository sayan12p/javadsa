package com.java.search;

import java.util.Arrays;

public class SearchinRowWiseSortedMatrix {
    public static int[] findElement(int[][] mat, int x)
    {
        //You Can Code Here
    int R=mat.length;int[] result=new int[2];
    Arrays.fill(result,-1);
    int C=mat[0].length;
    for(int i=0;i<R;i++){
       int column= binarySearchfor(mat[i],x,mat[i].length);
       if(column!=-1){
           result[0]=i;
           result[1]=column;
           return result;
       }
    }
    return result;
    }

    private static int binarySearchfor(int[] mat, int target, int c) {
        int low=0; int high=c-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target==mat[mid]) return mid;
            if(mat[mid]<=target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
    int[][] x=new int[][]{
            {1 ,18},
            {21 ,24},
            {48 ,84} };
        System.out.println(Arrays.toString(findElement(x,18)));
    }
}
