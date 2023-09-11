package com.java.recurrsion;

public class NoOfMatrixPaths {

    static int matrixpaths(int n,int m){
        if(n==1|| m==1) return 1;
        else return matrixpaths(n,m-1)+matrixpaths(n-1,m);
    }
    public static void main(String[] args) {
        System.out.println(matrixpaths(2,2));
    }
}
