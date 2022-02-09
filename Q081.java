package algs;

public class Q081 {

    public static void main(String[] args) {

        int[] nums = {1,0,1,1,1};
        System.out.println(search(nums,0));
    }

    public static boolean search(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){

            int middle=(low+high)/2;

            if(nums[middle]==target){
                return true;
            }

            if(nums[low]<nums[middle]){
                if(target>nums[middle]){
                    low=middle+1;
                }else if(target<nums[low]){
                    low=middle+1;
                }else {
                    high=middle-1;
                }
            }
            else if(nums[middle]<nums[high]){
                if(target>nums[high]){
                    high=middle-1;
                }else if(target<nums[middle]){
                    high=middle-1;
                }else{
                    low=middle+1;
                }
            }else{
                if(target==nums[low] || target==nums[high]){
                    return true;
                }else{
                    low++;
                    high--;
                }
            }

        }
        return false;

    }







}


