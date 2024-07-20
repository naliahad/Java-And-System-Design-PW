package Module40;

import java.util.*;

class MyThread1 implements Runnable
{
    public void run()
    {
        String tname = Thread.currentThread().getName();
        if(tname.equals("CALC"))
        {
            calc();
        }

        else
        {
            importantMsg();
        }
    }

    public void calc()
    {
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

    public void importantMsg()
    {
        System.out.println("Displaying important message task.");
        try
        {
            for(int i=0; i<3; i++)
            {
                System.out.println("Focus is important to matter skills.");
                Thread.sleep(2000);
            }
        }

        catch(Exception e)
        {
            System.out.println("some problem");
        }

        System.out.println("Displaying import message task ended.");
    }
}




class SingleRunMethod{
    public static void main(String[]args){ 
    
    MyThread1 thread1 = new MyThread1();
    MyThread1 thread2 = new MyThread1();
     Thread th1 =  new Thread(thread1);
     Thread th2 =  new Thread(thread2);
     th1.setName("CALC");
     th2.setName("DISPLAY");

     th1.start();
     th2.start();

    }
}