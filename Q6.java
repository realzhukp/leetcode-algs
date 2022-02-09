package algs;

import java.util.Arrays;
import java.util.HashSet;

public class Q6 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int result=reverse(11);

        System.out.println(result);


    }

    public static int reverse(int x) {
        String xString=String.valueOf(x);
        boolean isMinus=false;
        if(xString.indexOf("-")!=-1) {
            xString=xString.substring(1);
            isMinus=true;
        }
        StringBuilder result=new StringBuilder();
        for(char token:xString.toCharArray()) {
            result.append(token);
        }
        result=result.reverse();
//        if()
        if(isMinus) {
            return Integer.parseInt("-"+result.toString());
        }
        return Integer.parseInt(result.toString());
    }

}
