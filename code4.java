import java.util.Scanner;

public class code4 {

    public static void swap(int a,int b)
    {
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int x=sc.nextInt();

        System.out.println("Enter number 2: ");
        int y=sc.nextInt();

        swap(x,y);
    }
}
