package pwYTDSA;
import java.util.*;
public class prefixsum 
{
    public static void printArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    prefix
    public static void main(String[] args) 
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter size of an array.");

        int length=sc.nextInt();
        int arr[] =new int[length];

        System.out.println("Enter elements of Array.");
        for(int i=0; i<length;i++)
        {
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        

    }
}
