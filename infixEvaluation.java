import java.util.*;

public class infixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the infix Expression");
        String str = sc.next();

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <= 57)
                val.push(ascii - 48);

            else if (op.size() == 0)
                op.push(ch);

                //operation
            else {
                if (ch == '+' || ch == '-') {
                    int val2 = val.pop();
                    int val1 = val.pop();

                    if (op.peek() == '-')
                        val.push(val1 - val2);

                    if (op.peek() == '+')
                        val.push(val1 + val2);

                    if (op.peek() == '*')
                        val.push(val1 * val2);

                    if (op.peek() == '/')
                        val.push(val1 / val2);

                    op.pop();
                    op.push(ch);
                }

                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (op.peek() == '*')
                            val.push(val1 * val2);
                        if (op.peek() == '/')
                            val.push(val1 / val2);

                            op.pop();
                            op.push(ch);
            
                    }

                    else op.push(ch);
                }
            }
        }

        while(val.size()>1){
            int val2=val.pop();
            int val1=val.pop();

             if (op.peek() == '-')
                        val.push(val1 - val2);

                    if (op.peek() == '+')
                        val.push(val1 + val2);

                    if (op.peek() == '*')
                        val.push(val1 * val2);

                    if (op.peek() == '/')
                        val.push(val1 / val2);

            op.pop();

        }

        System.out.println(val.peek());
    }
}


// iterate string through whole length,
// In case encountering a digit push that into value stack,
// In case u encounter operator , then:

// *,/>+,-
