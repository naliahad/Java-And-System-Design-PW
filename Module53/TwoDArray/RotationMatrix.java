package Module53.TwoDArray;

import java.util.Arrays;

public class RotationMatrix 
{
    public static void rotatedMatrix(int[][] arr) 
    {
        //Step1 trasnpose 2-D Array

        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i; j<arr[0].length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }   

        //Step 2 swap column

        for(int i = 0; i<arr.length; i++)
        {
            int leftIndex = 0;
            int rightIndex = arr.length-1;
            while (leftIndex<rightIndex) 
            {
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;
                leftIndex++;
                rightIndex--;                
            }

        }

    }

    public static void main(String[] args) 
    {
        int arr[][] =  {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
            
        };

        rotatedMatrix(arr);
            for( var mat : arr)
            {
                System.out.println(Arrays.toString(mat));
            }

    }

    
}
