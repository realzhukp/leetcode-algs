package algs;

public class Q025 {

    public static void main(String[] args) {


        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        ListNode node6=new ListNode(6);
        ListNode node7=new ListNode(7);

//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        node5.next=node6;
//        node6.next=node7;

        ListNode result=reverseKGroup(node1,1);

        System.out.println(result);

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode beforefirst=new ListNode(0,head);
        ListNode first=head;
        ListNode index=head;
        ListNode result=beforefirst;

        int count=0;
        while(index!=null){
            count++;
            if(count==k-1){
                ListNode temp=index.next;
                beforefirst.next=reversen(first,k);
                beforefirst=first;
                index=first;
                first=temp;
                count=0;
            }
            index=index.next;
        }

        return result.next;
    }

    public static ListNode reversen(ListNode first,int k){

        ListNode result=new ListNode(0,first);

        int count=0;
        while(count<k-1){

            ListNode temp=first.next;
            ListNode temp2=result.next;
            first.next=first.next.next;
            result.next=temp;
            result.next.next=temp2;
            count++;
        }

        return result.next;
    }



//    public static boolean backtrack(ListNode first,ListNode last,int k,int count) {
//
//        if(last==null) {
//            return false;
//        }
//
//        if(count==k) {
//            if(first!=last && last.next!=first) {
//                ListNode temp=first.next;
//                first.next=last.next;
//                last.next=temp;
//                return true;
//            }
//        }else {
//            boolean result=backtrack(first,last.next,k,count+1);
//            if(result) {
//                if(first!=last && last.next!=first) {
//                    ListNode temp=first.next;
//                    first.next=last.next;
//                    last.next=temp;
//                    return true;
//                }
//            }
//            return result;
//        }
//
//    }




    public static ListNode getN(ListNode head,int k,int count){

        return head;
    }


}


