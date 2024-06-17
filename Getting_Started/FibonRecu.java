package Java.Getting_Started;

import java.util.Scanner;

public class FibonRecu {

    public static void main(String[] args) {

        int a = 0  ,b = 1;
        
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(a + " " + b + " ");
        Fibo(num-2,a, b);
        
        sc.close();
    }
    
    static void Fibo(int num,int a ,int b)
    {
        if (num>0)
        { 
            int c;
            c =  a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            Fibo(num - 1,a,b);

        }
    }
}
