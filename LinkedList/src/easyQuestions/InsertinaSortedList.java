package easyQuestions.newQuestion;

public class InsertinaSortedList {
    Node sortedInsert(Node head1, int key) {
        Node dataNode = new Node(key);
        if(head1.val>key){
            dataNode.next = head1;
            return dataNode;
        }
        Node curr = head1;
        Node prev = null;
        while(curr!=null){
            if(curr.val>key){
                prev.next =dataNode;
                dataNode.next = curr;
                return head1;
            }
            prev = curr;
            curr= curr.next;
        }
        prev.next = dataNode;
        dataNode.next = null;
        return head1;
    }
}
