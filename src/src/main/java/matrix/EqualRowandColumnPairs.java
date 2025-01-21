package matrix;

import java.util.*;

public class EqualRowandColumnPairs {

    public static int equalPairs(int[][] grid) {
    int n= grid.length;int count =0;
    int [][] transposegrid=new int[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            transposegrid[i][j]=grid[j][i];
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(Arrays.equals(grid[i],transposegrid[j])){
                count++;
            }
        }
    }
    return count;
    }
    public static void main(String[] args) {
        int[][] grid =new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
}
