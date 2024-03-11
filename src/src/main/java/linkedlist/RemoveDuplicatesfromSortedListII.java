package com.java.linkedlist;
import java.linkedlist.ListNode;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RemoveDuplicatesfromSortedListII {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);dummy.next=head;
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.val == cur.next.val) {
                    cur = cur.next;
                }
                prev.next = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
            prev = prev.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
    ListNode head=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(4,new ListNode(4,new ListNode(5,null)))))));
        System.out.println(deleteDuplicates(head));
    }
}
