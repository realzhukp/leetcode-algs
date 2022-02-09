package algs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q082 {

    public static void main(String[] args) {

        //1,1,1,2,2,3
        System.out.println(-1/2);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode result=new ListNode(0);
        result.next=head;

        ListNode node=result;

        while(node.next!=null && node.next.next!=null){

            if(node.next.val==node.next.next.val){
                int temp=node.next.val;
                while(node.next!=null && node.next.val==temp){
                    node.next=node.next.next;
                }

            }else{
                node=node.next;
            }
        }

        return result.next;


    }









}


