
package com.java;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Test
{
    public static void main(String[] args) {

        String s="java i am goodbetter";
        Map<String, Integer> map = Arrays.stream(s.split(" ")).collect(Collectors.toMap(i -> i, String::length));
        System.out.println(map.entrySet().stream().sorted((e1,e2)->e2.getValue()-e1.getValue()).collect(Collectors.toList()).get(1));
    }
}
