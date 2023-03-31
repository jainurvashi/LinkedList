package basicQuestions;

public class DeleteAlternateNodes {
    public static void main(String[] args){

        ListNode head0 =  new ListNode(6);
        ListNode head1 =  new ListNode(5,head0);
        ListNode head2 =  new ListNode(4,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(2,head3);
        ListNode head5 =  new ListNode(1,head4);
        deleteAlternate(head5);

    }
    static  public void deleteAlternate (ListNode head){
        ListNode current = head;
        while(current.next!=null &&current.next.next!=null){
            current.next = current.next.next;
            current=current.next;
        }
        if(current.next!=null)
            current.next=null;
    }
}
