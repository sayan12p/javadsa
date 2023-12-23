package com.java.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int a[]={4,5,2,25};

        int[] result=new int[a.length];result[a.length-1]=-1;
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }
        for(int i=a.length-1;i>=0;i--){
            int result1=-1;
            while(!stack.isEmpty() && stack.peek()<=a[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) result1=stack.peek();
            stack.push(a[i]);
            if(map.containsKey(a[i])){
                result[map.get(a[i])]=result1;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
