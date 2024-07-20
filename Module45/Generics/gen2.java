package Module45.Generics;

import java.util.*;

class gen<T> //own genric type.
{
    T obj;
    public gen(T obj)
    {
        this.obj = obj;
    }

    public T getobj()
    {
        return obj;
    }

    void disp()
    {
        System.out.println("Type of object is " + obj.getClass().getName());
    }
}
public class gen2 
{

    public static void main(String[] args) 
    {
        // ArrayList<String> list1 = new ArrayList<String>();

        // List<String> list2 = new ArrayList<String>();

        // Collection<Integer> list3 = new ArrayList<Integer>();

        List<Integer> list4 = new ArrayList<Integer>();

        // List<int> list5 = new ArrayList<int>();

        // List<gen1> list6 = new ArrayList<gen1>();

        gen<Integer> g = new gen<Integer>(10);
        g.disp();
        System.out.println("********************************");
        gen<String>  g1 = new gen<String>("10");
        g1.disp();

    }

}
