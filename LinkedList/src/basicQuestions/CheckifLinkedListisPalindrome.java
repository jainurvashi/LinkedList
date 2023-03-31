package basicQuestions;

public class CheckifLinkedListisPalindrome {

    public static void main(String[] args){

        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(1,head1);
        ListNode head3 =  new ListNode(1,head2);
        ListNode head4 =  new ListNode(1);
        ListNode head5 =  new ListNode(1,head4);
        isPalindrome(head5);
        //   System.out.println(reverseBetween(head5,2,4).val);
    }
    static  boolean isPalindrome(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode current = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        fast = reverseNode( slow.next);
        slow.next =null;
        while(current!=null && fast!=null){
            if(current.val!=fast.val) return false;
        current=current.next;
        fast=fast.next;
        }
        if(current!=null ||current.next==null)
        return true;
        else return false;
    }
    static  ListNode reverseNode(ListNode head){
        ListNode prev = null;
        ListNode next =null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head= next;
        }
        return prev;
    }
}
