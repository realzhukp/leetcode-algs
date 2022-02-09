package algs;

import java.util.*;

public class Q018 {

    public static void main(String[] args) {

        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> list=fourSum(nums,target);
        list.forEach(x->{
            System.out.println(x);
        });

    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int j=i+1;
            int k=nums.length-2;
            int l=nums.length-1;
            int temptarget=target-nums[i]-nums[l];

            while(j<k){
                if(nums[j]+nums[k]>temptarget){
                    k--;
                }else if(nums[j]+nums[k]<temptarget){
                    j++;
                } else{
                    list.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                }
            }

        }


        return  list;
    }




}
