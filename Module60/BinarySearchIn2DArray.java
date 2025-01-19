package Module60;
import java.util.*;
public class BinarySearchIn2DArray 
{
    public static boolean binarSearch (int arr[][], int target)
    {
        //number of rows
        int num_rows = arr.length; 
        //number of columns
        int num_columns = arr[0].length;

        //base Case 
        if(num_rows==0) return false;

        //binary search
        int low =0, high  = num_rows * num_columns -1, midIdx, midElement, rowIdx, colIdx;

        while(low<high)
        {
            midIdx = low + (high - low) /2;
            rowIdx  = midIdx/num_columns;
            colIdx =  midIdx%num_columns;
            midElement =  arr[rowIdx][colIdx];

            //Condition 1:

            if(midElement == target) return true;

            else  
            {
                if(target< midElement)
                {
                    high = midIdx-1;
                }

                else 
                {
                    low = midIdx +1;
                }

            }
        }

        return false;
        
    }
    public static void main(String[] args) 
    {
        int arr [][] =  {
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of target.");
        int target = sc.nextInt();

        boolean result =  binarSearch(arr, target);
        System.out.println(result);

    }
}
