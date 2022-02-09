package algs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MedianFinder {

    public static void main(String[] args) {

        MedianFinder medianFinder=new MedianFinder();
        medianFinder.addNum(12);
        medianFinder.addNum(10);
        medianFinder.addNum(13);
        medianFinder.addNum(11);
        medianFinder.findMedian();

    }

    List<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();
    }

    public void addNum(int num) {
        int index=binarySearch(num);
        list.add(index,num);
    }

    public int binarySearch(int num){
        int low=0;
        int high=list.size();

        while (low<high){
            int middle=(low+high)/2;
            if(num>list.get(middle)){
                if(middle+1<=high-1 && num<list.get(middle+1)){
                    return middle+1;
                }
                low=middle+1;
            }
            else if(num<list.get(middle)){
                if(middle-1>=0 && num>list.get(middle-1)){
                    return middle;
                }
                high=middle-1;
            }
            else{
                return middle;
            }
        }

        return low;
    }

    public double findMedian() {
        int size=list.size();
        int half=size/2;
        if(size%2==0){
            return (list.get(half-1)+list.get(half))/2;
        }else{
            return list.get(half);
        }
    }






}
