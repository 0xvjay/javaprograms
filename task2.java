import java.util.Scanner;

public class task2
{
    public static void main(String[] args)
    {
 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        scanner.close();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}