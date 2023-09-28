package com.java.linkedlist;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        //You can code here
    ListNode prev=null;
    ListNode next=null;
    ListNode cur=head;
    while(cur!=null){
         next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
return prev;
    }
    public static void main(String[] args) {
      ListNode h=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        System.out.println(reverseList(h).toString());
    }
}
