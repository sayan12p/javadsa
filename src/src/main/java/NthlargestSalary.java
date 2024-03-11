package com.java;

import java.util.*;
import java.util.stream.Collectors;

public class NthlargestSalary {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil",1000);
        map.put("ankit",1200);
        map.put("bhavna",1300);
        map.put("james",1400);
        map.put("micael",1500);
        map.put("tom",1600);
        map.put("daniel",1700);
        Map.Entry<String,Integer> finalresult=map.entrySet().stream().sorted(Comparator.comparing(e->-e.getValue())).collect(Collectors.toList()).get(1);
        System.out.println(finalresult);
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
        Map<Integer, List<String>> interimmap=map2.entrySet().stream().collect(Collectors.groupingBy(a->a.getValue(),Collectors.mapping(a->a.getKey(),Collectors.toList())));
       //Map<String, Integer> interimmap=map2.entrySet().stream().collect(Collectors.groupingBy(m->m.getKey(),Collectors.maxBy(Comparator.comparingInt(Integer::compareTo)));
        System.out.println(interimmap);
        Map.Entry<Integer, List<String>> finalresult1 = interimmap.entrySet().stream().sorted(Comparator.comparing(i -> -i.getKey())).collect(Collectors.toList()).get(1);
        System.out.println(finalresult1);
    }
}
