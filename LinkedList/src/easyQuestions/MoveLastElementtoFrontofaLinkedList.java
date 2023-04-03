package easyQuestions.newQuestion;

public class MoveLastElementtoFrontofaLinkedList {
    public static Node moveToFront(Node head) {
        if(head==null || head.next == null) return head;
        Node curr = head;
        while(curr.next.next!=null){
            curr= curr.next;
        }
        Node val = new Node(curr.next.val);
        curr.next = null;
        val.next = head;
        return val;
    }
}
