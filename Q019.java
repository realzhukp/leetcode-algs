package algs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q019 {

    public static void main(String[] args) {

        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        node1.next=node2;
        node2.next=node3;

        ListNode list=removeNthFromEnd(node1,1);
        System.out.println(list);

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next==null){
            return null;
        }

        int resultnum=backtracktime(head,n);

        if(resultnum==n){
            head=head.next;
        }

        return head;
    }

    private static int backtracktime(ListNode node,int n){


        if(node.next==null){
            return 1;

        }else{

            ListNode nextNode=node.next;
            int currentNumber=backtracktime(nextNode,n)+1;
            if(currentNumber==n+1){
                node.next=node.next.next;
            }
            return currentNumber;

        }
    }




}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
