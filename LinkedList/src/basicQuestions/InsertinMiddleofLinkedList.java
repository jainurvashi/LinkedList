package basicQuestions;

public class InsertinMiddleofLinkedList {
    public ListNode insertInMid(ListNode head, int data){
        if(head==null){
            ListNode dataNode = new ListNode(data);
            dataNode.next = head;
            return dataNode;
        }
        ListNode ans = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode dataNode = new ListNode(data);
        dataNode.next = slow.next;
        slow.next = dataNode;
        return ans;
    }
}
