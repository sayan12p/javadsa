package com.java.array;


//https://www.youtube.com/watch?v=dBGTCaVph3Q&t=539s
public class FirstMissingInteger {

    public static int firstMissingPositive(int[] A) {
        //You can code here
        int n=A.length;
        for(int i=0;i<n;i++){
            int currentindex=A[i]-1;
            while(A[i]>0 && A[i]<=n && A[i]!=A[currentindex]){
               swap(i,currentindex,A);
               currentindex=A[i]-1;
            }
        }
        for(int i=0;i<n;i++){
            if(A[i]!=i+1) return i+1;
        }
        return n+1;
    }
    public static void swap(int i,int j,int[]A){
      int temp=A[i];
      A[i]=A[j];
      A[j]=temp;
    }
    public static void main(String[] args) {
    int[] A={3,4,-1,1};
        System.out.println(firstMissingPositive(A));
    }
}
