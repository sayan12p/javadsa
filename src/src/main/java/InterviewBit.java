package com.java;

import java.util.Arrays;
import java.util.List;

public class InterviewBit {

//  static List<Integer> find(int[] A){
//      int sum=A[0]+A[1];
//      int mini=0;
//      int minj=0;
//      for(int i=2;i<A.length;i++){
//         for(int j=i+1;j<A.length-1;j++){
//           int minsum=Math.abs(A[i]+A[j]);
//           if(minsum<sum){
//               sum=minsum;
//               mini=i;
//               minj=j;
//           }
//         }
//      }
//      return List.of(mini,minj);
//  }
    static List<Integer> find(int[] A){
        Arrays.sort(A);
        int n=A.length;
        int i=0;
        int j=n-1;
        int mini=i;
        int minj=j;
        int minsum=A[0]+A[1];
        while(i<j){
            int sum=A[i]+A[j];
            if(Math.abs(sum)<Math.abs(minsum)){
                minsum=sum;
                mini=i;
                minj=j;
            }
            if(sum<0)
            i++;
            else
            j--;
        }
        return List.of(A[mini],A[minj]);
    }
    public static void main(String[] args){
        int array[]={1, 60, -10, 70, -80, 85};
        System.out.println(find(array));
    }
}
