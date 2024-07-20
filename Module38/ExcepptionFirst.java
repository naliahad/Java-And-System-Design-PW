package Module38;

public class ExcepptionFirst 
{
    public static void main(String[] args) 
    {
        int a = 6;
        int b = 2;
        int result = 0;
        int value [] = {1,2,3,4,5,6};
        String name = null;

         /*  if there is no exception try block will be executed. 
            As soon as exception is detected conmsle will get out of try block without executing rmaining code. 
        */
        try     
        {
             result = a / b; 
             System.out.println(value[1]);
             System.out.println(name.length());
        }
        catch (ArithmeticException e) // if there is excption catch block will be executed.
        {
            
            System.out.println("Error in code, cannoy devide by 0 " + e);
        }        
        
        catch(ArrayIndexOutOfBoundsException e) 
        { 
            System.out.println("Error stay in limits " + e);
        }
        
        /*  always have a buffer catch block to catch exception which cannot be determined.
            last catch will make the code execute instead of stoping at exception. 
        */
        catch(Exception e)
        { 
            System.out.println("Somehting went wrong");
        }
     System.out.println(result);    
        System.out.println("Bye!"); 

    }
}
