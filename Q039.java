package algs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Q039 {

    public static void main(String[] args) {

        //输入：nums = [3,4,-1,1]
        //输出：2

        //输入：nums = [7,8,9,11,12]
        //        //输出：1

        int[] nums = {-7,1,8,7,9,11,12,2,3};
        int result=firstMissingPositive(nums);
        System.out.println(result);
    }

    public static int firstMissingPositive(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;



    }





}


