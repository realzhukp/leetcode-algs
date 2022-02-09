package algs;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LRUCache {

    public static void main(String[] args){
        LRUCache obj = new LRUCache(10);
        obj.put(10,13);
        obj.put(3,17);
        obj.put(6,11);
        obj.put(10,5);
        obj.put(9,10);
        System.out.println(obj.get(13));
        obj.put(2,19);
        System.out.println(obj.get(2));
        System.out.println(obj.get(3));
        obj.put(5,25);
        System.out.println(obj.get(8));
        obj.put(9,22);
        obj.put(5,5);
        obj.put(1,30);
        System.out.println(obj.get(11));
        obj.put(9,12);
        System.out.println(obj.get(7));
        System.out.println(obj.get(5));
        System.out.println(obj.get(8));
        System.out.println(obj.get(9));
        obj.put(4,30);
        obj.put(9,3);
        System.out.println(obj.get(9));
        System.out.println(obj.get(10));
        System.out.println(obj.get(10));
        obj.put(6,14);
        obj.put(3,1);
        System.out.println(obj.get(3));
        obj.put(10,11);
        System.out.println(obj.get(8));
        obj.put(2,14);
        System.out.println(obj.get(1));
        System.out.println(obj.get(5));
        System.out.println(obj.get(4));
        obj.put(11,4);
        obj.put(12,24);
        obj.put(5,18);
        System.out.println(obj.get(13));
        obj.put(7,23);
        System.out.println(obj.get(8));
        System.out.println(obj.get(12));
        obj.put(3,27);
        obj.put(2,12);
        System.out.println(obj.get(5));
        obj.put(2,9);
        obj.put(13,4);
        obj.put(8,18);
        obj.put(1,7);
        System.out.println(obj.get(6));
        obj.put(9,29);
        obj.put(8,21);
        System.out.println(obj.get(5));
        obj.put(6,30);
        obj.put(1,12);
        System.out.println(obj.get(10));
        obj.put(4,15);
        obj.put(7,22);
        obj.put(11,26);
        obj.put(8,17);
        obj.put(9,29);
        System.out.println(obj.get(5));
        obj.put(3,4);
        obj.put(11,30);
        System.out.println(obj.get(12));
        obj.put(4,29);
        System.out.println(obj.get(3));
        System.out.println(obj.get(9));
        System.out.println(obj.get(6));
        obj.put(3,4);
        System.out.println(obj.get(1));
        System.out.println(obj.get(10));
        obj.put(3,29);
        obj.put(10,28);
        obj.put(1,20);
        obj.put(11,13);
        System.out.println(obj.get(3));
        obj.put(3,12);
        obj.put(3,8);
        obj.put(10,9);
        obj.put(3,26);
        System.out.println(obj.get(8));
        System.out.println(obj.get(7));
        System.out.println(obj.get(5));
        obj.put(13,17);
        obj.put(2,27);
        obj.put(11,15);
        System.out.println(obj.get(12));
        obj.put(9,19);
        obj.put(2,15);
        obj.put(3,16);
        System.out.println(obj.get(1));
        obj.put(12,17);
        obj.put(9,1);
        obj.put(6,19);
        System.out.println(obj.get(4));
        System.out.println(obj.get(5));
        System.out.println(obj.get(5));
        obj.put(8,1);
        obj.put(11,7);
        obj.put(5,2);
        obj.put(9,28);
        System.out.println(obj.get(1));
        obj.put(2,2);
        obj.put(7,4);
        obj.put(4,22);
        obj.put(7,24);
        obj.put(9,26);
        obj.put(13,28);
        obj.put(11,26);
    }

    int capacity;
    int count;
    DoubleListNode first;
    HashMap<Integer,DoubleListNode> map;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.count=0;
        map=new HashMap<>();
    }

    public int get(int key) {
        if(map.containsKey(key)) {
            DoubleListNode node=map.get(key);
            int value=node.val;
            deleteNode(node);
            insertKey(key,value);
            return first.val;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            deleteNode(map.get(key));
            insertKey(key,value);
        }else {
            if(count==capacity) {
                map.remove(first.prev.key);
                deleteNode(first.prev);
                insertKey(key,value);
            }else {
                count++;
                insertKey(key,value);
            }
        }
    }

    public void insertKey(int key,int value) {
        if(first==null) {
            first=new DoubleListNode(key,value);
            first.prev=first;
            first.next=first;
        }else {
            DoubleListNode temp=first;
            DoubleListNode prev=temp.prev;
            first=new DoubleListNode(key,value);
            prev.next=first;
            first.prev=prev;
            first.next=temp;
            temp.prev=first;
        }
        map.put(key,first);
    }


    public void deleteNode(DoubleListNode node) {
        DoubleListNode prev=node.prev;
        DoubleListNode next=node.next;

        if(prev==node){
            first=null;
        }else{
            if(node==first){
                first=first.next;
                prev.next=first;
                first.prev=prev;
            }else{
                prev.next=next;
                next.prev=prev;
            }
        }
    }


}
class DoubleListNode{
    int val;
    int key;
    DoubleListNode prev;
    DoubleListNode next;

    DoubleListNode(int key,int val){
        this.key=key;
        this.val=val;
    }
}





