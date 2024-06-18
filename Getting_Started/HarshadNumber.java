package Java.Getting_Started;

public class HarshadNumber {
    public static void main(String[] args) {
        int num = 4991;

        if (num % isHarshadNum(num) == 0)
        {
            System.out.println("Given Number is Harshad Number");
        }
        else
        {
            System.out.println("Given Number is not Harshad Number");
            
        }

        
    }

    static int isHarshadNum(int num)
    {
        int sum = 0 , rem;
        while (num != 0)
        {
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }

        return sum;
    }

    
}
