package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q071 {

    public static void main(String[] args) {

        System.out.println(simplifyPath("/home/of/foo/../../bar/../../is/./here/."));

    }

    public static String simplifyPath(String path) {

        StringBuffer s=new StringBuffer(path);

        Deque<String> stack=new LinkedList<>();
        int i=1;
        int j=1;
        while(i<s.length()){
            if(s.charAt(i)=='/'){
                String temp=s.substring(j,i);
                if(temp.length()>0){
                    stack.push(temp);
                }
                i++;
                j=i;
            }else{
                i++;
            }
        }
        if(j!=i){
            String temp=s.substring(j,i);
            stack.push(temp);
        }

        StringBuffer result=new StringBuffer();

        int popcount=0;
        while(stack.size()!=0){
            String temp=stack.peek();
            if(".".equals(temp)){
                stack.pop();
                continue;
            }
            if("..".equals(temp)){
                stack.pop();
                popcount++;
                continue;
            }
            if(popcount>0){
                popcount--;
                stack.pop();
                continue;
            }
            result.insert(0,"/"+stack.pop());
        }
        if(result.length()==0){
            result.append("/");
        }

        return result.toString();
    }






}


