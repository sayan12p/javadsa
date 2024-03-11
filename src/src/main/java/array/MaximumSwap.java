package com.java.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static com.java.array.FirstMissingInteger.swap;

public class MaximumSwap {
    public static int maximumSwap(int num) {
    char[] arr=String.valueOf(num).toCharArray();
    //right index array to find the last right index of the digit.
    int[] rightindex=new int[10];
    for(int i=0;i<arr.length;i++){
        rightindex[arr[i]-'0']=i;
    }
    for(int i=0;i<arr.length;i++){// index of present digit we are looking at
        for(int j=9;j>arr[i]-'0';j--){// max digit could be 9 and min be GREATER than the present digit we looking at
            if(rightindex[j]>i){ // if index of 'j' (starts with 9) is greater than present index (basically, is the bigger digit at RIGHT of present digit)
                char temp=arr[i];
                arr[i]=arr[rightindex[j]];
                arr[rightindex[j]]=temp;
                return Integer.valueOf(new String(arr));
            }
        }
    }
    return num;
    }
    public static int indexOf(int[] arr, int val) {
        return IntStream.range(0, arr.length).filter(i -> arr[i] == val).findFirst().orElse(-1);
    }
    public static void main(String[] args) {
      int num=2736;
        System.out.println(maximumSwap(num));
    }
}
