package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class MissingandRepeatingNumber {

    public static Vector<Integer> findNumbers(int[] a)
    {
        Vector<Integer> result=new Vector<>();
        Arrays.sort(a);

        for(int i=0;i<a.length;i++){
            int x=Math.abs(a[i]);
            if(a[x-1]>0) a[x-1]=a[x-1]*-1;
            }
        for(int i=0;i<a.length;i++){
            if(a[i]>0) result.add(i+1);
        }
        for(int i=0;i<a.length-1;i++){
        if (Math.abs(a[i]) == Math.abs(a[i + 1])) {
            result.add(Math.abs(a[i]));
        }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1, 1};
        System.out.println(findNumbers(a).toString());
    }
}
