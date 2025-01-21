package String;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringCompression {
    public static int compress(char[] chars) {
    int n=chars.length;
    int idx=0;
    for(int i=0;i<n;i++){
        char ch=chars[i];
        int count =0;
        while(i<chars.length && ch==chars[i]){
            i++;
            count++;
        }
        if(count==1){
            chars[idx++]=ch;
        }
        else{
          chars[idx++]=ch;
          for(char d: Integer.toString(count).toCharArray()){
              chars[idx++]=d;
          }
        }
        i--;
    }
    return idx;
    }
    public static void main(String[] args) {
        char chars[]={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
