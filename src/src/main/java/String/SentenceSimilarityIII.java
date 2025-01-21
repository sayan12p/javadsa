package String;

import java.util.ArrayList;
import java.util.List;

public class SentenceSimilarityIII {

    public static List<String> findwords(String s, List<String> words){
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
               words.add(word);
               word="";
            }else{
                word=word+s.charAt(i);
            }
        }
        words.add(word);
        return words;
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        List<String> words=new ArrayList<>();
        List<String> words2=new ArrayList<>();
        findwords(sentence1,words);
        findwords(sentence2,words2);
        if(words.size()>words2.size()){
           List<String> templist=new ArrayList<>(words);
           words.clear();
           words.addAll(words2);
           words2.clear();
           words2.addAll(templist);
        }

        int l=0;
        while(l<words.size() && words.get(l).equals(words2.get(l))){
            l++;
        }
        int r=words.size()-1;
        int w2pos=words2.size()-1;
        while(r>=0 && words.get(r).equals(words2.get(w2pos))){
            r--;
            w2pos--;
        }
        return l>r;
    }
    public static void main(String[] args) {
        String s1="My name is Haley";
        String s2="My Haley";
        System.out.println(areSentencesSimilar(s1,s2));
    }
}
