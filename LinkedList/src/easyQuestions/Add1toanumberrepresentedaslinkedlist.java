package easyQuestions.newData;

public class Add1toanumberrepresentedaslinkedlist {
    public static Node addOne(Node head)
    {
        head = reverseNode(head);
        Node ans = head;
        Node prev =null;
        int carry =1;
        while(head!=null){
            int data = head.val;
            data = data+carry;
            head.val = data%10;
            carry=data/10;
            prev = head;
            head=head.next;
        }
        while(carry>0){
            Node data = new Node(carry);
            data.next = null;
            prev.next = data;
            prev= prev.next;
            carry=carry/10;
        }
        return reverseNode(ans);
    }
    static  Node reverseNode(Node node){
        Node prev = null;
        while(node!=null){
           Node next = node.next;
            node.next=prev;
            prev= node;
            node = next;
        }
        return prev;
    }
}
