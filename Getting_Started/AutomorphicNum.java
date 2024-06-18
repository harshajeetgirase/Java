package Java.Getting_Started;

public class AutomorphicNum {
    public static void main(String[] args) {

        int num = 376;
        int square = num * num ;

        // System.out.println(square);


        // System.out.println(isAutomorphic(square, num));

        if (isAutomorphic(square, num) == 1)
        {
            System.out.println("Given number is Automorphic Number");
        }
        else
        {
            System.out.println("Given Number is not Automorphic Number");
        }
        // int temp = square;

        
    }

    static int isAutomorphic(int square,int num)
    {
        while (num != 0)
        {
            if (num % 10 != square % 10)
            {
                return 0;
            }

            num /= 10;
            square /=10;
        }

        return 1;
    }
    
    
}
