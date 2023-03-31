package easyQuestions;

public class Node {
    int val;
    Node next;
    Node prev;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
    Node(int val, Node next, Node prev) { this.val = val; this.next = next; this.prev=prev;}
}
