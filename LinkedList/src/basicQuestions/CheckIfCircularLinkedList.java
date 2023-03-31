package basicQuestions;

public class CheckIfCircularLinkedList {
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        isCircular(head5);
    }
    static boolean isCircular(ListNode head)
    {
        if(head==null || head.next==null)return false;
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null && fast.next !=null ){
           slow= slow.next;
           fast=fast.next.next;
           if(slow==fast)
               return true;
       }
        return false;

    }
}
