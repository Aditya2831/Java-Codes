import java.util.Scanner;

public class code9 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter the number: ");
    String str1=sc.next();
    String str2="";

    for(int i=str1.length()-1;i>=0;i--)
    {
      str2+=str1.charAt(i);
    }

    if(str1.equals(str2))
    {
      System.out.println("Number is a pallindrome");
    }

    else
    {
      System.out.println("Number is not a pallindrome");
    }
   } 
}
