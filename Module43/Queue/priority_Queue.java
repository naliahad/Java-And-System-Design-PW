package Module43.Queue;
import java.util.*;
public class priority_Queue 
{
    public static void main(String[] args) 
    {
        //Min-Heap -> DSA
        //Index based insertion is not allowed. 
        PriorityQueue p1 = new PriorityQueue(); //data will not be inserted in order. will change the order of insertion.
        p1.add(100); 
        p1.add(150);
        p1.add(50);
        p1.add(75);
        p1.add(175);
        p1.add(25);
        p1.add(10);
        //p1.add("PW");

        System.out.println(p1);

        System.out.println("*********************************");
        p1.add(25);

        System.out.println(p1);
    }    
}
