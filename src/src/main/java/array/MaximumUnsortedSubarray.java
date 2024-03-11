package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumUnsortedSubarray {
//    https://www.youtube.com/watch?v=p7rnuGsau6g
    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        // You can code here
        ArrayList<Integer> result=new ArrayList<>();
        int n=A.size();
        int correcti=0; int correctj=n-1;int i=0;
        for(correcti=0;correcti<n-1;correcti++) {
            if (A.get(correcti) > A.get(correcti + 1)) break;
        }
        if(correcti==n-1){
                result.add(-1);
                return result;
        }


        for(correctj=n-1;correctj>=0;correctj--){
            if(A.get(correctj)<A.get(correctj-1))
                break;
        }
        int min=A.get(correcti);int max=A.get(correcti);
        for(i=correcti+1;i<correctj;i++) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        for(i=0;i<correcti;i++){
            if(A.get(i)>min){
                correcti=i;
                break;
            }
        }
        for( i=n-1;i>=correctj+1;i--){
            if(A.get(i)<max){
                correctj=i;
                break;
            }
        }
        result.add(correcti);
        result.add(correctj);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A= new ArrayList<>(Arrays.asList(1,2));
        System.out.println(subUnsort(A));
    }
}
