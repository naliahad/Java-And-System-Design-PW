package Module53.OneDArray;

public class ResversalArray 
{
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,4,5,6,7};
        int n = arr.length;
        for(int i = 0; i< arr.length/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]);
        }
    }    
}
