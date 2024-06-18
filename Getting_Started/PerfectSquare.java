package Java.Getting_Started;

public class PerfectSquare {
    public static void main(String[] args) {
        int num = 67;
        int n = (int)Math.sqrt(num);

        if ((n*n) == num )
        {
            System.out.println("Perfect square");
        }
        else{
            System.out.println("Not Perfect Square");
        }
    }
    
}
