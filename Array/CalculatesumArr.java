public class CalculatesumArr {

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};

        int n = arr.length;
        
        int sum = 0;

        for (int i = 0 ;i < n ;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Sum : "+ sum);
    }
    
}
