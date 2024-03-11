package com.java.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortarrayusingStack {

    public static int find10thmaximumelement(List<Integer> array){
        ArrayDeque<Integer> currentstack=new ArrayDeque<>();int[] result=new int[array.size()];
        for(int i=0;i<array.size();i++)
            currentstack.push(array.get(i));
        ArrayDeque<Integer> tempstack=new ArrayDeque<>();
        while(!currentstack.isEmpty()){
            int currentelement=currentstack.pop();
            while(!tempstack.isEmpty() && tempstack.peek()>currentelement) {
                currentstack.push(tempstack.pop());
            }
                tempstack.push(currentelement);
            }
        while(!tempstack.isEmpty()){
            currentstack.push(tempstack.pop());
        }
        System.out.println(currentstack);
        array=currentstack.stream().distinct().collect(Collectors.toList());
        return array.get(9);
    }



    public static void main(String[] args) {
        List<Integer> inputarray=Arrays.asList(12,12,34,54,67,76,67,87,43,52,24,82);
        find10thmaximumelement(inputarray);
    }
}
