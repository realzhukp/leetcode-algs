package algs;

import java.util.ArrayList;
import java.util.List;

public class Q061 {

    public static void main(String[] args) {


//        ListNode node1=new ListNode()

//        System.out.println(getPermutation(n,k));

    }

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null){
            return head;
        }

        int length=1;
        ListNode last=head;
        while(last.next!=null){
            length++;
            last=last.next;
        }
        if(length==1){
            return head;
        }
        last.next=head;
        int count=k%length;
        ListNode beforefirst=last;

        int i=length-count;
        while(i>0){
            beforefirst=beforefirst.next;
            i--;
        }

        ListNode first=beforefirst.next;
        beforefirst.next=null;
        return first;

    }


}


