package algs;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Q032 {

    public static void main(String[] args) {

        //(())())((((
        //()(())
        //"(()()(())(("
        System.out.println(longestValidParentheses("(()()(())(("));

    }



    public static int longestValidParentheses(String s) {

        int max=0;

        Deque<Integer> stack=new LinkedList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                stack.push(i);
            }else{
                if(!stack.isEmpty()){
                    Integer start=stack.pop();

                    int min=start;
                    if(map.get(start-1)!=null){
                        min=Math.min(min,map.get(start-1));
                    }
                    int length=i-min+1;
                    max=Math.max(max,length);
                    map.put(i,min);

                }
            }
        }

        return max;
    }



}


