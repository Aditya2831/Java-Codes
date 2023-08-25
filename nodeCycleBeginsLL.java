public class nodeCycleBeginsLL {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static Node first(Node head){
        Node slow=head;
        Node fast=head;

        if(head==null ||head.next==null){
            return head;
        }
        
        while(fast!=null){
            if(slow==null) return head;
            slow=slow.next;
            if(fast.next==null) return head;
            fast=fast.next.next;
            if(fast==slow) break;
        }

        Node temp=head;
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }

        return slow;
    }
    public static void main(String[] args) {
        
    }
}
