package basicQuestions;

public class Reversealinkedlist
{
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        reverseList(head5);
    }
    static  ListNode reverseList(ListNode head)
    {
        if (head==null || head.next ==null) return head;
        ListNode current = head;
        ListNode prev = null;
        ListNode next =null;
        while(current!=null){
            next = current.next;
            current.next =prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
