package Module59;
import java.util.*;
public class BinarySearch 
{
    public static int bsc(int arr[], int low, int high, int target)
    {
        int result = -1;
        while (low<=high) 
        {
            int mid = low + (high-low)/2;
            //codition1 : 
            if(arr[mid] == target) return mid;

            //condition 2: mid < target
             if(arr[mid] < target) return bsc(arr, mid+1, high, target);

             //comdition 3 : mid > target
             else return bsc(arr, low, mid-1, target);
             
        }    
        
        return result;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,8,10};
        int low = 0;
        int high = arr.length-1;
        int target = 4;
        int result = bsc(arr, low, high, target);

        if(result == -1) System.out.println("No targes found");
        else System.out.println("Element found at: " + result);

    }
}
