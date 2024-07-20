package Module45.Maps;
import java.util.*;
import java.util.Map.*;

class  Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name  = name;
        this.age  = age;
        this.city = city;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getCity()
    {
        return city;
    }

    public String toString()
    {
        return name + " " + age +  " "  + city;
    
    }
}

public class More_on_hasgMap 
{
    public static void main(String[] args) 
    {
        Student st1 = new Student("Rohan", 18, "Bengaluru");
        Student st2 = new Student("Rohit", 20, "Delhi");
        Student st3 = new Student("Ramesh", 22, "Mesore");

        Map map = new HashMap();

        map.put(1, st1);
        map.put(2, st2);
        map.put(3, st3);
        
        System.out.println(map); // will return the address of value.

        System.out.println("******************************");

        Set set  = map.entrySet();
        Iterator itr1 = set.iterator();

        while(itr1.hasNext())
        {
            Map.Entry mp = (Entry)itr1.next();
            System.out.println(mp.getKey() + " " + mp.getValue());
        }
    }
}
