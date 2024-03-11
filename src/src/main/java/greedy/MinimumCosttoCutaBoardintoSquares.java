package com.java.greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinimumCosttoCutaBoardintoSquares {

    public static long minimumCostOfBreaking(int[] X, int[] Y, int M, int N) {
        //You can code here
        Integer[] x=Arrays.stream(X).boxed().toArray(Integer[]::new);
        Integer[] y=Arrays.stream(Y).boxed().toArray(Integer[]::new);
        Arrays.sort(x,Collections.reverseOrder());
        Arrays.sort(y,Collections.reverseOrder());int cost=0;int horboardcount=1;int verboardcount=1;
        int i=0;int j=0;//i->V j->H
        while(i<y.length && j<x.length){
            if(x[j]<y[i]){
                cost+=horboardcount*y[i];
                verboardcount++;
                i++;
            }else{
                cost+=verboardcount*x[j];
                horboardcount++;
                j++;
            }
        }
        int totalverticalcost=0;
        while(i<y.length){
            totalverticalcost+=y[i++];
        }
        cost+=totalverticalcost;
        int totalhorizontalcost=0;
        while(j<x.length){
            totalhorizontalcost+=x[j++];
        }
        cost+=totalhorizontalcost;
        return cost;
    }
    public static void main(String[] args) {
int[]x={1,2,3};
int[] y={4,5,6};
        System.out.println(minimumCostOfBreaking(x,y,4,1));
    }
}
