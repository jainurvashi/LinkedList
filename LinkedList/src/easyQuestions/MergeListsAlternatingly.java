package easyQuestions.newData;

public class MergeListsAlternatingly {
    public static void main(String[] args) {
        Node head23 = new Node(6);
        Node head22 = new Node(1, head23);
        Node head21 = new Node(2, head22);
        Node head1 = new Node(3, head21);
        Node head2 = new Node(4, head1);
        Node head3 = new Node(5, head2);
        Node head4 = new Node(10);
        Node head5 = new Node(9, head4);
        mergeAlt(head5, head3);
    }
    static public void mergeAlt(Node head1, Node head2){
        Node ans = head1;
        while(head1!=null && head2!=null){
            System.out.print(head1.val+" ");
            System.out.print(head2.val+" ");
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            System.out.print(head1.val+" ");
            head1=head1.next;
        }
        System.out.println();
        while(head2!=null){
            System.out.print(head2.val+" ");
            head2=head2.next;
        }
    }
}
