package morgan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//create new array same size, store sum of all left elements smaller that it
public class Problem1 {

    public static int[] getnew(int[] arr){
        int[] arrnew = new int[arr.length];arrnew[0]=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    sum+=arr[j];
                }
            }
            l.add(sum);
        }
        System.out.println(l);
    return arrnew;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{18, 2,5,7,3,4};
       getnew(arr);
    }
}
