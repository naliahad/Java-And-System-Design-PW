package Module56;
class demo2
{
    public static int sqaureRootMethod(int num)
    {
        int low =0;
        int high = num;
        int result = -1;

        while(low<=high)
        {
            int mid = low +(high-low)/2;
            long value = mid*mid;
             if(value == num)
             {
                //Perfect square root of a number.
                return mid;
             }

             else if(value > num)
             {
                high = mid-1;
             }

             else
             {
                result = mid; // lower bound value for non pefect square number ex input 26: output 5 (5*5= 25).
                low = mid+1;
             }
        }
         return result;
    }
}
public class sqaureRoot 
{
    public static void main(String[] args) 
    {
        int num = 26;
        int result = demo2.sqaureRootMethod(num);
        System.out.println(result);
    }   
}
