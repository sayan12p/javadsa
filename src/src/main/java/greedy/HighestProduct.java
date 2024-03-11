package com.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestProduct {

    public static int maxProduct3(ArrayList<Integer> A) {
        //You can code here
        if(A==null ||A.size()<3) return 0;
        Collections.sort(A);
        int size=A.size();
        int product1=A.get(size-1)* A.get(size-2)* A.get(size-3);
        int product2=A.get(0)*A.get(1)*A.get(size-1);
        return Math.max(product1,product2);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0, -1, 3, 100, 70, 50));
        System.out.println(maxProduct3(list));
    }
}
