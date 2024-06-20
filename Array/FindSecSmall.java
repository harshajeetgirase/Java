public class FindSecSmall {


    static int isSecondSmall(int arr[], int n)
    {
        int firstSmall = arr[0];
        int secondSmall = Integer.MAX_VALUE;

        // first small 

        for (int i = 0;i<n;i++)
        {
            if (firstSmall < arr[i])
            {
                firstSmall = arr[i];
            }
        }

        for (int j = 0;j<n;j++)
        {
            if (firstSmall != arr[j] &&  arr[j] < secondSmall)
            {
                secondSmall =arr[j];
            }

        }

        return secondSmall;

    }


    public static void main(String[] args) {
        int arr[] = {12, 13, 11, 10, 34, 10};
        int n = arr.length;
        
        System.err.println(isSecondSmall(arr, n));
    }
    
}
