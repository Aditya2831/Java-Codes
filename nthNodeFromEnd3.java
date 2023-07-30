//removing nth Node from end 

public class nthNodeFromEnd3 {

    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }

    static int size(Node head)
    {
        int size=0;
        Node temp=head;

        while(temp!=null)
        {
            size+=1;
            temp=temp.next;
        }
        return size;
    }

    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    static void nthFromEnd(Node head, int index)
    {
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=index;i++)
        {
            fast=fast.next;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    }


    public static void main(String[] args) {
        Node a =new Node(1);
        Node b =new Node(2);
        Node c =new Node(3);
        Node d =new Node(4);
        Node e =new Node(5);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        display(a);
        nthFromEnd(a, 2);
        display(a);

    }
}
