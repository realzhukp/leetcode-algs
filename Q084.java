package algs;

import java.util.*;

public class Q084 {

    public static void main(String[] args) {

        int[] heights={2,1,5,6,5,3};
//        [5,4,1,2]

//        int[] heights={2,2,2,2,2};
//        int[] heights={5,4,1,2};
        System.out.println(largestRectangleArea(heights));

    }

    public static int largestRectangleArea(int[] heights) {

        Deque<Integer> stack=new LinkedList<>();
        int n=heights.length;

        int[] fromLeft=new int[n];
        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                fromLeft[stack.pop()]=i-1;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            fromLeft[stack.pop()]=n-1;
        }
        int[] fromRight=new int[n];
        for(int i=n-1;i>=0;i--){
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                fromRight[stack.pop()]=i+1;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            fromRight[stack.pop()]=0;
        }

        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,heights[i]*(fromLeft[i]-fromRight[i]+1));
        }
        return max;
    }

}


