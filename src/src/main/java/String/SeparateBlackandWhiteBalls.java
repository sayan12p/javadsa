package String;


import java.util.Arrays;
//https://www.youtube.com/watch?v=bkCA7xd2b9c&t=637s
public class SeparateBlackandWhiteBalls {

    public static long minimumSteps(String s) {
       int leftoneindex=0; int noofswaps=0;
       while(leftoneindex<s.length() && s.charAt(leftoneindex)!='1'){
           leftoneindex++;
       }
       for(int j=leftoneindex+1;j<s.length();j++){
           if(s.charAt(j)=='0'){
               noofswaps+=j-leftoneindex;
               leftoneindex++;
           }
       }
       return noofswaps;
    }
    public static void main(String[] args) {
        String s="10101";
        System.out.println(minimumSteps(s));
    }
}
