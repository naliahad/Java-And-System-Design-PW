package Module40;


class Car implements Runnable
{
    // synchronized
    public void run() //1st thread whcih got chance will complete all task first then another trhread will execute.
    {   //multiple thread but only 1 run resource availble.

        try
        {
            System.out.println(Thread.currentThread().getName() + " Found car");
            Thread.sleep(1000);
            System.out.println();
            
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName() + " Entered car");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Drinving car");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() +" Parked car");
                Thread.sleep(1000);
                System.out.println(); 
            }
            
        }

        catch(Exception e)
        {
            System.out.println("Some Problem.");
        }
    }
}
public class Synchronized 
{
    public static void main(String[] args) 
    {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son1");
        t2.setName("Son2");
        t3.setName("Son3");

        t1.start();
        t2.start();
        t3.start();
    }
}
