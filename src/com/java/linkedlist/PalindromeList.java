package com.java.linkedlist;

public class PalindromeList {

    public static int isPalin(ListNode A) {
        //You can code here
      ListNode fast=A;
      ListNode slow=A;
      ListNode firstTail=null;

      while(fast!=null && fast.next!=null){
         fast=fast.next.next;
         firstTail=slow;
         slow=slow.next;
       }
      if(firstTail!=null){
          firstTail.next=null;
          ListNode secondHead=null;
          if(fast!=null){
              secondHead=slow.next;
          }else{
              secondHead=slow;
          }
          secondHead=reverselist(secondHead);
            ListNode firstHead=A;
          while(secondHead!=null && firstHead!=null){
              if(firstHead.val!=secondHead.val){
                  return 0;
              }
              firstHead=firstHead.next;
              secondHead=secondHead.next;
          }
      }
return 1;

        }
        static  ListNode reverselist(ListNode head){
            ListNode cur=head;
            ListNode prev=null;
            while(cur!=null){
                ListNode next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            return prev;
    }
    public static void main(String[] args) {
//        ListNode a=new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(99,
//                new ListNode(99,
//                new ListNode(9,new ListNode(9,null)))))))));
//      //  ListNode a=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(2,new ListNode(1)))));
        ListNode a=new ListNode(5,new ListNode(5,null));
        System.out.println(isPalin(a));
    }
}
