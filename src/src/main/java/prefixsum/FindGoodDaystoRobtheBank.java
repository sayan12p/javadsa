package prefixsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindGoodDaystoRobtheBank {

    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        int length=security.length; List<Integer> l=new ArrayList<>();
    int[] prefixsum=new int[length];
    int[] suffixsum=new int[length];
        Arrays.fill(prefixsum,0);
        Arrays.fill(suffixsum,0);
        for(int i=length-2;i>=0;i--){
            if(security[i]<=security[i+1]){
               suffixsum[i]=1;
                suffixsum[i]=suffixsum[i]+suffixsum[i+1];
            }
        }
        System.out.println(Arrays.toString(suffixsum));
        for(int i=1;i<length;i++){
            if(security[i]<=security[i-1]){
                prefixsum[i]=1;
                prefixsum[i]=prefixsum[i]+prefixsum[i-1];
            }
        }
        System.out.println(Arrays.toString(prefixsum));
        for(int i=0;i<prefixsum.length;i++){
            if(prefixsum[i]>=time && suffixsum[i]>=time){
                l.add(i);
            }
        }
        return l;
    }
    public static void main(String[] args) {
      int[]  security = new int[]{5,3,3,3,5,6,2};
        System.out.println(goodDaysToRobBank(security,2));
    }
}
