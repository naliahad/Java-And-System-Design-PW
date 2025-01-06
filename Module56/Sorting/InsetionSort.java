package Module56.Sorting;

import java.util.Arrays;

public class InsetionSort 
{
    public static void insertionSort(int []arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            int j =i;
            while(j>0 && arr[j] < arr[j-1])
            {
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {20,50,30,90,5,15};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
