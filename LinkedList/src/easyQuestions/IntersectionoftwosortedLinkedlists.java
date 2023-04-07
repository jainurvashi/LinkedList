package easyQuestions.newData;

public class IntersectionoftwosortedLinkedlists {

    public static Node findIntersection(Node head1, Node head2)
    {
        Node ans = new Node(-1);
        Node res = ans;
        while(head1!=null && head2!=null){
            if(head1.val==head2.val){
                ans.next = head1;
                ans=ans.next;
                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.val<head2.val){
                head1=head1.next;
            }else{
                head2=head2.next;
            }
        }
        ans.next=null;
        return res.next;
    }
}
