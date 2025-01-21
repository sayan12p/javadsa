package String;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstUniqueCharacterInString {

    private static void findfirstuniquecharacter(String s){
        LinkedHashMap<Character,Integer> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.toMap(Function.identity(),a->1,Integer::sum,LinkedHashMap::new));
        System.out.println(map.entrySet().stream().filter(m->m.getValue().equals(1)).map(m->m.getKey()).findAny().orElse(null));
    }

    public static void main(String[] args) {
        String s="aabdcce";
        findfirstuniquecharacter(s);
    }
}
