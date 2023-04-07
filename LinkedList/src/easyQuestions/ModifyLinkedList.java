package easyQuestions.newData;

public class ModifyLinkedList {
    public static void main(String[] args) {
        Node head23 = new Node(2);
        Node head22 = new Node(2, head23);
        Node head21 = new Node(0, head22);
        Node head1 = new Node(6);
        Node head2 = new Node(3, head1);
        Node head3 = new Node(5, head2);
        Node head4 = new Node(2,head3);
        Node head5 = new Node(10, head4);
        modify(head5);
    }
    static   public Node modify(Node head){
        Node slow = head;
        Node fast = head;
        Node curr = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node data = slow;
        slow =reverse(slow.next);

        while(curr.next!=null && slow!=null){
            curr.val = slow.val-curr.val;
            curr = curr.next;
            slow=slow.next;
        }
        curr.next = data;
        return head;
    }
    static  Node reverse(Node data){
        Node prev =null;
        while(data!=null){
            Node next = data.next;
            data.next = prev;
            prev = data;
            data=next;
        }
        return prev;
    }
}
