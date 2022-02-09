package algs;

public class Q034 {

    public static void main(String[] args) {

        //7123456
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int [] result=searchRange(nums,target);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);

        }

    }

    public static int[] searchRange(int[] nums, int target) {

        int start=-1;
        int end=-1;

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int middle=(low+high)/2;
            if(target>nums[middle]){
                low=middle+1;
            }else if(target<nums[middle]){
                high=middle-1;
            }else{
                start=middle;
                end=middle;
                while(start>0 && nums[start]==nums[start-1]){
                    start--;
                }
                while(end<nums.length-1 && nums[end]==nums[end+1]){
                    end++;
                }
                break;
            }
        }
        int[] result={start,end};
        return result;

    }


}


