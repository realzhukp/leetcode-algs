package algs;

public class Q080 {

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,2,2,2,2,3,4,5,6,7};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates2(int[] nums) {

        int result=1;
        int temp=nums[0];
        int count=1;

        int left=1;
        int right=1;

        while(right<nums.length){
            if(nums[right]==temp){
                count++;
                if(count<=2){
                    nums[left]=nums[right];
                    left++;
                    result++;
                }
            }else{
                temp=nums[right];
                count=1;
                nums[left]=nums[right];
                left++;
                result++;
            }
            right++;
        }

        return result;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }







}


