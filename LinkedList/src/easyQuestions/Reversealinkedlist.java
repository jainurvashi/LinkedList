package easyQuestions.newQuestion;

public class Reversealinkedlist {
    Node reverseList(Node head)
    {
        if (head==null || head.next ==null) return head;
        Node current = head;
        Node prev = null;
        Node next =null;
        while(current!=null){
            next = current.next;
            current.next =prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
