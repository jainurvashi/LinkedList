package basicQuestions;

public class DetectLoopinlinkedlist {

    public static void main(String[] args){

        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        detectLoop(head5);
        //   System.out.println(reverseBetween(head5,2,4).val);
    }
      public static boolean detectLoop(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while( fast!=null && fast.next!=null){
            if(slow == fast)return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
