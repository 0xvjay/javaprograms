import java.util.*;
public class weightconverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch;
        double m=0;
        do
        {
            System.out.println("=====To convert from===== \n1-kilogram\n2-gram\n3-hectogram\n4-miligram\n5-microgram\n6-centigram\n7-decigram\n8-pound\n9-quintel\n10-ton\n11-lb/lbs\n12-grain\n=========================");
            int a=in.nextInt();
            switch(a)
            {
                 case 1: 
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    break;
                 case 2:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/1000;
                    break;
                 case 3:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/10;
                    break;
                 case 4:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/1000000;
                    break;
                 case 5:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/1000000000;
                    break;
                 case 6:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/100000;
                    break;
                 case 7:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/10000;
                    break;
                 case 8:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/2.2046226218;
                    break;
                 case 9:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/0.01;
                    break;
                 case 10:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/0.001;
                    break;
                 case 11:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/2.2046226218;
                    break;
                 case 12:
                    System.out.println("\nEnter Value:");
                    m=in.nextInt();
                    m=m/ 15432.358353;
                    break;

                 default:
                    System.out.println("Invalid Input");
                    break;
            }
            if(a>0&&a<=12){
            System.out.println("=====To convert into===== \n1-kilogram\n2-gram\n3-hectogram\n4-miligram\n5-microgram\n6-centigram\n7-decigram\n8-pound\n9-quintel\n10-ton\n11-lb/lbs\n12-grain\n=========================");
            int n=in.nextInt();

            switch(n)
        {
             case 1: 
                 System.out.println("The value in Kilogram is :"+m);
                 break;
             case 2:
                 m=m/1000;
                 System.out.println("The value in Gram is :"+m);
                 break;
             case 3:
                 m=m/10;
                 System.out.println("The value in Hectogram is :"+m);
                 break;
             case 4:
                 m=m/1000000;
                 System.out.println("The value in Miligramram is :"+m);
                 break;
             case 5:
                 m=m/1000000000;
                 System.out.println("The value in Microgram is :"+m);
                 break;
             case 6:
                 m=m/100000;
                 System.out.println("The value in Centigram is :"+m);
                 break;
             case 7:
                 m=m/10000;
                 System.out.println("The value in Decigram is :"+m);
                 break;
             case 8:
                 m=m/2.2046226218;
                 System.out.println("The value in Pound is :"+m);
                 break;
             case 9:
                 m=m/0.01;
                 System.out.println("The value in Quintel is :"+m);
                 break;
             case 10:
                 m=m/0.001;
                 System.out.println("The value in Ton is :"+m);
                 break;
             case 11:
                 m=m/2.2046226218;
                 System.out.println("The value in lb/lbs is :"+m);
                 break;
             case 12:
                 m=m/ 15432.358353;
                 System.out.println("The value in Grain is :"+m);
                 break;
             default:
                 System.out.println("Invalid Input");
                 break;
        }
        }
        else 
            break;
        System.out.println("Enter y or Y for more conversion.");
        ch=in.next().charAt(0);    
        }while(ch=='y' || ch=='Y');
       }       
} 
