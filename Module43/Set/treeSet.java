package Module43.Set;
import  java.util.*;

public class treeSet 
{
    public static void main(String[] args) 
    {
        //Binary Search Tree -> DSA
        TreeSet t1 = new TreeSet(); //change the order data to ascending. //sorted.
        t1.add(100); 
        t1.add(50);
        t1.add(150);
        t1.add(25);
        t1.add(75);
        t1.add(125);
        t1.add(175);

        System.out.println(t1);

        // t1.add(100); // duolicate is not allowed in TreeSet
        // System.out.println(t1);

        System.out.println(t1.higher(50));
        System.out.println(t1.lower(50));
        System.out.println(t1.ceiling(40));
        System.out.println(t1.floor(40));
    }
}
