package algs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q051 {

    public static void main(String[] args) {


        System.out.println(solveNQueens(4));


    }


    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result=new ArrayList<>();
        dft(result,n,new HashSet<>(),new HashSet<>(),new HashSet<>(),0,new ArrayList<>());
        return result;
    }

    public static void dft(List<List<String>> result, int n, HashSet<Integer> columns,HashSet<Integer> slopes,HashSet<Integer> antislopes, int row,List<String> list){

        if(row==n){
            result.add(new ArrayList<>(list));
        }

        for(int i=0;i<n;i++){
            int x=i;
            int y=n-row-1;
            int slope= y-x;
            int antislope=y+x;

            if(!columns.contains(i) && !slopes.contains(slope) && !antislopes.contains(antislope)){
                columns.add(i);
                slopes.add(slope);
                antislopes.add(antislope);

                StringBuffer s=new StringBuffer();
                for(int j=0;j<n;j++){
                    s.append(j==i?"Q":".");
                }
                list.add(s.toString());
                dft(result,n,columns,slopes,antislopes,row+1,list);
                list.remove(list.size()-1);
                columns.remove(i);
                slopes.remove(slope);
                antislopes.remove(antislope);
            }
        }
    }


}


