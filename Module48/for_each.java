package Module48;
import java.util.*;
public class for_each 
{
    public static void main(String[] args) 
    {
        // List<Integer> list  = new ArrayList<Integer>();
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(8);
        // list.add(9);
        // System.out.println(list);

        List<Integer> list1 = Arrays.asList(2,4,5,8,9); // same lsit collect 2nd mwhtos to write.

        // for (Integer o:list1)
        // {

        //     System.out.println(o);
        // }

            // consumer interface implementation.
            // consumer is inbuilt interface in java. we can disrectly give implemtation in for of lamba expression.   

            //Consumer<Integer> cons = i->System.out.println(i);    

             list1.forEach(i->System.out.println(i));

    }
}
