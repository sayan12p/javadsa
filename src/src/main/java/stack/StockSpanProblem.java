package com.java.stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class StockSpanProblem {

    public static int[] calculateSpan(int price[], int n)
    {
        //You can code here
       int[] s=new int[n];
       s[0]=1;
        ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
        arrayDeque.push(0);
        for(int i=1;i<n;i++) {
            while (!arrayDeque.isEmpty()) {
                int top = arrayDeque.peek();
                if (price[top] > price[i]) break;
                else arrayDeque.pop();
            }
            if (arrayDeque.isEmpty()) {
                s[i]=i+1;
            }else{
                s[i]=i-arrayDeque.peek();
            }
            arrayDeque.push(i);
        }
        return s;
    }

    public static void main(String[] args) {
    int[] a=new int[]{100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(calculateSpan(a,7)));
    }
}
