package Java.Getting_Started;
import java.util.Scanner;

public class RevNum {

    static void recursion(int a)
    {
        if (a == 0)
        {
            return;
        }

        int rem = a% 10;
        System.out.print(rem);
        recursion(a/=10);
    }                                      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        
        int num = a;
        int rev = 0;

        boolean n = a<0 ? true:false;
        if (n)
        {
            System.out.print("-");
            a = a * -1;
        }
        recursion(a);

        while (num != 0)
        {
            int rem = num % 10 ;
            rev = rev * 10 + rem;
            num/=10;

        }
        System.out.println();
        System.out.println("Reverse number : "+rev);
        
        sc.close();
    }
    
}
