package linklist;




public class IntersectionofLinkedLists {

    public static int findIntersection(ListNode firstHead, ListNode secondHead) {
        //You can code here
        ListNode first=firstHead;
        ListNode second=secondHead;
        while(first!=null) {
            while (second != null) {
                if (first.val == second.val) {
                    return first.val;
                }
                second = second.next;
            }
            second=secondHead;
            first=first.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        ListNode n1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
        ListNode n2= new ListNode(9,new ListNode(8,new ListNode(7,new ListNode(3,new ListNode(4,new ListNode(5,null))))));
        System.out.println(findIntersection(n1,n2));
    }
}
