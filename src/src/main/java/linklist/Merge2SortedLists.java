package linklist;

public class Merge2SortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!=null) return list2;
        if(list2==null && list1!=null) return list1;
        ListNode dummy=new ListNode(0);
        dummy.next=list1;
        ListNode cur1=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
              cur1.next=list1;
                list1=list1.next;
                cur1=cur1.next;
            }
            else{
              cur1.next=list2;
              list2=list2.next;
              cur1=cur1.next;
            }
            cur1.next=(list1==null)? list2:list1;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4,null)));
        ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4,null)));
        System.out.println(mergeTwoLists(l1,l2).toString());
    }
}
