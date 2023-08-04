import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int ascii[]=new int[256];

        int count=Integer.MIN_VALUE;
        int index=-1;

        for(int i=0;i<str.length();i++)
        {
            ascii[str.charAt(i)]+=1;
        }

        for(int i=0;i<256;i++)
        {
            if(ascii[i]>count)
            {
                count=ascii[i];
                index=i;
            }
        }

        char asciiToChar=(char) index;

        System.out.println("Most repeated element is: "+asciiToChar+" "+count+" times");
    }
}
