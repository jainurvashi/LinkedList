package basicQuestions;

public class DeleteaNodeinSingleLinkedList {
    public static void main(String[] args){

        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6);
        ListNode head5 =  new ListNode(1,head4);
        deleteNode(head5,2);
        //   System.out.println(reverseBetween(head5,2,4).val);
    }
    static  ListNode deleteNode(ListNode head, int x)
    {
        ListNode current = head;
        if(x==0|| head==null)return head;
        while(x>2 && head.next!=null){
            x--;
            head=head.next;

        }
        if(x==2){
                head.val = head.next.val;
                head.next = head.next.next;


        }


        return current;
    }
}
