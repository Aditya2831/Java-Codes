//removing consecutive subdigits

import java.util.*;

public class removeConsecutive {

    public static int[] remove(int arr[]) {
        Stack<Integer> s = new Stack<>();
        // int res[];

        for (int i = 0; i < arr.length ; i++) {
            if (s.size() == 0 || s.peek()!=arr[i]) {
                s.push(arr[i]);
            }

             else {   //enter only when continuation found 
                if (s.peek() == arr[i]) {
                    if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
                        s.pop();
                    }
                }
            }
        }

        int res[] = new int[s.size()];
        for (int j = res.length-1; j>=0; j--) {
            res[j] = s.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2 };
        int f[] = remove(arr);

        for (int i : f) {
            System.out.print(i + " ");
        }
    }
}
