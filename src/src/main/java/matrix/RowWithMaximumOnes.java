package matrix;

import java.util.Arrays;


public class RowWithMaximumOnes {

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int x=0;int p=0;
        for(int i=0;i<mat.length;i++){
            int c=mat[i][0];
            for(int j=1;j<mat[0].length;j++){
                mat[i][j]+=c;
                c=mat[i][j];
            }
            if(c>x){
                x=c;
                p=i;
            }
        }
        return new int[]{p,x};
    }
    public static void main(String[] args) {
    int[][] arr=new int[][]{{0,0,0},{0,1,1}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(arr)));
    }
}
