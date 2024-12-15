package Module43.List;
import java.util.*;

public class arrayList 
{
    public static void main(String[] args) 
    {
        //All the info in ArrayList is added as object.
        
        ArrayList al1 = new ArrayList(); // homogenous data all of same type i.e int

        al1.add(100);
        al1.add(399);
        al1.add(323);
        al1.add(58);
        al1.add(254);

        System.out.println(al1);

        System.out.println("*************************************");
        ArrayList al2 = new ArrayList(); //hterogenous data can store diffrent type of data.

        al2.add("Hello World");
        al2.add('k');
        al2.add(24);
        al2.add(2.0);
        
        System.out.println(al2);

        al2.add(100);

        System.out.println("*************************************");

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);  

        System.out.println(al3);

        System.out.println("*************************************");

        al3.addAll(al2); //can add collections in end

        System.out.println(al3);

        System.out.println("*************************************");

        al3.add(2, "PW"); // insertion in between of collection

        System.out.println(al3);

        System.out.println("*************************************");

        al3.add(100); //Duplicates are allowed in ArrayList.

        System.out.println(al3);

        System.out.println("*************************************");

        System.out.println(al3.contains(100));

        System.out.println("*************************************");

        System.out.println(al3.indexOf(100));

        System.out.println("*************************************");

        System.out.println(al3.size());

        System.out.println("*************************************");

        al3.ensureCapacity(20); //ensure minimun capacity. Can be modified if needed later

        al3.trimToSize();

        System.out.println(al3.size());

        System.out.println("*************************************");

        al3.clear(); //clear the list.

        System.out.println(al3);   


    }
}
