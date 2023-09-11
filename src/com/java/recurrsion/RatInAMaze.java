package com.java.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {

    public static ArrayList< String > findPath(int[][] arr, int n) {
        //You can code here
        int[][] visited=new int[n][n];
        for(int[] i:visited)
        Arrays.fill(i,0);
        //return (ArrayList<String>) findPathHelper(0,0,arr,n,new ArrayList<>(),"",visited).stream().sorted().collect(Collectors.toList());
        return findPathHelper(0,0,arr,n,new ArrayList<>(),"",visited);
    }
    static ArrayList<String> findPathHelper(int i,int j,int[][] arr,int n,ArrayList<String> ans, String move,int[][] visited){
        if(i==n-1 && j==n-1){
            ans.add(move);
            return ans;
        }
        //downward
        if(i+1<n && visited[i+1][j]==0 && arr[i+1][j]==1){
            visited[i][j] =1;
            findPathHelper(i+1,j,arr,n,ans,move+"D",visited);
            visited[i][j]=0;
        }
        //leftward
        if(j-1>=0 && visited[i][j-1]==0 && arr[i][j-1]==1){
            visited[i][j] =1;
            findPathHelper(i,j-1,arr,n,ans,move+"L",visited);
            visited[i][j]=0;
        }
        //rightward
        if(j+1<n && visited[i][j+1]==0 && arr[i][j+1]==1){
            visited[i][j] =1;
            findPathHelper(i,j+1,arr,n,ans,move+"R",visited);
            visited[i][j]=0;
        }
        //upward
        if(i-1>=0 && visited[i-1][j]==0 && arr[i-1][j]==1){
            visited[i][j] =1;
            findPathHelper(i-1,j,arr,n,ans,move+"U",visited);
            visited[i][j]=0;
        }
        return ans;
    }
        public static void main(String[] args) {
        int[][] arr={{1, 1, 1, 1},
                {1, 1, 1,1},
                {1, 1, 1, 1}};
        System.out.println(findPath(arr,3));

    }
}
