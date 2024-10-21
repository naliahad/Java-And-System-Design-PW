package Module53.OneDArray;

public class MIssingNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,11};
        int n = arr.length;
        int natural_sum = ((n+1)* (n+2)) /2;
        int sum = 0;
        for(int i =0; i<n;i++)
        {
            sum += arr[i]; 
        }

        System.out.println("Missing number: " +( natural_sum - sum));
    }
}
