package com.java.greedy;

public class MajorityElement {

    public static int majorityElement(int a[]){
        int count=1;
        int majorityelement=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]==majorityelement){
                count++;
            }else {
                count--;
            }
            if(count==0){
                majorityelement=a[i];
                count=1;
            }
        }
        return majorityelement;
    }
    public static void main(String[] args) {
    int[] a=new int[]{3,1,3,3,2};
        System.out.println(majorityElement(a));
    }
}
