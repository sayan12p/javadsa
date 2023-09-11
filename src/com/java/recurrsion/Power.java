package com.java.recurrsion;

public class Power {
    public static double myPow(double x, int n,int m) {
        //You can code here
        if(x==0) return 0;
        if(n==0) return 1;
        if(n%2==0){
            return (myPow(x%m*x%m,n/2,m));
        }
        else return (x%m*myPow(x%m,n-1,m));
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0000,10,500));
    }
}
