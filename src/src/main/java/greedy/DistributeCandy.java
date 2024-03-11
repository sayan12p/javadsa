package com.java.greedy;

import java.util.Arrays;

public class DistributeCandy {

    public static int minCandy(int ratings[], int N) {
        //You can code here
        int[] resultcandies=new int[N];
        Arrays.fill(resultcandies,1); int sum=0;
        for(int i=1;i<N;i++){
            if(ratings[i]>ratings[i-1]){
                resultcandies[i]=resultcandies[i]+1;
            }
        }

        for(int i=N-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && resultcandies[i]<resultcandies[i+1]){
                resultcandies[i]=resultcandies[i]+1;
            }
        }
        for(int i:resultcandies){
           sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
    int[] ratings={1,0,2};

    }
}
