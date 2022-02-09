package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q050 {

    public static void main(String[] args) {

//                -2147483648
        double x =2.0000;
        int n =-2;

        System.out.println(mypow(x,n));
//        Math.pow(1.00,1.00);

    }


    public static double myPow(double x, int n) {

        double result=1;
        boolean positive=n>0;

        if(x==1 || x==0 ){
            return x;
        }
        if(x==-1){
            return n%2==0?1:-1;
        }

        long longn=Math.abs(Long.valueOf(n));

        int i=0;
        while(i<longn){
            if(positive){
                result=result*x;
            }else{
                result=result*(1/x);
            }
            if(result==0){
                break;
            }
            i++;
        }

        return result;
    }

    public static double mypow(double x,int n){
        Long N=n>0?n:Long.valueOf(-n);

        return n>0?exp(x,N):1/exp(x,N);
    }

    public static double exp(double x,long n){

        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }

        if(n%2==0){
            n=n/2;
            double result=exp(x,n);
            return result*result;

        }else{
            n=n/2;
            double result=exp(x,n);
            return result*result*x;

        }


    }



}


