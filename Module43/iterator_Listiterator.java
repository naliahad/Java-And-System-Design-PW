package Module43;
import java.util.*;

public class iterator_Listiterator 
{
    public static void main(String[] args) 
    {
        //Fetching Data
        ArrayList al1 = new ArrayList();
        al1.add("PW");
        al1.add(1);
        al1.add("java");
        al1.add(100);

        //for loop

        for(int i=0; i<al1.size(); i++)
        {
            Object o = al1.get(i);
            System.out.println(o);
        }

        //For each

        for(Object o : al1)
        {
            System.out.println(o);
        }

        //Iteratopr method

        Iterator itr = al1.iterator();
        while(itr.hasNext())
        {
            Object o = itr.next();
            System.out.println(o);
        }

        //ListIterator ->  only in list based iterator
        //can traverse in reverse direction.

        ListIterator litr = al1.listIterator(al1.size());
        while(litr.hasPrevious())
        {
            Object o = litr.previous();
            System.out.println(o);
        }



    }
}
