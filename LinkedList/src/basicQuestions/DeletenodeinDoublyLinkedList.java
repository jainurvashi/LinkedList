package basicQuestions;

public class DeletenodeinDoublyLinkedList {
    public static void main(String[] args){

        ListNode head3 =  new ListNode(1);
        ListNode head4 =  new ListNode(3);
        ListNode head5 =  new ListNode(4);
        head3.prev = null;
        head3.next = head4;
        head4.prev = head3;
        head4.next = head5;
        head5.prev = head4;
        head5.next = null;
        deleteNode(head3,3);

    }
    static  ListNode deleteNode(ListNode head,int x)
    {
        ListNode current =head;
        if(x==1){
            head.next.prev = null;
            return head.next;
        }
        if(x==0 ||head==null)return head;
        while(head.next !=null && x>2){
            head= head.next;
            x--;
        }
        head.next = head.next.next;
        head.prev = head;
        return current;
    }
}
