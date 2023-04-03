package easyQuestions.newQuestion;

public class DeleteNnodesafterMnodesofalinkedlist {
    public static void main(String[] args){
//9 1 3 5 9 4 10 1
        Node head23 =  new Node(1);
        Node head22 =  new Node(10,head23);
        Node head21 =  new Node(4,head22);
        Node head1 =  new Node(9,head21);
        Node head2 =  new Node(5,head1);
        Node head3 =  new Node(3,head2);
        Node head4 =  new Node(1,head3);
        Node head5 =  new Node(9,head4);
        linkdelete(head5,2,1);
    }
    static void linkdelete(Node head, int M, int N)
    {
        if(M==0|| N==0 || head==null) return;
        Node curr = head;
        int i=1;
        while(curr!=null){
            if( i<M){
                curr= curr.next;
                i++;
            }else{
                remove(curr,N);
                i=0;
            }


        }
        return;
    }
    static Node remove(Node curr,int n){
        int i=0;
        while(curr.next!=null && i<n){
            curr.next =curr.next.next;
            i++;
        }
        return curr;
    }
}
