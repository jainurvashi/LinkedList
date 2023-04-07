package easyQuestions.newData;

public class Rearrangelinkedlistinplace {
    public static void main(String[] args) {
        Node head23 = new Node(6);
        Node head22 = new Node(1, head23);
        Node head21 = new Node(2, head22);
        Node head1 = new Node(3, head21);
        Node head2 = new Node(4, head1);
        Node head3 = new Node(5, head2);
        Node head4 = new Node(10,head3);
        Node head5 = new Node(9, head4);
        rearrange(head5);
    }
     static Node rearrange(Node root)
    {
        Node curr = root;
        Node slow =curr;
        Node fast =curr;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast =fast.next.next;
        }
        Node mid = reverse(slow.next);
        slow.next=null;
        while(curr!=null &&  mid!=null){
            Node next = curr.next;
            curr.next = mid;
            mid=mid.next;
            curr.next.next = next;

            curr= curr.next.next;
        }
        return root;
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
