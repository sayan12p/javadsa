package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitedPathsIII {
    public static int uniquePathsIII(int[][] grid) {
        //You can code here
        int starti=0;
        int startj=0;
        int zeros=0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                   zeros++;
                }
                if(grid[i][j]==1){
                    starti=i;
                    startj=j;
                }
            }
        }
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(boolean[] i:visited){
            Arrays.fill(i,false);
        }
        return getunitedpathhelper(starti,startj,grid,visited,zeros);
    }

    private static int getunitedpathhelper(int starti, int startj,  int[][] grid, boolean[][] visited,int zeros) {
        if(starti<0 || starti>=grid.length|| startj<0 || startj>=grid[0].length|| grid[starti][startj]==-1 || visited[starti][startj]){
            return 0;
        }
        if(grid[starti][startj]==2){
            return zeros==-1?1:0;
        }
        zeros--;
        visited[starti][startj]=true;
        int count=getunitedpathhelper(starti+1,startj,grid,visited,zeros)+
                getunitedpathhelper(starti-1,startj,grid,visited,zeros) +
        getunitedpathhelper(starti,startj+1,grid,visited,zeros) +
        getunitedpathhelper(starti,startj-1,grid,visited,zeros);
        visited[starti][startj]=false;
        zeros++;
        return count;
    }

    public static void main(String[] args) {
        int[][] grid=new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}};
        System.out.println(uniquePathsIII(grid));
    }
}
