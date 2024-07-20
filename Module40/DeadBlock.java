package Module40;
class Library implements Runnable
{
    String res1 = new String("java");
    String res2 = new String("Sql");
    String res3 = new String("DSA");

    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equalsIgnoreCase("Student 1"))
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("Student 1 has acc " + res1);
                    Thread.sleep(3000);

                    synchronized(res2)
                    {
                        System.out.println("Student 1 has acc " + res2);
                        Thread.sleep(3000);

                        synchronized(res3)
                        {
                            System.out.println("student 1 ahs acc " + res3);
                            Thread.sleep(3000);
                        }
                    }
                }
            } 
            catch(Exception e) 
            {
                System.out.println("Some Problem.");
            }
 
        }

        else
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("Student 2 has acc " + res3); 
                    /* 
                    Dead block -> both the thread required 
                    same resource and only 1 thread can have a resource at once.
                    */
                    Thread.sleep(3000);

                    synchronized(res2)
                    {
                        System.out.println("Student 2 has acc " + res2);
                        Thread.sleep(3000);

                        synchronized(res1)
                        {
                            System.out.println("student 2 has acc " + res1);
                            Thread.sleep(3000);
                        }
                    }
                }
            } 
            catch(Exception e) 
            {
                System.out.println("Some Problem.");
            }
 
        }
    }
}
public class DeadBlock 
{
    public static void main(String[] args)
    
    {
        Library lib  = new Library();

        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);

        t1.setName("Student 1");
        t1.setName("Student 1");

        t1.start();
        t2.start();
    }   
}
