package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q079 {

    public static void main(String[] args) {

        char[][] board={{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
        String target="ABCESEEEFS";
        System.out.println(exist(board,target));
    }

    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){

                    boolean[][] visited=new boolean[m][n];
                    visited[i][j]=true;

                    boolean result=judge(i,j,m,n,board,word,1,visited);
                    if(result){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean judge(int i,int j,int m,int n,char[][] board,String word,int wordindex,boolean[][] visited){
        if(wordindex==word.length()){
            return true;
        }else{

            int[][] directions={{-1,0},{0,-1},{1,0},{0,1}};

            for(int d=0;d<directions.length;d++){
                int newi=i+directions[d][0];
                int newj=j+directions[d][1];

                if(newi>=0 && newi<m && newj>=0 && newj<n && board[newi][newj]==word.charAt(wordindex) && !visited[newi][newj]){
                    visited[newi][newj]=true;
                    if(judge(newi,newj,m,n,board,word,wordindex+1,visited)){
                        return true;
                    }
                    visited[newi][newj]=false;
                }
            }

            return false;
        }
    }






}


