import java.util.Scanner;
public class enhancedfor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            System.out.println("Displaying using Prmitive method");
            for(int j=0;j<n;j++)
            {
                System.out.println(arr[j]);
            }

            System.out.println("Displaying using enhanced For Loop Method");
            for(int a:arr)
            {
                System.out.println(a);
            }
        }

        int arr1[]=new int[0];
        System.out.println(arr1.length);

    }
}
