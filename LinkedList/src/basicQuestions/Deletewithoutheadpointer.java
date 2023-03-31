package basicQuestions;

public class Deletewithoutheadpointer {
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        deleteNode(head5);
    }
    static void deleteNode(ListNode del)
    {
        del.val = del.next.val;
        del.next = del.next.next;
    }
}
