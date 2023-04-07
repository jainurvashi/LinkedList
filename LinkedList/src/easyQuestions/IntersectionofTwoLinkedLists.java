package easyQuestions.newData;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {
    public static Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> first = new HashSet();
        Node ans = new Node(-1);
        Node res = ans;

        while(head2!=null){
            first.add(head2.val);
            head2=head2.next;
        }
        while(head1!=null){
            if(first.contains(head1.val)){
                ans.next = new Node(head1.val);

                ans=ans.next;
            }
            head1=head1.next;
        }

        return res.next;
    }
}
