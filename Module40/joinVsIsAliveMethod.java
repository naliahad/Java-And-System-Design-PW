package Module40;

class Printing implements Runnable
{
    public void run()
    {
       try 
       {
            System.out.println("Printing task started.");
            for(int i=0; i<3; i++)
                {
                    System.out.println("Inside printing task.");
                }
       }

       catch(Exception e)
        {
            System.out.println("Some problem. " + e);
        }
    }
}
    
     
    public class joinVsIsAliveMethod 
    {
        public static void main(String[] args) throws Exception
        {
            System.out.println("Main thread started.");
            Printing p = new Printing();
            Thread t1 = new Thread(p);
        
            System.out.println(t1.isAlive()); //false thread life does not start untill we give start().
        
            t1.start();
        
            System.out.println(t1.isAlive()); //true thread t1 is alive.
        
            t1.join(); //join > until t1 thread completes its work other thread will keep waiting.
        
            System.out.println(t1.isAlive()); //false t1 task completed thread is dead here
        
            System.out.println("Main thread ended.");
        }
    }
    