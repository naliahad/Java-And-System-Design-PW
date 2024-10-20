package Module53.OneDArray;

public class Pallindrome 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,2,3,2,2,1};
        boolean flag = true;

        for (int i=0; i<arr.length/2; i++)
        {
            if(arr[i]!= arr[arr.length-i-1])
            {
                flag = false;
                break;
            }            

        }

        if(flag)
        System.out.println("A Pallindrome");
        else
        System.out.println("Not a Pallindrome.");
    }
}
