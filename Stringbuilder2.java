import java.util.*;

public class Stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Aditya");

//built in fns
        str.insert(0, 'b'); //different from setCharAt();
        System.out.println(str);

        str.deleteCharAt(3);

        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(0, 3);
        System.out.println(str);
    }
}
