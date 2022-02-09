package algs;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

    public static void main(String[] args) {

//        int[] nums1 = {1,2,3,6};
//        int[] nums2 = {1,3,4,5,9,10};

        int[] nums1={1};
        int[] nums2={2,3,4,5,6};

        System.out.println(findNth(nums1,nums2,4,0,0));

//        double result=findMedianSortedArrays(nums1,nums2);
//        System.out.println(result);

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;

        if((m+n)%2==0){
            return (findNth(nums1,nums2,(m+n)/2+1,0,0)+findNth(nums1,nums2,(m+n)/2,0,0))/2.0;
        }
        else{
            return findNth(nums1,nums2,(m+n)/2+1,0,0);
        }
    }

    public static int findNth(int[] nums1,int[] nums2, int count,int index1,int index2){

        if(index1>nums1.length-1){
            return nums2[index2+count-1];
        }
        if(index2>nums2.length-1){
            return nums1[index1+count-1];
        }

        if(count==1){
            return Math.min(nums1[index1],nums2[index2]);
        }

        int half=count/2;

        int newindex1=Math.min(index1+half-1,nums1.length-1);
        int newindex2=Math.min(index2+half-1,nums2.length-1);

        if(nums1[newindex1]>nums2[newindex2]){
            return findNth(nums1,nums2,count-(newindex2-index2+1),index1,newindex2+1);
        }else{
            return findNth(nums1,nums2,count-(newindex1-index1+1),newindex1+1,index2);
        }

    }

}
