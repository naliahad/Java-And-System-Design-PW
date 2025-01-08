package Module56.Sorting;

import java.util.*;

public class SelectionSort 
{
    public static void selectionSort(int[] arr) {
        // TODO Auto-generated method stub
        for(int i=0; i<arr.length; i++)
        {
        int min_idx = i; // value of i  mimnimum value in every iteration
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]< arr[min_idx])
                {
                    min_idx = j;
                }

                if(min_idx != i)
                {
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        
    }
    public static void main(String[] args) 
    {
        /*
            1. At every iteration, smallest will be at the left.
            2. At every itereation only one swap is required.      
        */
        int arr[] = {20,13,23,1,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
       
}
