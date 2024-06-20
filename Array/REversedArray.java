public class REversedArray {

    public static void main(String[] args) {
        int arr[] = {12, 13, 1, 10, 34, 10};
        int n = arr.length;

        // for (int i = n-1 ; i>=0;i--)
        // {
        //     System.out.print(arr[i] + " ");
        // }

        reversed(arr, n);
    }

    static void reversed(int arr[],int n)
    {
        if (n > 0)
        {
            System.out.print(arr[n-1] + " ");
            reversed(arr, n-1);
        }

        // reversed(n-1);
    }
    
}
