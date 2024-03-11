package com.java.linkedlist;
import java.linkedlist.ListNode;
public class PartitionList {

    public static ListNode partition(ListNode A, int B) {
        //You can code here
        ListNode smallhead=new ListNode(0);
        ListNode smalltail=smallhead;
        ListNode largehead=new ListNode(0);
        ListNode largetail=largehead;
        ListNode cur=A;
        while(cur!=null){
            if(cur.val<B){
                smalltail.next=cur;
                smalltail=cur;
        }else{
                largetail.next=cur;
                largetail=cur;
            }
        cur=cur.next;
    }
        smalltail.next=largehead.next;
        largetail.next=null;
        return smallhead.next ;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5, new ListNode(2,null))))));
        System.out.println(partition(a,3));
    }
}
