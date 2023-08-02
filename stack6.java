//Array Implementation of Stack (Array to Stack)

public class stack6 {

    // in this stack class we will be defining all stack methods
    public static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int x) {
            arr[idx] = x;
            idx += 1;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Array is empty");
                return -1;
            }

            int x = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return x;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        int size() {
            return idx;
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
        
        int c = s1.size();
        System.out.println(c);

    }
}
