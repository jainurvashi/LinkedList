package easyQuestions;

public class Nthnodefromendoflinkedlist {
    int getNthFromLast(Node head, int n)
    {
        Node current =head;
        Node res =head;
        int count =0;
        while(current!=null){
            count++;
            current = current.next;

        }
        if(n>count) return -1;
        count = count-n;
        for(int i=0;i<count;i++){
            res = res.next;
        }
        return res.val;
    }
}
