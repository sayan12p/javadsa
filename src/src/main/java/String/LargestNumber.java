package String;

import java.util.Arrays;

public class LargestNumber {

    public static String largestNumber(int[] nums) {
    int n=nums.length;
    String[] s=new String[n];
    for(int i=0;i<s.length;i++){
        s[i]=String.valueOf(nums[i]);
    }
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb= new StringBuilder();
        for(String c:s){
            sb.append(c);
        }
        String result=sb.toString();
        return result.startsWith("0")?"0":result;
    }
    public static void main(String[] args) {
        int[] nums =new int[]{3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
