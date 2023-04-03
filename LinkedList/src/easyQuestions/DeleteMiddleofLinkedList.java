package easyQuestions.newQuestion;

public class DeleteMiddleofLinkedList {
    Node deleteMid(Node head) {
        if(head==null) return head;
        if(head.next==null) return null;
        if(head.next.next == null) {
            head.next = null;
            return head;
        }
        Node ans = head;
        Node slow = head;
        Node fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return ans;
    }
}
