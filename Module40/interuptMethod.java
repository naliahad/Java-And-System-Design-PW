package Module40;

//interup(); Method  Thread can be interupted only when in waiting or block stage i.e while thread is running state it cannot be iterupted.

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
                    Thread.sleep(1000);
                }
       }

       catch(Exception e)
        {
            System.out.println("Some problem. " + e);
        }
    }
}
    

public class interuptMethod {
    public static void main(String[] args) throws Exception {
        System.out.println("main  thread started");
        Printing p1 = new Printing();
        Thread t = new Thread(p1);
        t.start();
       // t.join();
       t.interrupt();
        System.out.println("main thread ended");
    }
}


 
