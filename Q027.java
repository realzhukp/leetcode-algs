package algs;

import java.util.HashSet;
import java.util.Set;

public class Q027 {

    public static void main(String[] args) {


        int[] temp={1,1,1,3,5};
        //{1,3,5,....}

        int result=removeElement(temp,2);

        for(int i=0;i<result;i++){
            System.out.println(temp[i]);
        }



    }

    public static int removeElement(int[] nums, int val) {
        int result=nums.length;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==val){
                result--;
            }else{
                nums[i]=nums[j];
                i++;
            }
        }
        return result;

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


