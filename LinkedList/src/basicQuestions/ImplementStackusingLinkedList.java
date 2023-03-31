package basicQuestions;

public class ImplementStackusingLinkedList
{
    ListNode top = null;

    //Function to push an integer into the stack.
    void push(int a)
    {
        ListNode data = new ListNode(a);
        data.next = top;
        top = data;
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        if(top!=null){
            int a = top.val;
            top = top.next;
            return a;
        }else{
            return -1;
        }

    }
}
