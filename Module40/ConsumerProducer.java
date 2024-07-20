package Module40;
//Incomplete 
class Queue 
{
    int x; 
    boolean vlaueInX = false;
    synchronized void put(int j)
    {
        try 
        {
            x = j;
            System.out.println("I have produced the data into x. " + x);
        } 
        catch (Exception e) 
        {
            System.out.println("Some Error.");
        }
        
    }

    synchronized void get()
    {
        try 
        {
            System.out.println("I havce consumed the data x. " + x);
        } 
        catch (Exception e) 
        {
            System.out.println("Some Error.");
        }
        
    }
} 

class Producer implements Runnable
{
    Queue q;
    Producer(Queue b)
    {
        q = b;
    }
    public void run()
    {
        int i = 1;

        while(true)
        {
            q.put(i++);
        }
    }

}

class Consumer implements Runnable
{
    Queue q;
    Consumer (Queue a)
    {
        q =a;
    }
    public void run()
    {
       //while(true){
        q.get();
       
    }
}

public class ConsumerProducer 
{
    public static void main(String[] args) 
    {

        Queue q = new Queue();
        
        Producer p = new Producer(q);

        Consumer c = new Consumer(q);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

        
    }
    
}
