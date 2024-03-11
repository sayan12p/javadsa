package com.java.linkedlist;

import java.linkedlist.ListNode;

public class ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;ListNode prevtail=dummy;
        int index=left;
        while(--index>0 && prevtail!=null){
            prevtail=prevtail.next;
        }
        ListNode groupstart=getgroupend(head,left);
        ListNode groupend=getgroupend(head,right);
        prevtail.next=reversenode(groupstart,groupend.next);
        return dummy.next;
    }

    private static ListNode reversenode(ListNode start, ListNode end) {
        ListNode prev=end;
        while(start!=end){
            ListNode next=start.next;
            start.next=prev;
            prev=start;
            start=next;
        }
        return prev;
    }

    public static ListNode getgroupend(ListNode head,int index){
        while(head!=null && --index>0) {
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
//        ListNode l1=new ListNode(5);
        System.out.println(reverseBetween(l1,2,4));
    }
}
