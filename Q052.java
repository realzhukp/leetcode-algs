package algs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q052 {

    public static void main(String[] args) {

        System.out.println(totalNQueens(4));

    }

    public static int totalNQueens(int n) {
        return dft(n,new HashSet<>(),new HashSet<>(),new HashSet<>(),0);
    }

    public static int dft(int n, HashSet<Integer> columns,HashSet<Integer> slopes,HashSet<Integer> antislopes, int row){

        if(row==n){
            return 1;
        }

        int count=0;
        for(int i=0;i<n;i++){
            int x=i;
            int y=n-row-1;
            int slope= y-x;
            int antislope=y+x;

            if(!columns.contains(i) && !slopes.contains(slope) && !antislopes.contains(antislope)){
                columns.add(i);
                slopes.add(slope);
                antislopes.add(antislope);

                count+=dft(n,columns,slopes,antislopes,row+1);

                columns.remove(i);
                slopes.remove(slope);
                antislopes.remove(antislope);
            }
        }
        return count;
    }


}


