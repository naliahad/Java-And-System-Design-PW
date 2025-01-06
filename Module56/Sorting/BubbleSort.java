package Module56.Sorting;

import java.util.Arrays;
class demo
{
    public static void bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            boolean swap = false;
            for(int j =0; j<arr.length-i-1; j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
                
            }
            if(swap == false)
            break;
        }
    }
}
public class BubbleSort 
{
    public static void main(String[] args)
    {
        /*
            Sorting -> ascending or descending order.
            A.  1. inplace sorting -> not taking any extra space to execute the sorting algo.
                2. outplace sorting -> taking extra apart from given array to execute the sorting algo.

            B.  1. Stable sort -> If in sorted array the position of two similar elements is retaned. Relative order [1,2',2",3,4]
                2. Un-stable sort -> If in sorted array the position of two similar elements is not-retaned. Relative order not retained [1,2",2',3,4]

            ->Each element will be compared with element next to it. If required swap will happen and will continue cycle until array is sorted. in each cycle lasgest number will be shifted to extreme right.           
        */

        int arr[] = {70,20,50,30,90,5,15};
        demo.bubbleSort(arr);
        System.out.println("Sorted Array: ");
        System.out.println(Arrays.toString(arr));
    }
}
