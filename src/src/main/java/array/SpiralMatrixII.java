package com.java.array;

import java.util.Arrays;

public class SpiralMatrixII {

    public static int[][] spiralOrderMatrix(int n) {
        // You can code here
        int r1=0; int r2=n-1;
        int c1=0; int c2=n-1; int val=1;
        int[][] arr=new int[n][n];
        while(r1<=r2 && c1<=c2){
            //move left to right
            for(int c=c1;c<=c2;c++) arr[r1][c]=val++;
            //move down from up
            for(int r=r1+1;r<=r2;r++) arr[r][c2]=val++;

            if(r1<r2 && c1<c2){
                for(int c=c2-1;c>=c1;c--) arr[r2][c]=val++;
                for(int r=r2-1;r>=r1+1;r--) arr[r][c1]=val++;
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(spiralOrderMatrix(3)));
    }
}
