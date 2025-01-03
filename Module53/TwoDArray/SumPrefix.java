package Module53.TwoDArray;
import java.util.*;
public class SumPrefix 
{
    public static int findSumMatrix(int arr[][], int r1, int c1, int r2, int c2)
    {
        int sum=0;
        for (int i=r1; i<=r2; i++)
        {   
            for (int j=c1; j<=c2;j++)
            {
                sum += arr[i][j];
            }
        }
        return sum;
    }  

    public static int sumRegion(int [][]arr, int r1, int c1, int r2, int c2)
    {
        int sum=0, up=0, left=0, repeated_region=0, result=0;
        sum = arr[r2][c2];
        return sum;
        
    }
    public static void prefSumMatrix(int arr[][])
    {
        int m = arr.length;
        int n = arr[0].length;
        //traveresed the array hroiozntolly i.e row wise to claculate row wise prefix sum.

        for(int i=0; i<m; i++)
        {
            for(int j=1;j<n; j++)
            {
                arr[i][j] = arr[i][j-1];
            }
        }

        //traverse array colum wise for column wise prefix
         for(int j=0; j<n; j++)
         {
            for(int i=1; i<m; i++)
            {
                arr[i][j] += arr[i-1][j];
            }
         }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int n = sc.nextInt();

        int arr[][] = new int [m][n];
        System.out.println("Enter the matrix Elements.");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int r1, c1, r2, c2;

        System.out.print("Enter the value of r1 coordinate.");
        r1 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate.");
        c1 = sc.nextInt();

        System.out.print("Enter the value of r2 coordinate.");
        r2 = sc.nextInt();

        System.out.print("Enter the value of c1 coordinate.");
        c2 = sc.nextInt();

        //int result = findSumMatrix(arr,r1,c1,r2,c2);;
        //System.out.println("Sum of elements of given rectangle is " + result);

        prefSumMatrix(arr);
        int result = sumRegion(arr, r1,c1, r2,c2);
    }
}
