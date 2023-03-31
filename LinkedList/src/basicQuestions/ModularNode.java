package basicQuestions;

public class ModularNode {
    public static int moduarNode(ListNode head, int k)
    {
        int ans = -1;
        if(k==0 || head==null) return ans;
        int i=1;
        while(head!=null){
            if(i%k==0) ans = head.val;
            head=head.next;
            i++;
        }
        return ans;
    }
}
