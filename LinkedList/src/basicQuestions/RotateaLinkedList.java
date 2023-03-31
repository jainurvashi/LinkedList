package basicQuestions;

public class RotateaLinkedList {
    public static void main(String[] args){
        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        rotate(head5,2);
    }
    static public ListNode rotate(ListNode head, int k) {
        ListNode current = head;


if(k==0 || head==null || head.next==null) return head;
while(current!=null && k>1){
    current= current.next;
    k--;
}
        if(k>1 || current.next==null) return head;
ListNode ans = current.next;
        ListNode res = ans;
    current.next = null;

while(ans.next!=null){
    ans= ans.next;
}
ans.next = head;
return res;
    }
}
