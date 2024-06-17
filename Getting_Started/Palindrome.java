package Java.Getting_Started;

public class Palindrome {

    public static void main(String[] args) {
        int a = 121;
        int rev =0 ,rem,temp;
         
        temp = a;
        while(temp != 0)
        {  
            rem = temp % 10;
            rev = rev * 10 + rem ;
            temp/=10;

        }

        if (rev == a)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not palindrome Number");
        }
        

    }
    
}
