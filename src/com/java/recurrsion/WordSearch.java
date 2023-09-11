package com.java.recurrsion;

import java.util.Arrays;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(boolean[] b:visited){
            Arrays.fill(b,false);
        }
        for(int i=0;i< board.length;i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (existhelper(board, i, j, word, 0, visited, "")) return true;
            }
        }
        return false;
    }

    private static boolean existhelper(char[][] board, int i, int j, String word,int index,boolean[][]visited,String cur) {
        if(cur.equals(word)) {
            return true;
        };
        if(i<0 || j<0 || i>=board.length || j>= board[0].length
                || word.charAt(index)!=board[i][j]
                || visited[i][j] ){
            return false;
        }
        if(word.charAt(index)==board[i][j]){
            cur=cur+board[i][j];
            visited[i][j]=true;
        }
        boolean result=existhelper(board,i+1,j,word,index+1,visited,cur)||
                existhelper(board,i-1,j,word,index+1,visited,cur)||
                existhelper(board,i,j+1,word,index+1,visited,cur)||
                existhelper(board,i,j-1,word,index+1,visited,cur);
        visited[i][j]=false;
        return result;
    }

    public static void main(String[] args) {
        char[][] a={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(a,"SEE"));
    }
}
