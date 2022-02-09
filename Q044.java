package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q044 {

    public static void main(String[] args) {

//        "aab"
//        "c*a*b"
        boolean result=isMatch("a","");
        System.out.println(result);

    }

    public static boolean isMatch(String s, String p) {

        boolean[][] result= new boolean[s.length()+1][p.length()+1];
        result[0][0]=true;

        int k=0;
        while(k<p.length() && p.charAt(k)=='*'){
            result[0][k+1]=true;
            k++;
        }

        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)=='*'){
                    result[i+1][j+1]=result[i+1][j] || result[i][j+1];
                    continue;
                }
                boolean temp=match(s,p,i,j);
                if(temp){
                    result[i+1][j+1]=result[i][j];
                }else{
                    result[i+1][j+1]=false;
                }
            }
        }

        return result[s.length()][p.length()];

    }

    public static boolean match(String s,String p,int sindex,int pindex){

        if(p.charAt(pindex)=='?' ){
            return true;
        }else{
            return s.charAt(sindex)==p.charAt(pindex);
        }
    }





}


