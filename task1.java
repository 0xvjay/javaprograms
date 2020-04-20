import java.util.*;
public class task1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("no:");
        int n = in.nextInt();
        in.close();
        int x;
        for (int i=-n+1;i<n; i++){
            x = Math.abs(i)+1;
            for(int j=(2-x%2);j<= x;j+=2)
            {
                if(x%2==1)
                    System.out.print((char)(65+(j/2))+" ");
                else
                    System.out.print(" "+(char)(65+(26-(j/2))));
            }
            System.out.println("");
        }
    }
}