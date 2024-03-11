package com.java.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class KnapSackProblem {
    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
        //You can code here
        Map<Integer,Double> ratio=new HashMap<>();
        for(int i=0;i<values.length;i++){
            ratio.put(i, (double) (values[i]/weights[i]));
        }
        ratio=ratio.entrySet().stream().sorted((e1,e2)->-e1.getValue().compareTo(e2.getValue())).collect(Collectors.toMap(e->e.getKey(),e->e.getValue(),(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(ratio);
        double profit=0;
        for(Map.Entry<Integer,Double> m:ratio.entrySet()){
            if(weights[m.getKey()]<capacity){
                profit+=values[m.getKey()];
                capacity-=weights[m.getKey()];
            }else{
                double fractionprofit=m.getValue()*capacity;
                profit+=fractionprofit;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
    int[] values=new int[]{60,100};
    int[] weights=new int[]{10,20};
        System.out.println(fractionalKnapsack(values,weights,50));
    }
}
