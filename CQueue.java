package algs;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CQueue {

    public static void main(String[] args) {

    }

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else{
            return stack2.pop();
        }

    }






}
