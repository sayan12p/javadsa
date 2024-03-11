package com.java.stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MaximumofMinimumforEveryWindowSize {

    public static int[] maxOfMin(int[] arr, int n) {
        //You can code here
        int[] leftmin=new int[n];
        leftmin[0]=-1;
        int[] rightmin=new int[n];
        rightmin[n-1]=n;
        int[] result=new int[n+1];
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
                while( !stack.isEmpty() && arr[stack.peek()]>=arr[i] ){
                    stack.pop();
                }
            if(!stack.isEmpty())
            leftmin[i]=stack.peek();
            else leftmin[i]=-1;
         stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while( !stack.isEmpty() && arr[stack.peek()]>=arr[i] ){
                stack.pop();
            }
            if(!stack.isEmpty())
                rightmin[i]=stack.peek();
            else rightmin[i]=n;
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println(Arrays.toString(leftmin));
        System.out.println(Arrays.toString(rightmin));
        for(int i=0;i<n;i++){
            result[rightmin[i]-leftmin[i]-2]=Math.max(result[rightmin[i]-leftmin[i]-2],arr[i]);
        }
        for(int i=n-2;i>=0;i--){
            result[i]=Math.max(result[i],result[i+1]);
        }
        return result;
    }
    public static void main(String[] args) {
    int[] arr=new int[]{10,20,30,50,10,70,30};
        System.out.println(Arrays.toString(maxOfMin(arr, 7)));
    }
}
