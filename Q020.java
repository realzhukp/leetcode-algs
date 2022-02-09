package algs;

import java.util.*;

public class Q020 {

    public static void main(String[] args) {

        boolean x=isValid("(])");
        System.out.println(x);

    }

    public static boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<Character>();

//        String[] left={"(","{","["};
//        String[] right={")","}","]"};
        String left="({[";
        String right=")}]";

        LinkedList<Character> list=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(right.indexOf(s.charAt(i))!=-1){
                if(list.size()==0){
                    return false;
                }
                int leftindex=left.indexOf(list.getLast());
                int rightindex=right.indexOf(s.charAt(i));
                if(leftindex==rightindex){
                    list.removeLast();
                }else{
                    return false;
                }

            }else{
                list.add(s.charAt(i));
            }

        }
        if(list.size()>0){
            return false;
        }
        return true;
    }




}
