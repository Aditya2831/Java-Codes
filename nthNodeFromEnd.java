//based on 1 based indexing

public class nthNodeFromEnd{
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
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

    static void getNode(Node head,int index)
    {
        int length=size(head);
        Node temp=head;
        int start=length-index+1;
        for(int i=1;i<start;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);
        return;
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
        getNode(a, 2);
    }
}