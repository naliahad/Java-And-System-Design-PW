package Module45.Maps;
import java.util.*;
import java.util.Map.*;

class Employee
{
    private String name;
    private int empId;

    public Employee (String name, int empId)
    {
        this.name = name;
        this.empId = empId;
    }

    public String toString ()
    {
        return name + " " +empId;
    }

    @Override
    public void finalize()
    {
        System.out.println("GC clean up before de-allocating from heap area.");
        
    }
}

class hashMapvsWeakHashMap
{
    public static void main(String [] args)
    {
        Employee e = new Employee("Ahad", 171);
        
        WeakHashMap hm = new WeakHashMap(); //weak hash map will let gc complete its work.
        hm.put(e, "Ahad"); //hash map using e will not let garbage collector to de-loacte memory from e.
        System.out.println(hm);
        e = null; // Garbage collection.
        System.gc(); 
        System.out.println(hm);
        System.out.println("Last line.");
    }
}