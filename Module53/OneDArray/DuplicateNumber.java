package Module53.OneDArray;

public class DuplicateNumber 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,3,3,4};

        for(int i=0; i<arr.length; i++)
        {
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Duplicate found: " + arr[j]);
                    
                }
            }
        }
    }    
}
