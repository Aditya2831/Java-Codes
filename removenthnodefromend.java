class removenthnodefromend {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void remove(Node head, int n) {
        if (head == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow.next != null) {
            slow.next = slow.next.next;
        }

        // return head here
    }
}