package Java.Getting_Started;

import java.util.Scanner;

public class Strong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int rem,sum=0,temp,factNum;
        
        temp = num;
        while (temp != 0)
        {
            rem = temp % 10 ;
            factNum = fact(rem);
            sum = sum + factNum;
            temp/=10;
            
        }

        if (sum == num)
        {
            System.out.println("Strong Number");
        }

        else
        {
            System.out.println("Not Strong Number ");
        }

        sc.close();

    

    }
    
    static int fact(int num)
    {
        int fact = 1;
        for ( int i = 1;i<=num;i++)
        {
            fact = fact * i ;
        }

        return fact;

    }
}
