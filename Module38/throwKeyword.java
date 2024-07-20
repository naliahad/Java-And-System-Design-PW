package Module38;

public class throwKeyword 
{
    public static void main(String[] args) 
    {
        int num1 = 6;
        int num2 = -1;

        try
        {
            if(num2<0)
            {
                Exception e = new ArithmeticException("Negative number.");
                throw e;
            }

            else
            {
                int result = num1/num2;
                System.out.println(result);
            }
            
        }

        catch(Exception e)
        {
            System.out.println("Enter a valid number : " + e);
        }
    }    
}
