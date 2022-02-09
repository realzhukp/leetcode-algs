package algs;

import java.util.Deque;
import java.util.LinkedList;

public class Q021 {

    public static void main(String[] args) {


        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(4);
        ListNode node4=new ListNode(7);
        ListNode node5=new ListNode(2);
        ListNode node6=new ListNode(5);
        ListNode node7=new ListNode(9);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        node5.next=node6;
        node6.next=node7;

        ListNode[] list={node1,node5};

        ListNode result=mergeKLists(list);

        System.out.println(result);

    }

    public static ListNode mergeKLists(ListNode[] list) {
        ListNode result=null;

        int count=list.length;

        for(int i=0;i<list.length;i++){
            result=mergetwolists(result,list[i]);
        }

        return result;
    }

    public static ListNode mergetwolists(ListNode node1,ListNode node2){
        ListNode result=new ListNode(0);
        ListNode temp=result;

        while(node1!=null && node2!=null){
            if(node1.val>node2.val){
                temp.next=node2;
                node2=node2.next;
            }else{
                temp.next=node1;
                node1=node1.next;
            }
            temp=temp.next;

        }
        if(node1==null){
            temp.next=node2;
        }
        if(node2==null){
            temp.next=node1;
        }
        return result.next;

    }

}


