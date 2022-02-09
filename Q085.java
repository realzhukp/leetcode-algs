package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q085 {

    public static void main(String[] args) {

//        char[][] matrix={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};

//        char[][] matrix={{'0','1'},{'0','1'}};
        char[][] matrix={{'1','1','1','1','1','1','1','1'},{'1','1','1','1','1','1','1','0'},{'1','1','1','1','1','1','1','0'},{'1','1','1','1','1','0','0','0'},{'0','1','1','1','1','0','0','0'}};
        System.out.println(maximalRectangle(matrix));
    }

    public static int maximalRectangle(char[][] matrix) {

        if(matrix.length==0 || matrix[0].length==0) return 0;

        int m=matrix.length;
        int n=matrix[0].length;

        int[][] length=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                int value= matrix[i][j]=='0'?0:j==n-1?1:length[i][j+1]+1;
                length[i][j]=value;
            }
        }

        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                int min=length[i][j];
                int temp=i;

                while (temp<m && length[temp][j]>0){
                    min=Math.min(min,length[temp][j]);
                    temp++;
                    int height=temp-i;
                    max=Math.max(max,height*min);
                }
            }
        }
        return max;


    }
}


