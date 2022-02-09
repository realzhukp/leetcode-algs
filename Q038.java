package algs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q038 {

    public static void main(String[] args) {

        int n=1;
        String result=countAndSay(n);
        System.out.println(result);
    }

    public static String countAndSay(int n) {

        if(n==1){
            return "1";
        }else{
            String s=countAndSay(n-1);
            StringBuffer result=new StringBuffer();

            int number=0;
            int count=0;
            char[] arr=String.valueOf(s).toCharArray();
            int i=0;
            while(i<arr.length){

                number=arr[i]-'0';
                count=1;
                while(i<arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                    count++;
                }
                i++;
                result.append(count);
                result.append(number);
            }

            return result.toString();
        }


    }





}


