package Java.Getting_Started;
// import java.util.*;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        int a = 407,n,sum=0,rem,temp;
        n=order(a);

        temp = a;
        while(temp != 0)
        {
            rem = temp % 10;
            int cube=(int)Math.pow(rem, 3);
            sum = sum + cube;
            temp/=10;
        }

        
        if (a == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
        
    }
    
    static int order (int a)
    {
        int len = 0;
        int temp = a;
        if (temp!=0)
        {
            len++;
            temp/=10;
        }

        return len;
    }
}
