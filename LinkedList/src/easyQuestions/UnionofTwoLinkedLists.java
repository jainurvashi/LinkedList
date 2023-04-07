package easyQuestions.newData;

import java.util.HashSet;

public class UnionofTwoLinkedLists {
    public static Node findUnion(Node head1,Node head2)
    {
        HashSet<Integer> hashset = new HashSet();
        while(head1!=null && head2!=null){
            hashset.add(head1.val);
            hashset.add(head2.val);
            head1= head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            hashset.add(head1.val);
            head1= head1.next;
        }
        while(head2!=null){
            hashset.add(head2.val);
            head2= head2.next;
        }
        Node data = new Node(-1);
        Node ans = data;
        for(int i : hashset){
            Node val = new Node(i);
            val.next=null;
            data.next =val;
            data=data.next;
        }
        return ans.next;
    }
}
