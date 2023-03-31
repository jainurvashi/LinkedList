package basicQuestions;

public class IdenticalLinkedLists {
    public boolean isIdentical (ListNode head1, ListNode head2){
        while(head1!=null && head2!=null){
            if(head1.val!=head2.val) return false;
            head1= head1.next;
            head2=head2.next;
        }
        if(head1!=null || head2!=null) return false;
        return true;
    }
}
