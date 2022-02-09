package algs;

import java.util.*;

public class Q015 {

    public static void main(String[] args) {

//        int[] x={1,8,6,2,5,4,8,3,7};
//        int[] x={1,2,1};

        String[] x = {"flower","flow","flight"};

        int[] nums = {1,-1,-1,0};

        List<List<Integer>> result=threeSum(nums);
        result.forEach(m->{
            System.out.println(m);
        });
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int end=n-1;
            HashSet<Integer> set=new HashSet<>();

            while (end>start){

                if(set.contains(nums[start])){
                    start++;
                    continue;
                }
                if(set.contains(nums[end])){
                    end--;
                    continue;
                }

                if(nums[i]+nums[start]+nums[end]==0){
                    List<Integer> list=List.of(nums[i],nums[start],nums[end]);
                    result.add(list);
                    set.add(nums[start]);
                    set.add(nums[end]);
                    end--;
                    start++;
                }
                else if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }

        return result;
    }




}
