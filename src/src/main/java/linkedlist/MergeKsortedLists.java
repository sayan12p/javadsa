package com.java.linkedlist;
import java.linkedlist.ListNode;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://www.youtube.com/watch?v=RYJ3vs8qx10
public class MergeKsortedLists {
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>(lists.length, Comparator.comparingInt((ListNode l) -> l.val));
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        for(ListNode l:lists){
            if(l!=null){
                pq.add(l);
            }
        }
        while(!pq.isEmpty()){
            ListNode l1=pq.peek();
            tail.next=l1;
            tail=l1;
            pq.poll();
            if(l1.next!=null) pq.add(l1.next);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode[] lists= new ListNode[]{new ListNode(1,new ListNode(4,new ListNode(5,null))),
        new ListNode(1,new ListNode(3,new ListNode(4,null))),new ListNode(2,new ListNode(6,null))};
        System.out.println(mergeKLists(lists));
    }
}
