package algs;

import java.util.*;

public class Q026 {

    public static void main(String[] args) {


        int[] temp={1,1,1,3,5};
        //{1,3,5,....}

        int result=removeDuplicates(temp);

        for(int i=0;i<result;i++){
            System.out.println(temp[i]);
        }



    }

    public static int removeDuplicates(int[] nums) {
        int count=0;
        Set<Integer> set=new HashSet<>();

        int indexset=0;

        for(int indexloop=0;indexloop<nums.length;indexloop++){
            if(!set.contains(nums[indexloop])){
                set.add(nums[indexloop]);
                nums[indexset]=nums[indexloop];
                indexset++;
                count++;
            }
        }

        return count;

    }

    public static int removeDuplicates2(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        int indexset=0;

        for(int indexloop=0;indexloop<nums.length;indexloop++){
            if(nums[indexset]!=nums[indexloop]){
                nums[indexset]=nums[indexloop];
                indexset++;
            }
        }

        return indexset+1;

    }




}


