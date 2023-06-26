import java.util.HashMap;
import java.util.Scanner;

public class question2 {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charFreq.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test cases
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next();
        System.out.println(firstUniqChar(str));
       
    }
}
