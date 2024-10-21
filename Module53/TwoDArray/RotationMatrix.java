package Module53.TwoDArray;

public class RotationMatrix 
{
    private static void rotatedMatrix(int[][] arr) 
    {
        //Step trasnpose 2-D Array

        for(int i = 0; i<arr.length;i++)
        {
            for(int j = i; j<arr[0].length;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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

    }

    
}
