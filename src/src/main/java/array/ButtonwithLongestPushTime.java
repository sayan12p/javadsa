package array;

import java.util.*;
import java.util.stream.Collectors;

public class ButtonwithLongestPushTime {

    public static int buttonWithLongestTime(int[][] events) {
        int ans=0; int time=0; int last=0;
        for(int[] e:events){
            if(e[1]-last>time|| (e[1]-last==time && e[0]<ans)){
                ans=e[0];
                time=e[1]-last;
            }
            last=e[1];
        }
        return ans;

    }

    public static void main(String[] args) {
    int[][] events=new int[][]{{13,11},{14,12},{8,16},{13,18},{20,19},{11,20}};
        Arrays.stream(events).collect(Collectors.toUnmodifiableList());
        System.out.println(buttonWithLongestTime(events));
    }
}
