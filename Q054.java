package algs;

import java.util.ArrayList;
import java.util.List;

public class Q054 {

    public static void main(String[] args) {

        //[5,4,-1,7,8]
        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result=new ArrayList<>();

        for(int row=0;row<matrix.length;row++){

        }

        int rowcount=matrix.length;
        int columncount=matrix[0].length;

        int i=0;
        int j=0;

        int roof=0;
        int bottom=rowcount-1;
        int left=0;
        int right=columncount-1;
        while(result.size()!=rowcount*columncount){

            result.add(matrix[i][j]);

            if(i==roof && j<right){
                j++;
                continue;
            }

            if(i==roof && j==right){
                roof--;
                i++;
                continue;

            }
            if(j==right && i<bottom){
                i++;
                continue;

            }
            if(i==bottom && j==right){
                right--;
                j--;
                continue;

            }
            if(i==bottom && j>left){
                j--;
                continue;

            }
            if(i==bottom && j==left){
                bottom--;
                i--;
                continue;

            }
            if(j==left && i>roof){
                i--;
                continue;

            }
            if(j==left && i==roof){
                left--;
                j++;
                continue;

            }
        }


        return result;

    }


}


