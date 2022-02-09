package algs;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Q033 {

    public static void main(String[] args) {

        //7123456
        int[] nums = {1,3};
        int target = 3;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int middle= (high+low)/2;

            if(nums[middle]==target){
                return middle;
            }
            if(nums[high]>nums[middle]){
                if(target<=nums[high] && target>nums[middle]){
                    low=middle+1;
                }else{
                    high=middle;
                }
            }else{
                if(target>=nums[low] && target<nums[middle]){
                    high=middle;
                }else{
                    low=middle+1;
                }
            }
        }
        return -1;
    }

    public static int binarysearch(int[] nums, int target){
        int low=0;
        int high=nums.length-1;

        while(low<high){
            int middle=low+high/2;
            if(nums[middle]>target){
                low=middle+1;
            }else{
                high=middle;
            }
        }
        return low;


    }


}


