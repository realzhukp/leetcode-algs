package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q010 {

    public static void main(String[] args) {


        System.out.println(isMatch("aab","b.*"));

//        "aasdfasdfasdfasdfas"
//        "aasdf.*asdf.*asdf.*asdf.*s"

    }
    //s = "aa" p = "a*"

    public static boolean isMatch(String s, String p) {

        int m=s.length();
        int n=p.length();

        boolean[][] result=new boolean[m+1][n+1];
        result[0][0]=true;

        for(int i=1;i<=p.length();i++){
            if(p.charAt(i-1)=='*'){
                result[0][i]=result[0][i-2];
            }
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(p.charAt(j-1)=='.'){
                    result[i][j]=result[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    boolean match1=result[i][j-1];
                    boolean match2=j>1 && (s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)=='.') && result[i-1][j];
                    result[i][j]=result[i][j-2] || match1 || match2;
                }
                else{
                    result[i][j]=s.charAt(i-1)==p.charAt(j-1) && result[i-1][j-1];
                }
            }
        }
        return result[m][n];

    }



}
