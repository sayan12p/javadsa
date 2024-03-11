package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class InterestingArray {
//    Optimal Solution:
//
//            1.    If any element in the array is even then it can be made 0.
//    Split that element in two equal parts of arr[i]/2 and arr[i]/2.
//    XOR of two equal numbers is zero. Therefore this strategy makes an element 0.
//2.    If any element is odd.
//    Split it into two parts: 1 and arr[i]-1. Since arr[i]-1 is even, it can be made 0 by the above strategy.
//    Therefore an odd element can reduce its size to 1. Two odd elements can, therefore, be made 0 by following the above strategy
//    and finally XOR them (i.e. 1) as 1 XOR 1 = 0.
//    Therefore if the number of odd elements in the array is even, then the answer is possible.
//    Otherwise, an element of value 1 will be left and it is not possible to satisfy the condition.
    public static int isInteresting(int[] arr)
    {
        int noofodd=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==1) noofodd++;
        }
        if(noofodd%2==0){
            return 1;
        }
        else if(noofodd%2==1){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isInteresting(new int[]{9,17}));
    }
}
