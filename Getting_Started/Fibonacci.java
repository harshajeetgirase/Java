package Java.Getting_Started;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0 ,b = 1, c;
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        
        System.out.print(a+" "+b + " ");
        for ( int i = 2;i<range;i++ )
        {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+ " ");

        }

        sc.close();
    }
    
}
