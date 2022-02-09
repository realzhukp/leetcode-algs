package algs;

import java.util.ArrayList;
import java.util.List;

public class Q069 {

    public static void main(String[] args) {


        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;


        System.out.println(mySqrt(2147395599));

    }

    public static int mySqrt(int x) {

        long low=0;
        long high=x;

        long middlevalue=0l;

        while (low<=high){
            long middle=(low+high)/2;
            middlevalue=middle*middle;
            if(middlevalue==x){
                return (int)middle;
            }else if(middlevalue>x){
                long middlevalue2=(middle-1)*(middle-1);
                if(middlevalue2<x){
                    return (int)middle-1;
                }
                    high=middle-1;
            }else if(middlevalue<x){
                long middlevalue2=(middle+1)*(middle+1);
                if(middlevalue2>x){
                    return (int)middle;
                }
                low=middle+1;
            }
        }
        return 0;


    }







}


