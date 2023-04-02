package easyQuestions.newQuestion;

import basicQuestions.ListNode;

import java.util.HashSet;

public class Removeduplicatesfromanunsortedlinkedlist {
    public static void main(String[] args){
        Node head1 =  new Node(2);
        Node head2 =  new Node(4,head1);
        Node head3 =  new Node(2,head2);
        Node head4 =  new Node(2,head3);
        Node head5 =  new Node(5,head4);
        removeDuplicates(head5);
    }
    static  public Node removeDuplicates(Node head)
    {
        HashSet<Integer> hashSet = new HashSet();
        Node current = head;
        Node prev = null;
        while(current!=null){
            if(!hashSet.add(current.val))
            {
                prev.next = current.next;
                current=current.next;
            }else{
                prev = current;
                current=current.next;
            }
        }
        return head;
    }
}
