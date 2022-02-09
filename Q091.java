package algs;

public class Q091 {

    public static void main(String[] args) {

        System.out.println(numDecodings("207"));

    }

    public static int numDecodings(String s) {
        int[] result=new int[s.length()];

        for(int i=0;i<s.length();i++) {

            int count=0;
            int pre1;
            int pre2;
            if(i==0) {
                if(s.charAt(i)=='0') {
                    return 0;
                }else {
                    result[i]=1;
                    continue;
                }
            }
            if(i==1) {
                pre1=1;
                pre2=1;
            }else {
                pre1=result[i-1];
                pre2=result[i-2];
            }
            if(s.charAt(i)=='0') {
                if(s.charAt(i-1)=='0' || s.charAt(i-1)-'0'>2) {
                    return 0;
                }else{
                    count=pre2;
                }
            }else if(s.charAt(i)-'0'<7) {
                if(s.charAt(i-1)-'0'>0 && s.charAt(i-1)-'0'<3) {
                    count=pre1+pre2;
                }else {
                    count=pre1;
                }
            }else {
                if(s.charAt(i-1)=='1') {
                    count=pre1+pre2;
                }else {
                    count=pre1;
                }
            }
            result[i]=count;
        }

        return result[s.length()-1];
    }



}


