package com.java.linkedlist;
import java.linkedlist.ListNode;
public class SwapNodesInPair {

    // https://leetcode.com/problems/swap-nodes-in-pairs/discuss/1775033/SWAPPING-NODES-(Not-just-the-values)-oror-Visual-Explanation-oror-Well-Explained-oror-C%2B%2B
    public static ListNode swapPairs(ListNode head) {
        if(head==null ) return null;
        if(head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head;
        ListNode prev=dummy;
        while(cur!=null && prev!=null && cur.next!=null){
           prev.next=cur.next;
           cur.next=prev.next.next;
           prev.next.next=cur;
           prev=cur;
           cur=cur.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        System.out.println(swapPairs(head).toString());
    }
}
