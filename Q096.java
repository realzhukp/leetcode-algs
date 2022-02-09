package algs;

import java.util.ArrayList;
import java.util.List;

public class Q096 {

    public static void main(String[] args) {

        numTrees(1);

    }

    public static int numTrees(int n) {

        int[] list=new int[n+1];

        list[0]=1;

        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<i;j++){
                int left=list[j];
                int right=list[i-j-1];
                count+=left*right;
            }
            list[i]=count;
        }

        return list[n];
    }





}




