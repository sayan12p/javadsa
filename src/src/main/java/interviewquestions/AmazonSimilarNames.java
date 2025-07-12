package interviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AmazonSimilarNames {

    public static int findmatching(String s1,String s2, int p) {
        int n2=s2.length();
        int n1=s1.length();
        Map<Character,Integer> count2=getfrequency(s2);
        System.out.println(count2);
        int validpoints =0;
        for(int i=0;i<p;i++){
            int left=i;
            int window=0;
            Map<Character,Integer> count1=new HashMap<>();
            for(int r=i;r<n1;r+=p){
                char current=s1.charAt(r);
                count1.put(current,count1.getOrDefault(current,0)+1);
                window++;
                while(window>n2){
                    char c=s1.charAt(left);
                    if(count1.containsKey(c)){
                        count1.put(c,count1.get(c)-1);
                    }else if(count1.get(c)==0) {
                        count1.remove(c);
                    }
                    left+=p;
                    window--;
                }
                if(window==n2 && count1.equals(count2)){
                    System.out.println("found at point" +left);
                    validpoints++;
                }
            }
        }
        return validpoints;
    }

    public static Map<Character,Integer> getfrequency(String s2){
        Map<Character,Integer> frequencymap=new HashMap<>();
    for(int i=0;i<s2.length();i++){
        char c=s2.charAt(i);
        frequencymap.put(c,frequencymap.getOrDefault(c,0)+1);
    }
    return frequencymap;
    }


    public static void main(String[] args) {
        String s1="acaccaa"; String s2="aac";
        System.out.println(findmatching(s1,s2,2));
    }
}
