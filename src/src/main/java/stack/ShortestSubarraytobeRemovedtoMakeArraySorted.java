package com.java.stack;

import java.util.*;

public class ShortestSubarraytobeRemovedtoMakeArraySorted {
    public static int findLengthOfShortestSubarray(int[] arr) {
        int left=0;
        while(left+1<arr.length && arr[left]<=arr[left+1]){
            left++;
        }
        int right=arr.length-1;
        while(right>left && arr[right-1]<=arr[right]){
            right--;
        }
        if(left==right) return 0;
        int result=Math.min(right-left+1,right);
        int i=0;
        int j=right;
        while(i<=left && j<arr.length){
            if(arr[j]>=arr[i]){
                result=Math.min(result,j-i-1);
                i++;
            }else j++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,1,1,1};
        System.out.println(findLengthOfShortestSubarray(arr));
    }
}
