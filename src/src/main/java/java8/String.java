package com.java.java8;

import java.util.Arrays;

public class String {
    public static void main(java.lang.String[] args) {
        java.lang.String[] s={"abc123","def456"};
        System.out.println(Arrays.stream(s).map(java.lang.String::chars).flatMap(i->i.mapToObj(x->(char)x))
                .filter(y->Character.isDigit(y)).mapToInt(z->Integer.parseInt(java.lang.String.valueOf(z))).sum());
    }
}
