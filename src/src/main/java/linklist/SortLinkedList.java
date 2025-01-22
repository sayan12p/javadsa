package linklist;

import static linklist.Merge2SortedLists.mergeTwoLists;

public class SortLinkedList {

    public static ListNode sortLL(ListNode head) {
        // Write your code here.
        if(head==null || head.next==null) return head;
        ListNode mid=findmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortLL(left);
        right=sortLL(right);

        return mergeTwoLists(left,right);
    }

    private static ListNode findmid(ListNode head) {

        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        ListNode node=new ListNode(4,new ListNode(2,new ListNode(3,new ListNode(1,null))));
        System.out.println(sortLL(node));
    }
}
