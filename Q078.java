package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q078 {

    public static void main(String[] args) {

        int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }

    public static List<List<Integer>> subsets(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        dft(result,list,0,nums);
        return result;

    }

    public static void dft(List<List<Integer>> result,List<Integer> list,int index,int[] nums){

        result.add(new ArrayList<>(list));

        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            dft(result,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }





}


