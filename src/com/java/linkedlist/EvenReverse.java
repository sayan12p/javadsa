package com.java.linkedlist;

public class EvenReverse {

    public static ListNode evenReverse(ListNode A) {
        //You can code here
        ListNode odd=A;
        ListNode temp=A.next;
        ListNode dummyoddlist=new ListNode(0);
        dummyoddlist.next=odd;
        ListNode cur=dummyoddlist;
        ListNode dummyevenlist=new ListNode(0);
        dummyevenlist.next=temp;
        ListNode cureven=dummyevenlist;
        //seperate odd and even nodes
        while(odd!=null && odd.next!=null){
            temp=odd.next;
            cureven.next=temp;
            cur.next=odd;
            odd.next=temp.next;
            odd=odd.next;
            cur=cur.next;
            cureven=cureven.next;
        }
        if(temp!=null && temp.next!=null){
            cureven.next=null;
        }
        dummyevenlist.next=reverse(dummyevenlist.next);
        ListNode result=new ListNode(0);
        ListNode curesult=result;
        while(dummyoddlist.next!=null && dummyevenlist.next!=null){
            curesult.next=dummyoddlist.next;
            curesult=dummyoddlist.next;
            dummyoddlist.next=dummyoddlist.next.next;
            curesult.next=dummyevenlist.next;
            curesult=dummyevenlist.next;
            dummyevenlist.next=dummyevenlist.next.next;
        }
        curesult.next=(dummyoddlist.next!=null)?dummyoddlist.next:dummyevenlist.next;
        return result.next;
    }

    private static ListNode reverse(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4,  null))));
        System.out.println(evenReverse(l1));
    }
}
