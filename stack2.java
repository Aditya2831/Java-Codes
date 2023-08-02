//Insert at bottom-primitive method

import java.util.*;

public class stack2 {
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);

        Stack <Integer> s2=new Stack<>();
        s2.push(9);

        while(s1.size()>0)
        {
            s2.push(s1.pop());
        }
        System.out.println(s2);

        Stack <Integer> s3=new Stack<>();
        

        while(s2.size()>0)
        {
            s3.push(s2.pop());
        }
        System.out.println(s3);
    }
}
