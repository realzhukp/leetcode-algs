package algs;

public class Q011 {

    public static void main(String[] args) {

        int[] x={1,8,6,2,5,4,8,3,7};
//        int[] x={1,2,1};

        System.out.println(maxArea(x));

    }


    public static int maxArea(int[] height) {

        int n=height.length;

        int left=0;
        int right=n-1;

        int max=0;

        while(left<right){
            int l=(right-left);
            int h=Math.min(height[right],height[left]);
            max=Math.max(l*h,max);
            if(height[right]>height[left]){
                left++;
            }else {
                right--;
            }
        }

        return max;
    }




}
