package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q072 {

    public static void main(String[] args) {

        System.out.println(minDistance("horse","ros"));

        //a ab
        //horse ros
        //intention execution

    }

    public static int minDistance(String word1, String word2) {

        int m=word1.length();
        int n=word2.length();

        int[][] result=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            result[i][0]=i;
        }
        for(int i=1;i<=n;i++){
            result[0][i]=i;
        }

        for(int i=1;i<=m;i++){

            for(int j=1;j<=n;j++){

                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    result[i][j]=result[i-1][j-1];
                }else{
                    int min=Math.min(result[i-1][j],result[i][j-1]);
                    min=Math.min(min,result[i-1][j-1]);
                    result[i][j]=min+1;
                }
            }
        }

        return result[m][n];
    }








}


