package com.java.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class NearestSmallerElement {

    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> A)
    {
        //You can code here
        ArrayDeque<Integer> a=new ArrayDeque<>();
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<A.size();i++){
            int currentelement=A.get(i);
            while(!a.isEmpty()  && A.get(a.peek()) >= currentelement) {
                a.pop();
            }
            if(a.isEmpty()) result.add(-1);
            if(!a.isEmpty()) result.add(A.get(a.peek()));
            a.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
       ArrayList<Integer> a= new ArrayList<>(Arrays.asList( 3, 4, 2, 7, 8, 1, 9));
        System.out.println(prevSmaller(a));
    }
}
