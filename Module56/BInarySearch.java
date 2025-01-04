package Module56;

import java.lang.reflect.Array;
import java.util.Arrays;

class demo 
{
    public static int binary(int arr[], int target)
    {
        int low, mid, high, result;

        low = 0;
        high = arr.length;

        result = -1;

        while(low<=high)
        {
            mid =  low + (high-low)/2;

            if(arr[mid] == target)
            {
                return mid;
            }

            else if(arr[mid]>target)
            {
                high = mid-1;
            }

            else
            {
                low = mid+1;
            }

        }

        return 0;
    }

}
public class BInarySearch 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,3,5,6,8,9};
        Arrays.sort(arr);
        int target = 6;
        int result =demo.binary(arr, target);

        if(result!=0)
        {
            System.out.println("Element found at location: " + result);
        }

        else
        System.out.println("Element not found.");
    }
}
