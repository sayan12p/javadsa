package com.java.linkedlist;

public class KReverseLinkedList {

    public static ListNode reverseKGroup(ListNode head, int k) {
        //You can code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;ListNode cur=dummy;
        int i = 1;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode groupstart = head;
        ListNode groupend = null;
        while(i++*k<=count) {
            groupend = getgroupend(groupstart, k);
            ListNode reversenode = reversegroup(groupstart, groupend);
            cur.next=reversenode;
            cur=groupstart;
            groupstart=groupend;
        }
        return dummy.next;
    }
        private static ListNode reversegroup (ListNode groupstart, ListNode groupend){
            ListNode prev = groupend;
            while (groupstart != groupend) {
                ListNode next = groupstart.next;
                groupstart.next = prev;
                prev = groupstart;
                groupstart = next;
            }
            return prev;
        }

        static ListNode getgroupend (ListNode head,int k){
            int j = 1;
            while (j++ <= k) {
                head = head.next;
            }
            return head;
        }
        public static void main (String[]args){
            ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6,
                    new ListNode(7, new ListNode(8,  null))))))));
            System.out.println(reverseKGroup(l1, 4));
        }
    }

