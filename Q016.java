package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q016 {

    public static void main(String[] args) {

//        int[] x={1,8,6,2,5,4,8,3,7};
//        int[] x={1,2,1};

        String[] x = {"flower","flow","flight"};

//        int[] nums = {1,2,4,8,16,32,64,128};
        int [] nums ={1,-3,3,5,4,1};
//        int[] nums = {-1,2,1,-4};

        int result=threeSumClosest(nums,1);
        System.out.println(result);
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        int min=Math.abs(target-result);

        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int tempmin=nums[i]+nums[j]+nums[k]-target;
                if(nums[i]+nums[j]+nums[k]==target){
                    return target;
                }
                if(Math.abs(tempmin)>=min){
                    if(tempmin>=0){
                        k--;
                    }else if(tempmin<0){
                        j++;
                    }

                }else if (Math.abs(tempmin)<min){
                    result=nums[i]+nums[j]+nums[k];
                    min=Math.abs(tempmin);
                }
            }
        }

        return result;
    }




}
