package algs;

import java.util.ArrayList;
import java.util.List;

public class Q089 {

    public static void main(String[] args) {

        longestPalindrome("cbbc");
        //cbbd
        //cbbc

    }

    public static String longestPalindrome(String s) {

        String maxString="";
        int maxlength=0;

        boolean[][] result=new boolean[s.length()][s.length()];

        for(int interval=0;interval<s.length();interval++){

            for(int i=0;i+interval<s.length();i++){

                if(s.charAt(i)==s.charAt(i+interval)){
                    if(interval<=1){
                        result[i][i+interval]=true;
                    }else{
                        result[i][i+interval]=result[i+1][i+interval-1];
                    }
                    if(result[i][i+interval] && interval+1>maxlength){
                        maxString=s.substring(i,i+interval+1);
                    }
                }
            }

        }

        return maxString;

    }



}


