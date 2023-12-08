package com.java.queue;

public class MinimumNumberofIncrements {

    public static int minNumberOperations(int[] target) {
        //You can code here
        int operations=target[0];
        for(int i=1;i<target.length;i++){
            if(target[i]>target[i-1]){
                operations+=target[i]-target[i-1];
            }
        }
        return operations;
    }
    public static void main(String[] args) {
    int[] target={3,1,1,2};
        System.out.println(minNumberOperations(target));
    }
}
