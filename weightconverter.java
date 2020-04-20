import java.util.*;
public class weightconverter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("=====To convert from===== \n1-kilogram\n2-gram\n3-hectogram\n4-miligram\n5-microgram\n6-centigram\n7-decigram\n8-pound\n9-quintel\n10-ton\n11-lb/lbs\n12-grain\n=========================");
        int a=in.nextInt();
        System.out.println("\nEnter Value:");
        float m=in.nextInt();
        
       switch(a)
       {
            case 1: 
                System.out.println("The value in Kilogram is :"+m);
                break;
            case 2:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            case 3:
                m=m/1000;
                System.out.println("The value in Hectogram is :"+m);
                break;
            case 4:
                m=m/1000;
                System.out.println("The value in Miligram is :"+m);
                break;
            case 5:
                m=m/1000;
                System.out.println("The value in Microgram is :"+m);
                break;
            case 6:
                m=m/1000;
                System.out.println("The value in Centigram is :"+m);
                break;
            case 7:
                m=m/1000;
                System.out.println("The value in Decigram is :"+m);
                break;
            case 8:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            case 9:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            case 10:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            case 11:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            case 12:
                m=m/1000;
                System.out.println("The value in Gram is :"+m);
                break;
            default:
                System.out.println("Invalid Input");

       }

        System.out.println("=====To convert into===== \n1-kilogram\n2-gram\n3-hectogram\n4-miligram\n5-microgram\n6-centigram\n7-decigram\n8-pound\n9-quintel\n10-ton\n11-lb/lbs\n12-grain\n=========================");
        int n=in.nextInt();
        
        in.close();
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
                 m=m/1000;
                 System.out.println("The value in Hectogram is :"+m);
                 break;
             case 4:
                 m=m/1000;
                 System.out.println("The value in Miligramram is :"+m);
                 break;
             case 5:
                 m=m/1000;
                 System.out.println("The value in Microgram is :"+m);
                 break;
             case 6:
                 m=m/1000;
                 System.out.println("The value in Centigram is :"+m);
                 break;
             case 7:
                 m=m/1000;
                 System.out.println("The value in Decigram is :"+m);
                 break;
             case 8:
                 m=m/1000;
                 System.out.println("The value in Pound is :"+m);
                 break;
             case 9:
                 m=m/1000;
                 System.out.println("The value in Quintel is :"+m);
                 break;
             case 10:
                 m=m/1000;
                 System.out.println("The value in Ton is :"+m);
                 break;
             case 11:
                 m=m/1000;
                 System.out.println("The value in lb/lbs is :"+m);
                 break;
             case 12:
                 m=m/1000;
                 System.out.println("The value in Grain is :"+m);
                 break;
             default:
                 System.out.println("Invalid Input");
        }
    } 
}