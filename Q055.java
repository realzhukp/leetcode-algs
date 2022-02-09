package algs;

import java.util.ArrayList;
import java.util.List;

public class Q055 {

    public static void main(String[] args) {


        int[] nums = {2,0};
        System.out.println(canJump(nums));

    }

    public static boolean canJump(int[] nums) {

        if(nums.length==1){
            return true;
        }

        int maxposition=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            maxposition=Math.max(maxposition,nums[i]+i);

            if(i==end){
                if(end!=maxposition){
                    end=maxposition;
                }else{
                    return maxposition==nums.length-1;
                }

            }
        }
        return true;

    }


}


