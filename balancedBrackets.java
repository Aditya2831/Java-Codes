import java.util.Scanner;
import java.util.Stack;

class balancedBrackets {

    public static boolean isBalanced(String str) {
        // boolean result=true;
        int length = str.length();
        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '(') {
                s1.push(str.charAt(i));
            }

            else {
                if (s1.size() == 0) {
                    return false;
                }
                if (s1.peek() == '(') {
                    s1.pop();

                }

            }
        }

        if (s1.size() > 0)
            return false; // means '(' is still present in the stack
        else
            return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of brackets");
        String str = sc.next();

        boolean result = isBalanced(str);
        System.out.println(result);
    }
}