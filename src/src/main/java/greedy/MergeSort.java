package com.java.greedy;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[], int l, int m, int r)
    {
        //You can code here
        int[]result=new int[r-l+1];
        int i=l;
        int j=m+1;int k=0;
        while(i<=m && j<=r){
            if(arr[i]<arr[j]){
                result[k++]=arr[i++];
            }else{
                result[k++]=arr[j++];
            }
        }
        while(i<=m){
            result[k++]=arr[i++];
        }
        while(j<=r){
            result[k++]=arr[j++];
        }
        System.out.println(Arrays.toString(result));
        int b=0;
        for(int a=l;a<=r;a++){
            arr[a]=result[b++];
        }
    }

    public static void mergeSort(int arr[], int l, int r)
    {
        //You can code here
        if(l<r){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    public static void main(String[] args) {
        int[] a=new int[]{ 10,50,21,40,60,70,45};
        mergeSort(a,0,6);
        System.out.println(Arrays.toString(a));
    }
}

