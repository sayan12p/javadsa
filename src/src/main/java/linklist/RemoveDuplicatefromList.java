package linklist;

public class RemoveDuplicatefromList {

    public static ListNode deleteDuplicates(ListNode head) {
        //You can code here
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur1=dummy;
        ListNode cur=head;
        while(cur!=null && cur.next!=null && cur1!=null){
            if(cur.val==cur.next.val){
            while(cur.next!=null && cur.val==cur.next.val) {
                cur = cur.next;
            }
            cur1.next=cur;
            }else {
                cur1=cur1.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(-1,new ListNode(-1,new ListNode(2,new ListNode(2,new ListNode(3,new ListNode(3,new ListNode(3,null)))))));
        System.out.println(deleteDuplicates(head));
    }
}
