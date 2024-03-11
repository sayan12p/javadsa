package com.java.linkedlist;
import java.linkedlist.ListNode;
public class ReverseNodesinKGroup {

    //https://leetcode.com/problems/reverse-nodes-in-k-group/discuss/4016676/JAVA-oror-TC-%3A-O(n)-oror-Optimized-Solution
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevGroupTail=dummy;
        while(head!=null){
            ListNode groupstart=head;
            ListNode groupend=getgroupend(head,k);
            if(groupend==null) break;
            prevGroupTail.next=reverseList(groupstart,groupend.next);
            prevGroupTail=groupstart;
            head=prevGroupTail.next;
        }
        return dummy.next;
    }

    private static ListNode reverseList(ListNode start, ListNode end) {
        ListNode prev=end;
        while(start!=end){
            ListNode next=start.next;
            start.next=prev;
            prev=start;
            start=next;
        }
        return prev;
    }

    private static ListNode getgroupend(ListNode head, int k) {
        while(head!=null && --k>0){
            head=head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        System.out.println(reverseKGroup(l1,3));
    }
}
