package Module43.Set;
import java.util.*;

public class hash_Set 
{
    public static void main(String[] args) 
    {
        //Will not maintain order insertion.
        //keeps dynamically grow, if 75% of memory is filled it will get double in ints size.
        HashSet hs1 = new HashSet(); // follows hash tbale algorithm.
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(44);
        hs1.add(44); // Duplicate not allowed.
        System.out.println(hs1);

        // sub class of HashSet
        //maintains order of insertion
        LinkedHashSet lhs1 = new LinkedHashSet(); 
        lhs1.add(100);
        lhs1.add(20);
        lhs1.add(30);
        lhs1.add(44);
        hs1.add(44); // Duplicate not allowed.
        System.out.println(lhs1);
    }
}
