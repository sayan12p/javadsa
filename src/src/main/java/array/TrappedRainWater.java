package com.java.array;

public class TrappedRainWater {

    public static long trap(int[] h) {
        //You can code here
    int n=h.length;
    int[] leftmax=new int[n];int count=0;
    leftmax[0]=h[0];
    int[] rightmax=new int[n];
    rightmax[n-1]=h[n-1];
    for(int i=1;i<n;i++){
        leftmax[i]=Math.max(h[i],leftmax[i-1]);
    }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(h[i],rightmax[i+1]);
        }
        for(int i=0;i<n;i++){
            count+=Math.min(leftmax[i],rightmax[i])-h[i];
        }
        return count;
    }
    public static void main(String[] args) {
    int[] h=new int[]{1, 2, 1, 2, 1};
        System.out.println(trap(h));
    }
}
