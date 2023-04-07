package easyQuestions.newData;

public class Removeverykthnode {
    public static void main(String[] args) {
        Node head23 = new Node(1);
        Node head22 = new Node(10, head23);
        Node head21 = new Node(4, head22);
        Node head1 = new Node(9, head21);
        Node head2 = new Node(5, head1);
        Node head3 = new Node(3, head2);
        Node head4 = new Node(1, head3);
        Node head5 = new Node(9, head4);
        delete(head5, 8);
    }

    static Node delete(Node head, int k) {
        Node curr = head;
        Node prev = null;
        int i = 1;
        if (k == 1) return null;
        if (k == 0) return curr;
        while (head != null) {
            if (i < k) {
                prev = head;
                head = head.next;
                i++;
            } else {
                if (prev == null) {
                    prev = head.next;
                } else {
                    prev.next = head.next;
                    i = 1;
                }

                head = head.next;
            }
        }
        return curr;
    }
}
