package algs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q077 {

    public static void main(String[] args) {

        System.out.println(combine(4,2));
    }

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dft(result,list,n,k,1);
        return result;

    }

    public static void dft(List<List<Integer>> result,List<Integer> list,int n,int k,int number){
        if(list.size()==k){
            result.add(new ArrayList<>(list));
        }
        for(int i=number;i<=n;i++){
            list.add(i);
            dft(result,list,n,k,i+1);
            list.remove(list.size()-1);
        }
    }






}


