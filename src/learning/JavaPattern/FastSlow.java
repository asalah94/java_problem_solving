package learning.JavaPattern;

class Node {
    int value;
    Node next;
    Node(int value)
    { this.value = value; }
}

public class FastSlow {
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
        }

        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node mid = findMiddle(a);
        System.out.println(mid.value); // 30 (middle)
    }
}



