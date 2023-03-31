package easyQuestions;

public class Findingmiddleelementinalinkedlist {
    int getMiddle(Node head)
    {
        if(head.next == null) return head.val;
        Node slow = head;
        Node fast = head;
        while(fast!=null &&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}
