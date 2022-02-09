package algs;

import java.util.HashSet;

public class Q053 {

    public static void main(String[] args) {

        //[5,4,-1,7,8]
        int[] nums = {-2,-1,-3,-4,-1,-2,-1,-5,-4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        int max=nums[0];

        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            sum=sum<0?0:sum;
        }
        return max;

    }


}


