import java.util.*;
public class task5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("no:");
        int n = in.nextInt();
        in.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=i; j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                if(i%2==1)
                    System.out.print("* ");
                else
                    System.out.print(j+" ");
            }  System.out.println("");
        }     
    }
}