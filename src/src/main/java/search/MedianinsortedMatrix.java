package com.java.search;

public class MedianinsortedMatrix {

    public static int median(int matrix[][], int R, int C) {
        //You can code here
        int low=1;int high=R*C;
        while(low<=high){
            int mid=(low+high)/2;
            int count=0;
            for(int i=0;i<R;i++){
                count+=getsmallerelements(matrix[i],mid,C);
            }
            if(count<=(R*C)/2){
                low=mid+1;
            }else high=mid-1;
        }
        return low;
    }

    private static int getsmallerelements(int[] matrix, int mid, int c) {
        int low=0;int high=c-1;
        while(low<=high){
            int mid1=(low+high)/2;
            if(matrix[mid1]>mid) high=mid1-1;
            else low=mid1+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] a=new int[][]{{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(median(a,3,3));
    }
}
