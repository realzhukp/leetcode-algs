package algs;

public class Q092 {

    public static void main(String[] args) {

        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        reverseBetween(node1,1,4);

    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode beforehead=new ListNode();
        beforehead.next=head;

        int index=1;
        while(index<left){
            beforehead=beforehead.next;
            index++;
        }

        int count=right-left+1;
        ListNode loop=beforehead.next;
        while(count>1){
            ListNode temp=loop.next;
            loop.next=loop.next.next;
            temp.next=beforehead.next;
            beforehead.next=temp;
            count--;
        }


        return left==1?beforehead.next:head;

    }



}


