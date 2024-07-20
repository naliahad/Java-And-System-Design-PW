package Module40;
import java.util.Scanner;

class calc extends Thread
{
    public void run()
    {  //for tread task should be defined in run method.
        System.out.println("Calc method.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number.");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2.");
        int num2 = sc.nextInt();
        int result  = num1 + num2;
        System.out.println(result);
        System.out.println("Calculation task Ended");
        System.out.println("****************************************************");


    }
}

class print extends Thread
{
    public void run()
    {
        try
        {  
            for (int i = 0; i <= 5; i++)
            {
                System.out.println("In print method");

                Thread.sleep(2000); //will create delay (2000 = 2 mili seconds)
            }
        }

        catch(Exception e)
        {
            System.out.println("Error in loop 200");
        }
        
        System.out.println("print task ended");
    }
    
}

public class ExtendMethod 
{
    public static void main(String [] args)
    {
        calc t1 = new calc();
        print t2 = new print();
        t1.start();
        t2.start();
    }
}
