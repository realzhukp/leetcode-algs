package algs;

public class Q029 {

    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "issip";
//        System.out.println("".startsWith(""));""
//""

        int result=divide(-1010369383,-2147483648);
        System.out.println(result);




    }

    public static int divide(int dividend, int divisor) {
        boolean positive=true;

        if(divisor==1){
            return dividend;
        }

        if(dividend==-2147483648 && divisor==-1){
            return 2147483647;
        }

        if ((dividend>0 && divisor<0)||(dividend<0 && divisor>0)){
            positive=false;
        }

        long absa =Math.abs(Long.valueOf(dividend));
        long absb=Math.abs(Long.valueOf(divisor));

        int result=div(absa,absb);
        return positive?result:-result;

    }

    public static int div(long dividend,long divisor){
        if(dividend<divisor){
            return 0;
        }
        int count=1;
        long singled=divisor;
        long doubled=singled+singled;
        while(dividend>doubled){
            singled=doubled;
            doubled=singled+singled;
            count=count+count;
        }

        return div(dividend-singled,divisor)+count;

    }




}


