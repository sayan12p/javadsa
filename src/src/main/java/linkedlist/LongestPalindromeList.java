package com.java.linkedlist;

import java.linkedlist.ListNode;

public class LongestPalindromeList {


//    1,2,3,3,3,2,4,null
//
//    next=2--> null
//
//            1-->null

    public static int maxPalindrome(ListNode head) {
        //You can code here
        ListNode cur=head;// 1 2 3 3 2 4 null
        ListNode prev=null;
        int ans=1;
        while(cur!=null){
            ListNode next=cur.next; //   3 2 4 null

            cur.next=prev; //  3 2 1  null
            ans=Math.max(ans,Math.max(2*count(prev,next)+1,2*count(prev,cur)));
            prev=cur;
            cur=next;

        }
        return ans;
    }

    static int count(ListNode a,ListNode b){
        ListNode cur=a;
        ListNode next=b;
        int count=0;
      while(cur!=null && next!=null){
          if(cur.val==next.val){
              cur=cur.next;
              next=next.next;
              count++;
          }else break;
      }
        return count;
    }
    public static void main(String[] args) {
        ListNode n1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(3,new ListNode(2,new ListNode(4,null)))))));
        System.out.println(maxPalindrome(n1));

    }
}


