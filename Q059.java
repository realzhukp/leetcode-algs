package algs;

import java.util.ArrayList;
import java.util.List;

public class Q059 {

    public static void main(String[] args) {


        System.out.println(generateMatrix(3));

    }

    public static int[][] generateMatrix(int n) {

        int[][] result=new int[n][n];
        for(int i=0;n-i*2>0;i++){
            draw(result,i,n);
        }
        return result;

    }

    public static void draw(int[][] result,int i,int n){

        int start=4*n*i-4*i*i+1;

        for(int j=i;j<n-i;j++){
            result[i][j]=start;
            start++;
        }
        for(int j=i+1;j<n-i;j++){
            result[j][n-i-1]=start;
            start++;
        }
        for(int j=n-i-2;j>=i;j--){
            result[n-i-1][j]=start;
            start++;
        }
        for(int j=n-i-2;j>i;j--){
            result[j][i]=start;
            start++;
        }


    }


}


