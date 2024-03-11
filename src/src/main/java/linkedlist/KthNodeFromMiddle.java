package com.java.linkedlist;

import java.linkedlist.ListNode;

public class KthNodeFromMiddle {

    public static int kthNode(ListNode head, int B) {
        //You can code here
    ListNode temp=head; int count =0;
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    int mid=count/2+1;
    ListNode first=head;
    if(mid-B<=0) return -1;
    for(int i=1;i<mid-B;i++){
        first=first.next;
    }
    return first.val;
    }
    public static void main(String[] args) {
        ListNode h=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        System.out.println(kthNode(h,2));
    }
}
