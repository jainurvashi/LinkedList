package basicQuestions;

public class Nthnodefromendoflinkedlist {
    public static void main(String[] args){

        ListNode head1 =  new ListNode(1);
        ListNode head2 =  new ListNode(9,head1);
        ListNode head3 =  new ListNode(3,head2);
        ListNode head4 =  new ListNode(6,head3);
        ListNode head5 =  new ListNode(1,head4);
        getNthFromLast(head5,2);
        //   System.out.println(reverseBetween(head5,2,4).val);
    }
    static int getNthFromLast(ListNode head, int n)
    {
        ListNode current =head;
        ListNode res =head;
        int count =0;
        while(current!=null){
            count++;
            current = current.next;

        }
        if(n>count) return -1;
        count = count-n;
        for(int i=0;i<count;i++){
            res = res.next;
        }
        return res.val;
    }
}
