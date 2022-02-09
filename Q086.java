package algs;

public class Q086 {

    public static void main(String[] args) {

//        ListNode node1=new ListNode(1);
//        ListNode node2=new ListNode(4);
//        ListNode node3=new ListNode(3);
//        ListNode node4=new ListNode(2);
//        ListNode node5=new ListNode(5);
//        ListNode node6=new ListNode(2);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;
//        partition(node1,3);

        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(1);
        ListNode node3=new ListNode(1);
        node1.next=node2;
        node2.next=node3;
        partition(node1,2);

    }

    public static ListNode partition(ListNode head, int x) {

        ListNode result=new ListNode(0,head);

        ListNode fast=result;
        ListNode slow=result;

        while(fast.next!=null){
            if(fast.next.val<x){
                if(fast.next==slow.next){
                    fast=fast.next;
                    slow=slow.next;
                }else{
                    ListNode temp=fast.next;
                    fast.next=fast.next.next;
                    temp.next=slow.next;
                    slow.next=temp;
                    slow=slow.next;
                }
            }else{
                fast=fast.next;
            }
        }

        return result.next;

    }

}


