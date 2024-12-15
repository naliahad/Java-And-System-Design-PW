package Module40;

import java.util.Scanner;

class calc implements Runnable
{
    public void run()
    {  //for thread task should be defined in run method.
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
//execution of threds is decided by thread scheduler.
class print implements Runnable
{
    public void run()
    {
        try
        {              
            for(int i = 0; i <= 5; i++)
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

public class RunnableMethods 
{
    public static void main(String [] args)
    {
        calc c1 = new calc();
        print p2 = new print();

        Thread t1 = new Thread(c1); // need to create thread ovject and inject method address in it in case if implementing runnable
        Thread t2 = new Thread(p2);

        t1.start(); //never call run mehtond by ownself else it will behave like a single threaded program.
        t2.start();
    } 
}