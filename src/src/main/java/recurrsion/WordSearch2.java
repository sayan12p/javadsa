package com.java.recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch2 {
    public static List<String> findWords(char[][] board, String[] words) {
        boolean[][] visited=new boolean[board.length+1][board[0].length+1];
        List<String> result=new ArrayList<>();
        List<String> wordlist=Arrays.asList(words);
        for(boolean[] b:visited){
            Arrays.fill(b,false);
        }
        for(String word:wordlist) {
            a:for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if(getfindwordshelper(i, j, board, visited, word, 0, "")) {
                        result.add(word);
                        break a;
                    }
                }
            }
        }
        return result;
    }

    private static boolean getfindwordshelper(int i, int j, char[][] board, boolean[][] visited, String word,int index,String cur) {
        if(cur.equals(word)){
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||  board[i][j]!=word.charAt(index) || visited[i][j]){
            return false;
        }
        if(board[i][j]==word.charAt(index)){
            cur=cur+word.charAt(index);
            visited[i][j]=true;
        }
        boolean result=getfindwordshelper(i+1,j,board,visited,word,index+1,cur)||
        getfindwordshelper(i-1,j,board,visited,word,index+1,cur)||
        getfindwordshelper(i,j+1,board,visited,word,index+1,cur) ||
        getfindwordshelper(i,j-1,board,visited,word,index+1,cur);
        visited[i][j]=false;
        return  result;
    }

    public static void main(String[] args) {
        char[][] board={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words={"oath","pea","eat","rain"};
        System.out.println(findWords(board,words));
    }
}
