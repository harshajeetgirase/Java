package Java.Getting_Started;

import java.util.Scanner;

public class PowerNumber {

    public static void main(String[] args) {
        
        int num,pow=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        num = sc.nextInt();
        int b = sc.nextInt();
        pow = num;

        for (int i = 1 ;i< b;i++)
        {
            pow *= num;
        }

        System.out.println(pow);
        
        sc.close();

    }
    
}
