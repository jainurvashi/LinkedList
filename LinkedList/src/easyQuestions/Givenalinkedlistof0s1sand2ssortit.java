package easyQuestions.newData;

public class Givenalinkedlistof0s1sand2ssortit {
    //1 2 2 1 2 0 2 2
    public static void main(String[] args) {
        Node head23 = new Node(2);
        Node head22 = new Node(2, head23);
        Node head21 = new Node(0, head22);
        Node head1 = new Node(1);
        Node head2 = new Node(2, head1);
        Node head3 = new Node(1, head2);
        Node head4 = new Node(2,head3);
        Node head5 = new Node(2, head4);
        segregate(head5);
    }
    static Node segregate(Node head)
    {
        Node start = head;
        Node curr = head;
        int i=0;
        while(curr.next!=null){
            curr=curr.next;
            i++;
        }
        Node prev = null;
        Node end = curr;

        while(i>0){

            while(head.val == 0 && i>0){
                Node next = head.next;
                if(prev!=null) {
                    prev.next = head.next;
                }
                head.next = start;
                start = head;
                head = next;
                i--;
            }
            while(head.val==2 && i>0){
                Node next = head.next;
                if(prev!=null) {
                    prev.next = head.next;
                }else{
                    start = head;
                }

                end.next = head;
                end = end.next;
                head.next =null;
                head = next;
                i--;

            }
            while (head.val==1 && i>0) {
                prev = head;
                head = head.next;
                i--;
            }
        }
        return start;
    }
}
