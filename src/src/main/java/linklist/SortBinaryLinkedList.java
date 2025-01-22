package linklist;
public class SortBinaryLinkedList {

    public static  ListNode sortBinaryList(ListNode A) {
        //You can code here
        ListNode left = A;
        ListNode right = A;
        while (left != null) {
           if(left.val==0){
               int temp=left.val;
               left.val=right.val;
               right.val=temp;
              right=right.next;
           }
           left=left.next;

        }
      return A;
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1,new ListNode(0,new ListNode(0,new ListNode(1,new ListNode(1,null)))));
        System.out.println(sortBinaryList(a).toString());
    }
}
