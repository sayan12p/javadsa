package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharacterinaString {

    public static char firstNonRepeating(String str) {
        // Write your code here
       LinkedHashMap<Character,Long> count =str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        return count.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findAny().get();
    }
    public static void main(String[] args) {
        String s="babaabea";
        System.out.println(firstNonRepeating(s));
    }
}
