package String;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterString {


    public static String filterString(String s,String target){
        Set<Character> characterList=target.chars().mapToObj(i->(char)i).collect(Collectors.toSet());
        String res="";
        for(int i=0;i<s.length();i++){
            if(!characterList.contains(s.charAt(i))){
                res+=s.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="programming";
        String target="grm";
        System.out.println(filterString(s,target));
    }
}
