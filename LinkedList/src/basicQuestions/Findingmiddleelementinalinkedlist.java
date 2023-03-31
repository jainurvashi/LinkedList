package basicQuestions;

public class Findingmiddleelementinalinkedlist
{
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        getMiddle(head5);
    }
    static int getMiddle(ListNode head)
    {
        if(head.next == null) return head.val;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
