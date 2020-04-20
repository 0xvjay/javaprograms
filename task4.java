import java.util.*;
public class task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("no:");
        int n = in.nextInt();
        in.close();
        for(int i=n;i>=1;i--)
        {

            for(int j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}