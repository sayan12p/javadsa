package com.java.recurrsion;

public class NCR {

    public static int ncr(int n,int r){
        if(n==r || r==0) return 1;
        else return ncr(n-1,r-1)+ncr(n-1,r);
    }

    public static void main(String[] args) {
System.out.println(ncr(4,2));
    }
}
