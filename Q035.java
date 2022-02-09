package algs;

public class Q035 {

    public static void main(String[] args) {

        //7123456
        int[] nums = {1,3,5,6};
        int target = 0;
        int  result=searchInsert(nums,target);

        System.out.println(result);

    }

    public static int searchInsert(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int middle=(low+high)/2;
            if(nums[middle]<target){
                low=middle+1;
            }else if(nums[middle]>target){
                high=middle-1;
            }else{
                return middle;
            }

        }
        return low;


    }



}


