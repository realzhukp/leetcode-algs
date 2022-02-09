package algs;

public class Q045 {

    public static void main(String[] args) {


        int[] nums={2,3,1,2,4,2,3};
        int result=jump3(nums);
        System.out.println(result);

    }

    public static int jump(int[] nums) {

        int[] result=new int[nums.length];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>= nums.length-1){
                result[i]=1;
            }else{
                int min=result[i+1];
                for(int j=2;j<=nums[i];j++){
                    min =Math.min(result[i+j],min);
                }
                result[i]=min+1;
            }
        }

        return result[0];


    }

    public static int jump2(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }

    public static int jump3(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }



}


