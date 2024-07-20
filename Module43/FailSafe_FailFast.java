package Module43;

import java.util.*;
import java.util.concurrent.*;


public class FailSafe_FailFast 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
    /*
        //Fail fast error > will throw a concurrent modification error
        Iterator il = al.iterator();
            while(il.hasNext())
            {
                Object o = il.next();
                System.out.println(o);
                al.add(100);
            }
    */

        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList(); //code will fail safely.
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);

        System.out.println(al1);
        System.out.println("*********************");

        Iterator il = al1.iterator();
            while(il.hasNext())
            {
                Object o = il.next();
                System.out.println(o);
                al1.add(100); //Failed to add and code failed safely withot throwing exceptionm in Iterator.
            }
    }
}
