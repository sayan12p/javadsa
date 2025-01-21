package prefixsum;

import java.util.Arrays;

public class CountVowelStringsinRanges {

    public static int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] prefixsum=new int[n+1];// to store the no of vowelstrings in a particular range of words.
        Arrays.fill(prefixsum,0);
        for(int i=0;i<n;i++){
            String cur=words[i];
            int length=cur.length();
            if(isVowel(cur.charAt(0)) && isVowel(cur.charAt(length-1))){
                prefixsum[i+1]=prefixsum[i]+1;
            }else{
                prefixsum[i+1]=prefixsum[i];
            }
        }
        System.out.println(Arrays.toString(prefixsum));
        int[] result=new int[queries.length]; int i=0;
        for(int[] query:queries){
            //prefixsum[r+1]-prefixsum[l];
            result[i++]=prefixsum[query[1]+1]-prefixsum[query[0]];
        }
        return result;
    }

    public static boolean isVowel(char ch){
        if(ch =='a'|| ch=='e' || ch== 'i' || ch=='o' || ch=='u') return true;
        return false;
    }
    public static void main(String[] args) {
        String[] words=new String[]{"aba","bcb","ece","aa","e"};
        int[][] queries=new int[][]{ {0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(vowelStrings(words,queries)));
    }
}
