package algs;

import java.util.*;

public class Q046 {

    public static void main(String[] args) {


        int[] nums={1,2,3,4,5,6};
        List<List<Integer>> result=permute2(nums);

        result.forEach(x->{
            System.out.println(x.toString());
        });

    }



    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        Arrays.sort(nums);

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        backtrack(nums,result,new ArrayList<>(),new HashSet<>(),0);
        return result;

    }

    public static void backtrack(int[] nums, List<List<Integer>> result, List<Integer> list,HashSet<Integer> set,int count){

//        Collections.swap();
        if(count==nums.length){
            result.add(new ArrayList<>(list));
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(!set.contains(i)){
                set.add(i);
                list.add(nums[i]);
                count++;
            }else{
                continue;
            }

            backtrack(nums,result,list,set,count);
            list.remove(list.size()-1);
            set.remove(i);
            count--;
        }


    }

    public static List<List<Integer>> permute2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        dft(res,list,0);
        return res;
    }

    public static void dft(List<List<Integer>> result,List<Integer> list,int index){

        if(index==list.size()){
            result.add(new ArrayList<>(list));
        }else{
            for(int i=index;i<list.size();i++){

                if(i!=index && list.get(i)==list.get(index)){
                    continue;
                }

                Collections.swap(list,i,index);

                dft(result,list,index+1);

                Collections.swap(list,i,index);
            }
        }

    }





}


