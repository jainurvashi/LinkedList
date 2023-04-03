package easyQuestions.newQuestion;

public class SplitSinglyLinkedListAlternatingly {

    public static void main(String[] args){
      Node head1 =  new Node(41);
        Node head2 =  new Node(78,head1);
        Node head3 =  new Node(45,head2);
        Node head4 =  new Node(36,head3);
        Node head5 =  new Node(25,head4);
        alternatingSplitList(head5);
    }
    static public void alternatingSplitList(Node head){
        Node first = new Node(-1);
        Node firstAns = first;
        Node second = new Node(-1);
        Node secondAns = second;
        Node curr = head;
        int i=0;
        while(curr!=null){
            if(i%2==0)
            {
                first.next = curr;
                first = first.next;
            }else{
                second.next = curr;
                second = second.next;
            }
            curr=curr.next;
            i++;
        }
        first.next = null;
        second.next = null;
        firstAns = firstAns.next;
        secondAns = secondAns.next;
       while(firstAns!=null){
           System.out.println(firstAns.val);
           firstAns =firstAns.next;
       }
        while(secondAns!=null){
            System.out.println(secondAns.val);
            secondAns =secondAns.next;
        }


    }
}
