package Module45.Maps;
import java.util.*;
public class hashMap 
{
    public static void main(String[] args) 
    {
        //info will be stored as objects only.
              
        System.out.println("********************************");
        Map hm = new HashMap();     
        hm.put(01, "Rohan"); // (key: 01, value: Rohan) Entry.
        hm.put(05, "Rohan"); //key must always be unique, vlaue can be any type.
        hm.put(02, "Rohit");
        hm.put(03, "Rahul");
 //     hm.put(null, "Karan"); null is allowed in both key and value
 //     hm.put(null, null);
        hm.put(04, "Karan");

        System.out.println("hm ->  " + hm);

        System.out.println("********************************");

        HashMap hm2 = new HashMap(); //order of insertion is not maintained in HashMap (may or may not naintained).
        hm2.put("Rohan", 01);
        hm2.put("Rohit", 02);
        hm2.put("Rahul", 03);
        hm2.put("Karan", 04);

        System.out.println("hm2 ->  " +hm2);

        System.out.println("********************************");

        LinkedHashMap lhm = new LinkedHashMap(); // maintain order of insertion
        lhm.put(01, "Rohan");
        lhm.put(02, "Rohit");
        lhm.put(03, "Rahul");
        lhm.put(04, "Karan");

        System.out.println("lhm ->  " + lhm);
    }
}
