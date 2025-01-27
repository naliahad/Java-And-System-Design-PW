package Module62;

public class TilingBacktracking 
{
    public static int tiling(int n)
    {
        int result;
        if(n<=3)
        {
            return n;
        }

        else
        {
            result = tiling(n-1) + tiling(n-2); //fininaci logic
        }

        return result;
    }
    public static void main(String[] args) 
    {
        int n = 3;
        int result = tiling(n);
        System.out.println(result);
        
    }
}
