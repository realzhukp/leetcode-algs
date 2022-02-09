package algs;

public class Q022 {

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
        node4.next=node5;
        node5.next=node6;
//        node6.next=node7;

        ListNode result=swapPairs(node1);

        System.out.println(result);

    }

    public static ListNode swapPairs(ListNode head) {

        ListNode result=new ListNode(0,head);

        ListNode temp=result;


        while(temp.next!=null && temp.next.next!=null){
            ListNode first=temp.next;
            ListNode second=temp.next.next;

            first.next=first.next.next;
            second.next=first;
            temp.next=second;
            temp=first;



        }



        ListNode first=head;
        ListNode second=null;
        if(first!=null){
            second=first.next;
        }

        while(first!=null && second!=null){
            first.next=first.next.next;
            second.next=first;
            temp.next=second;
            temp=first;

            first=first.next;
            if(first!=null){
                second=first.next;
            }
        }

        return result.next;

    }

}


