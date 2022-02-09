package algs;

public class Q7 {

    public static void main(String[] args) {

        System.out.println(myAtoi(" 42"));

    }

    public static int myAtoi(String s) {
        int result=0;
        boolean isMinus=false;

        while(s.length()>0){

        }

        if(s.length()==0) {
            return 0;
        }

        while(s.charAt(0)==' ') {
            s=s.substring(1);
        }

        if('-'==s.charAt(0)) {
            isMinus=true;
            s=s.substring(1);
        }
        else if('+'==s.charAt(0)) {
            s=s.substring(1);
        }

        boolean goon=true;
        int index=0;


        while(goon && index<s.length()) {
            char currentNumber=s.charAt(index);
            if(currentNumber>='0' && currentNumber<='9') {
                if(Integer.MAX_VALUE/10<result || (Integer.MAX_VALUE/10==result && currentNumber>7)) {
                    return Integer.MAX_VALUE;
                }
                if(result<Integer.MIN_VALUE/10 || (Integer.MIN_VALUE/10==result && currentNumber<-8)) {
                    return Integer.MIN_VALUE;
                }
                result=result*10+Integer.valueOf(String.valueOf(currentNumber))*(isMinus?-1:1);
                index++;
            }else {
                goon=false;
            }
        }
        return result;

    }

}
