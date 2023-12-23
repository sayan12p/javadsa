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
            {138, 1273, 2730, 3359, 4444, 5221, 6605, 7363 ,8887, 9307},
            {249, 1367, 2779, 3496, 4473, 5348, 6622, 7616, 8902, 9403},
            {330, 1376, 2857, 3728, 4485, 5461, 6670, 7651, 8953, 9614},
            { 341, 1514, 2899, 3937, 4488, 5656, 6755, 7881, 9056, 9621},
            {401, 1600, 2939, 3950, 4557,5701 ,7005 ,7906 ,9059 ,9641},
            {741, 1691, 2941, 3987, 4577, 5733, 7088, 8103, 9099, 9813},
            {761, 1872, 3246, 4056, 4617, 5837, 7181, 8212, 9162, 9880},
            {1047, 2076, 3251, 4193, 4836, 6073, 7246, 8737, 9278, 9898},
            {1119, 2180, 3343, 4299, 4918, 6436, 7306, 8804, 9286, 9908},
            {1266, 2600, 3350, 4369, 5114, 6598, 7329, 8838, 9290, 9920}};
        System.out.println(Arrays.toString(findElement(x,330)));
    }
}
