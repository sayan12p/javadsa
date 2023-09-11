package com.java.recurrsion;

public class countofOccurences {

    static int countofoccurences(String s,String t){
        return countofoccurenceshelper(s,t,0);
    }
    static int countofoccurenceshelper(String s,String t,int i){
        if(i+t.length()>s.length()){
            return 0;
        }
        int subproblemanswer= countofoccurenceshelper(s,t,i+1);
        boolean checkcharactersame=s.substring(i,i+t.length()).equals(t);
        if(checkcharactersame) return subproblemanswer+1;
        else return subproblemanswer;
    }
    public static void main(String[] args) {
        String s="abcbsbghdbgh";
        String t="bgh";
        System.out.println(countofoccurences(s,t));
    }
}
