package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q042 {

    public static void main(String[] args) {

        //4,2,0,3,2,5
        //0,1,0,2,1,0,1,3,2,1,2,1

        int[] nums = {4,2,0,3,2,5};
        int result=trap(nums);
        System.out.println(result);

    }

    public static int trap(int[] height) {

        int result=0;
        Deque<Integer> stack=new LinkedList<>();

        for(int i=0;i<height.length;i++){

            while (!stack.isEmpty() && height[i]>height[stack.peek()]){
                int top=stack.pop();

                if(stack.isEmpty()){
                    break;
                }

                int left=stack.peek();
                int h=Math.min(height[left],height[i])-height[top];
                int w=i-left-1;
                result+=h*w;

            }

            stack.push(i);
        }

        return result;
    }





}


