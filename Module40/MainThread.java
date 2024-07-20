package Module40;

public class MainThread 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");    
        String name = Thread.currentThread().getName();
        System.out.println(name);

        int Priority = Thread.currentThread().getPriority(); //1->10
        System.out.println(Priority);

        System.out.println("After Changing.");

        Thread t = Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);

        System.out.println(Thread.currentThread().getName());
        

    }
}
