package easyQuestions.newData;

public class Merge2sortedlinkedlistinreverseorder {
    Node mergeResult(Node node1, Node node2)
    {
        node1 = reverseNode(node1);
        node2=reverseNode(node2);
        Node ans =new Node(-1);
        Node res = ans;
        while(node1!=null && node2!=null){
            if(node1.val>=node2.val){
                ans.next = node1;
                ans = ans.next;
                node1=node1.next;
            }else{
                ans.next = node2;
                ans = ans.next;
                node2=node2.next;
            }
        }
        while(node1!=null){
            ans.next = node1;
            ans = ans.next;
            node1=node1.next;
        }
        while(node2!=null){
            ans.next = node2;
            ans = ans.next;
            node2=node2.next;
        }
        return res.next;

    }
    Node reverseNode(Node head){
        Node prev = null;
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
