package basicQuestions;

public class FindtheSumofLastNnodesoftheLinkedList {
    public static void main(String[] args){
        ListNode head04 =  new ListNode(14);
        ListNode head03 =  new ListNode(13,head04);
        ListNode head02 =  new ListNode(12,head03);
        ListNode head01 =  new ListNode(11,head02);
        ListNode head0 =  new ListNode(10,head01);
        ListNode head1 =  new ListNode(89,head0);
        ListNode head2 =  new ListNode(67,head1);
        ListNode head3 =  new ListNode(45,head2);
        ListNode head4 =  new ListNode(23,head3);
        ListNode head5 =  new ListNode(1,head4);
        sum(head5,3);
    }
    static  public int sum(ListNode head, int k){
        if(k==0 || head==null ) return 0;
        ListNode rev = reverseNode(head);
        int sum =0;
        while(k>0 && rev!=null){
            sum+= rev.val;
            rev=rev.next;
            k--;
        }
        return sum;
    }
    static  ListNode reverseNode(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
