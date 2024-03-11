package com.java.linkedlist;

import java.linkedlist.ListNode;

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
 ListNode dummy=new ListNode(0);
 dummy.next=head;
 ListNode first=dummy;
 ListNode second=dummy;
 for(int i=1;i<=n+1;i++){
     first=first.next;
 }
 while(first!=null){
     first=first.next;
     second=second.next;
 }
 second.next=second.next.next;
 return dummy.next;

    }

    public static void main(String[] args) {
        ListNode node=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        System.out.println(removeNthFromEnd(node,5).toString());
    }
}
