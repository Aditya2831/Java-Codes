import java.util.Scanner;

public class random{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int length=sc.nextInt();
            int arr[]=new int[length];

            System.out.println("Enter array elements");

            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

            int left=0;
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }

            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+" ");
            }
   }
        }
    }
}