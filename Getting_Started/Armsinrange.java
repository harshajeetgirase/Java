package Java.Getting_Started;

import java.util.Scanner;

public class Armsinrange {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
    

       int  low  = sc.nextInt();
       int high = sc.nextInt();

       for(int i = low ; i <= high ; i++)
       {

        // int len = order(i);
        Armstrong(i);    
       
       }
       

        sc.close();

    }

    static void Armstrong(int a)
    {
        int temp , len , sum = 0, rem ;
        len =order(a);
        temp = a;

        while (temp != 0)
        {
            rem = temp % 10;
            sum = sum + (int)Math.pow(rem, len);
            temp /= 10;
        }
        
        if (sum == a)
        {
            System.out.println(sum + " ");
        }
    }

        public static int order(int a)
        {
            int len = 0 ;
            while (a != 0)
            {
                len++;
                a/=10;
            }
          
            return len;
        }
    }
    

