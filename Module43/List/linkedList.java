package Module43.List;
import java.util.*;

public class linkedList 
{
    public static void main(String[] args) 
    {
        //Linked list is a class in java, which is part of collection framekwork. Linked List implements two interfaces 1. List interface 2. Dequeue interface
        //Doubly Linked List data structure
        LinkedList l1 = new LinkedList();

        l1.add(100);
        l1.add(399);
        l1.add(323);
        l1.add(58);
        l1.add(254);
        l1.add(100);

        System.out.println(l1.indexOf(100) + " "+ l1.lastIndexOf(100));

        System.out.println(l1);

        System.out.println("*************************************");

        LinkedList l2 = new LinkedList(); //hterogenous data can store diffrent type of data.

        l2.add("Hello World");
        l2.add('k');
        l2.add(24);
        l2.add(2.0);
        
        System.out.println(l2);

        LinkedList l3 = new LinkedList();
        l3.add(1);
        l3.add(2);
        l3.add(3);  

        l3.addAll(l1);

        l3.addFirst("PW");

        l3.addLast("Skills");
         
        System.out.println(l3);

        System.out.println(l3.peek()); // will give 1st object wihtout affecting collection.
        System.out.println(l3);

        System.out.println("**********************");

        System.out.println(l3.poll()); //will give first object of collection and remove it from the collection.
        System.out.println(l3);

    }
}
