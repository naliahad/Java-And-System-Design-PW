package Module45.Maps;
import java.util.*;
import java.util.Map.*;

class hashTable 
{
    public static void main(String[] args) 
    {
        Hashtable ht1 = new Hashtable(); // Order of insertion is not maintained.
        // Synchornised: Thread safe.
        //null value is not allowed.
        //duplicate not available.
        ht1.put(1, "Rohit");
        //ht1.put(2, "Rohan");
        ht1.put(3, "Ramesh");
        //ht1.put(null, "Ahad");

        System.out.println(ht1);

        ht1.putIfAbsent(2, "Rohan"); //if not present in collection.
        System.out.println(ht1);

        ht1.putIfAbsent(4, "Karan");
        System.out.println(ht1);

        Object et = ht1.clone();
        System.out.println(et);

        Set set = ht1.entrySet();
        Iterator itr1 = set.iterator();

        while(itr1.hasNext())
        {
        //System.out.println(itr1.next());
        Map.Entry  mp= (Entry)itr1.next();
        System.out.println(mp);
        }
        Integer i = new Integer(2);
        TreeMap t1 = new TreeMap(); //sorted out put based on the keys.
        t1.put(2, "Rohan");
        t1.put(3, "Ramesh");
        t1.put(1, "Karan");
        t1.put(i, "king");  

        System.out.println(t1);
    }    
}
