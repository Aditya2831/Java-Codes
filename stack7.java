//LL implementation of Stack

public class stack7 {
    public static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
        }
    }

    public static class Stack{
        Node head=null;
        int size=0;

        void push(int x)
        {
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size+=1;
        }

        void display(){
            Node a=head;
            while(a.next!=null)
            {
                System.out.print(a.data+" ");
                a=a.next;
            }
        }

        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }

            return head.data;
        }

        int pop(){
            if(head==null)
            {
                System.out.println("Stack is empty");
                return -1;
            }
int x=head.data;
            head=head.next;
            return x;
        }


    }
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        s1.display();
        System.out.println();

        int a = s1.peek();
        System.out.println(a);

       
        int b = s1.pop();
        System.out.println(b);

        s1.display();
        System.out.println();
        
       
    }
}
