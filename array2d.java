import java.util.Scanner;

public class array2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][3]; // dimensions specified
        for (int i = 0; i < 2; i++) // row loop
        {
            for (int j = 0; j < 3; j++) // column loop
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing array");
        for (int i[] : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
