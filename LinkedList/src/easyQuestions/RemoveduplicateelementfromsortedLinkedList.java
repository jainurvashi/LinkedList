package easyQuestions.newQuestion;

public class RemoveduplicateelementfromsortedLinkedList {
    Node removeDuplicates(Node head)
    {
       if(head == null || head.next==null) return head;
       Node current = head;
       while(current.next!=null){
           if(current.val == current.next.val){
               current.next = current.next.next;
           }else{
               current=current.next;
           }
       }
       return head;
    }
}
