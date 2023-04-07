package easyQuestions.newData;

public class FindlengthofLoop {
    static int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast==null || fast.next==null || fast.next.next==null)return 0;
        int i=1;
        Node circle = slow;
        slow=slow.next;
        while(circle!=slow){
            i++;
            slow= slow.next;
        }
        return i;
    }
}
