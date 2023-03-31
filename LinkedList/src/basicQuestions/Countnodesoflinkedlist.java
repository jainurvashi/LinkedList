package basicQuestions;

public class Countnodesoflinkedlist {
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        getCount(head5);
    }
    public static int getCount(ListNode head)
    {
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
}
