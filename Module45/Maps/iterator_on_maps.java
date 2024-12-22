package Module45.Maps;
import java.util.Map.*;
import java.util.*;
class iterator_on_maps 
{
    public static void main(String[] args) 
    {
         //info will be stored as objects only.

         System.out.println("********************************");
         Map hm = new HashMap();     
         hm.put(01, "Rohan"); 
         hm.put(02, "Rohit");
         hm.put(03, "Rahul");
         hm.put(04, "Karan");
 
         System.out.println(hm);
 
         System.out.println(hm.get(01));
 
         System.out.println("****************************");
 
         Set set = hm.keySet(); ///keySet to iterate over all the key
 
         Iterator itr = set.iterator();
          while(itr.hasNext())
            {
                System.out.println("Key is: " + itr.next());
    
                //Integer i = (Integer)itr.next();
    
                //System.out.println(i);
            }
 
         System.out.println("****************************");
 
         Collection value = hm.values(); //values to iterate over all the values
         
         Iterator itr2 = value.iterator();
 
         while(itr2.hasNext())
         {
             System.out.println("Value is: " + itr2.next()); 
         }
 
         System.out.println("****************************");
 
         Set es = hm.entrySet(); // entrySet to iterate over key + values.    
 
         Iterator itr3 = es.iterator();
 
         while(itr3.hasNext())
            {
             //System.out.println("Key and value is: " + itr3.next());
             Map.Entry data = (Entry)itr3.next();
             System.out.println(data.getKey() + " : " + data.getValue());
            }
 
    }
}
