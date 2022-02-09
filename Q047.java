package algs;

import java.util.*;

public class Q047 {

    public static void main(String[] args) {

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        System.out.println(matrix);

    }



    public static void rotate(int[][] matrix) {

        int n=matrix.length;
        int looptime=n/2;

        for(int i=0;i<looptime;i++){
            int step=n-2*i-1;
            for(int j=0;j<step;j++){
                swictch(matrix,i,i+j,n);
            }

        }

    }

    public static void swictch(int[][] matrix,int m,int n,int length){

        int setvalue=matrix[m][n];
        int i=n;
        int j=length-1-m;
        int storevalue=matrix[i][j];
        matrix[i][j]=setvalue;

        setvalue=storevalue;
        i=j;
        j=length-1-n;
        storevalue=matrix[i][j];
        matrix[i][j]=setvalue;

        setvalue=storevalue;
        i=j;
        j=m;
        storevalue=matrix[i][j];
        matrix[i][j]=setvalue;

        setvalue=storevalue;
        i=j;
        j=n;
        storevalue=matrix[i][j];
        matrix[i][j]=setvalue;


    }



}


