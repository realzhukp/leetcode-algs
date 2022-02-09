package algs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q001 {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        int[] result= new int[2];
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i]) && nums[i]*2==target){
                result[0]=i;
                result[1]=map.get(nums[i]);
            }else{
                map.put(nums[i], i);
            }
        }
        for(int i=0;i<nums.length;i++) {
            int targetvalue=target-nums[i];
            if(map.containsKey(targetvalue) && i!=map.get(targetvalue)) {
                result[0]=i;
                result[1]=map.get(targetvalue);
                break;
            }
        }
        return result;

    }

}
