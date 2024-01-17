package com.java.greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinimumProductofSubarray {

    public static int minProductSubset(int a[], int n)
    {
        //You can code here
        int negmax=Integer.MIN_VALUE;
        int posmin=Integer.MAX_VALUE;
        int countofneg=0;
        int countofzeros=0;int product=1;int minproduct=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                countofzeros++;
            }
            //maximum negative number
            if(a[i]<0){
                countofneg++;
                negmax=Math.max(a[i],negmax);
            }
            // min positive number
            if(a[i]>0 && a[i]<posmin){
                posmin=a[i];
            }
            product*=a[i];
        }
        if(countofneg%2==0 && countofzeros==0){
            minproduct=product/negmax;
        }
        if(countofneg%2!=0 && countofzeros==0){
            minproduct=product;
        }
        if(countofzeros>0 && countofneg==0){
            minproduct=0;
        }
        if(countofzeros==0 && countofneg==0){
            minproduct=posmin;
        }
        return minproduct;
    }
    public static void main(String[] args) {
    int a[]=new int[]{-1, -1, -2, 4, 3 };
        System.out.println(minProductSubset(a,5));
    }
}
