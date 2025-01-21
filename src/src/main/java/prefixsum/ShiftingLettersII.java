package prefixsum;

import java.util.Arrays;

public class ShiftingLettersII {

    public static String shiftingLetters(String s, int[][] shifts) {
        int n=s.length(); int prefix=0;String result=new String();
        int[] offsets=new int[n+1];
        for(int[] i:shifts){
            int direction =i[2];
            offsets[i[0]]+=direction==1?1:-1;
            offsets[i[1]+1]-=direction==1?1:-1;
        }
        System.out.println(Arrays.toString(offsets));
        for(int j=0;j<n;j++){
            prefix+=offsets[j];
            while(prefix<0) prefix=26;
            int ch=(s.charAt(j)-'a'+prefix)%26;
            result+=(char)(ch+'a');
        }
        return result;
    }
    public static void main(String[] args) {
        String s="abc";
        int[][] shifts =new int[][]{{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters(s,shifts));
    }
}
