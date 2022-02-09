package algs;

import java.util.Arrays;
import java.util.HashSet;

public class Q3 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int result=lengthOfLongestSubstring2("pwwkew");
        System.out.println(result);


    }

    //pwwkew

    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<=s.length();i++) {
            for(int j=i;j<=s.length();j++) {
                String temp=s.substring(i,j);
                HashSet<Character> resultset=new HashSet<>();
                if(temp.length()!=0) {
                    Arrays.asList(temp.split("")).stream().forEach(
                            x->{
                                resultset.add(x.charAt(0));
                            });
                    if(resultset.size()==j-i) {
                        max=max>j-i?max:j-i;
                    }
                }
            }
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int max=0;
        int leftindex=0;
        int rightindex=0;
        HashSet<Character> resultset=new HashSet<>();

        while(rightindex<s.length()) {

            if(!resultset.contains(s.charAt(rightindex))) {
                resultset.add(s.charAt(rightindex));
                max=max>resultset.size()?max:resultset.size();
            }else {
                while(resultset.contains(s.charAt(rightindex))) {
                    resultset.remove(s.charAt(leftindex));
                    leftindex++;
                }
                resultset.add(s.charAt(rightindex));
            }
            rightindex++;
        }
        return max;
    }

}
