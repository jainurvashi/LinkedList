package easyQuestions.newQuestion;

public class Mergetwosortedlinkedlists {
    public static void main(String[] args){

        Node head2 =  new Node(4);
        Node head3 =  new Node(2,head2);
        Node head4 =  new Node(1);
        Node head5 =  new Node(1,head4);
        sortedMerge(head5,head3);
    }
    static Node sortedMerge(Node head1, Node head2) {
        Node list1 = head1;
        Node list2 = head2;
        Node res = new Node(-1);
        Node ans = res;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                res.next = list1;
                list1= list1.next;
            }else{
                res.next = list2;
                list2= list2.next;
            }
            res = res.next;
        }
        while(list1!=null){
            res.next = list1;
            list1= list1.next;
            res = res.next;
        }
        while(list2!=null){
            res.next = list2;
            list2= list2.next;
            res = res.next;
        }
        return ans.next;
    }
}
