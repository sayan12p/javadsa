package com.java.greedy;

import java.util.Arrays;

public class DistributeCandy {

    public static int minCandy(int ratings[], int N) {
        //You can code here
        int[] resultcandies=new int[N]; int sum=0;
        for(int i=0;i<N;i++){
            resultcandies[i]=1;
        }
        for(int i=1;i<N;i++){
            if(ratings[i]>ratings[i-1]){
                resultcandies[i]=resultcandies[i-1]+1;
            }
        }
        for(int i=N-1;i>=1;i--){
            if(ratings[i-1]>ratings[i] && resultcandies[i-1]<=resultcandies[i]){
                resultcandies[i-1]=resultcandies[i]+1;
            }
        }
        for(int i=0;i<resultcandies.length;i++){
            sum+=resultcandies[i];
        }
        return sum;
    }
    public static void main(String[] args) {
    int[] ratings={1,0,2};
        System.out.println(minCandy(ratings,3));
    }
}
