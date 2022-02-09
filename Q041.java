package algs;

import java.util.*;

public class Q041 {

    public static void main(String[] args) {

        //4,2,0,3,2,5
        //0,1,0,2,1,0,1,3,2,1,2,1

        int[] nums = {4,2,0,3,2,5};
        int result=trap4(nums);
        System.out.println(result);

    }

    public static int trap(int[] height) {
        int result=0;
        int max=0;

        for(int i=0;i<height.length;i++) {
            max=height[i]>max?height[i]:max;
        }

        for(int i=0;i<=max;i++) {

            int left=-1;
            int right=-1;
            for(int j=0;j<height.length;j++) {
                if(height[j]>i) {
                    if(left==-1) {
                        left=j;
                    }else {
                        right=j;
                        result=result+(right-left-1);
                        left=right;
                    }
                }
            }

        }
        return result;
    }

    public static int trap2(int[] height) {

        Deque<Integer> stack=new LinkedList<>();
        int result=0;

        for(int i=0;i<height.length;i++){

            while(!stack.isEmpty() && height[stack.peek()]<height[i]){
                int temp=height[stack.pop()];
                if(stack.isEmpty()){
                    break;
                }
                int left=stack.peek();

                int width=i-left-1;
                int tall=Math.min(height[left],height[i])-temp;
                result+=width*tall;
            }
            stack.push(i);

        }
        return result;
    }

    public static int trap3(int[] height) {

        if(height.length==0){
            return 0;
        }

        int result=0;
        int max1=0;
        int max2=0;
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];

        for(int i=0;i<height.length;i++){
            max1=height[i]>max1?height[i]:max1;
            leftmax[i]=max1;
        }
        for(int i=height.length-1;i>=0;i--){
            max2=height[i]>max2?height[i]:max2;
            rightmax[i]=max2;
        }
        for(int i=0;i<height.length;i++){
            result+=Math.min(leftmax[i],rightmax[i])-height[i];
        }

        return result;

    }

    public static int trap4(int[] height) {
        int result=0;

        int left=0;
        int right=height.length-1;

        int leftmax=0;
        int rightmax=0;

        while(left<right){
            leftmax=height[left]>leftmax?height[left]:leftmax;
            rightmax=height[right]>rightmax?height[right]:rightmax;

            if(height[left]<height[right]){
                result+=leftmax-height[left];
                left++;
            }
            else{
                result+=rightmax-height[right];
                right--;
            }

        }


        return result;

    }





}


