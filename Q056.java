package algs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q056 {

    public static void main(String[] args) {


        int[] nums = {2,0};

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));

    }

    public static int[][] merge(int[][] intervals) {

        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<intervals.length;i++){
            List<Integer> single=new ArrayList<>();
            single.add(intervals[i][0]);
            single.add(intervals[i][1]);
            list.add(single);
        }

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
//                if(i)
            }

        }

        int[][] result=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i][0]=list.get(i).get(0);
            result[i][1]=list.get(i).get(1);
        }
        return result;
    }


}


