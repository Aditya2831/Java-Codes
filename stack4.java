//recursively printing
import java.util.*;

public class stack4 {

    //displaying in reverse order
    public static void display(Stack <Integer> st)
    {
        if(st.size()==0)
        {
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top); //so that stack remains unchanged
    }

    //displaying in normal order
    public static void display2(Stack <Integer> st)
    {
        if(st.size()==0)
        {
            return;
        }
        int top=st.pop();
        display2(st);
         System.out.print(top+" ");
         st.push(top);
         
    }
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);

        display(s1);  //reverse
        System.out.println();
        display2(s1); //straight
    }
}
