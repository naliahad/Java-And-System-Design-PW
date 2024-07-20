package Module43.Queue;
import java.util.*;     
public class arrayDeque 
{
    public static void main(String[] args) 
    {
        //Can only add at starting or end of array. Index based insertion is not available. -> double ended method
        //Duplicates are allowed.
        //Can store hetro/homo - genous both type of data.

        ArrayDeque d1 =new ArrayDeque(); 

        d1.add(200);
        d1.add(300);
        d1.add(400);
        d1.add(500);
        
        System.out.println(d1);
        System.out.println("*****************");

        d1.addFirst(100);
        d1.addLast(600);

        System.out.println(d1);
        System.out.println("*****************");

        d1.offer(700); //may be add or ay be not, offer may get rejected instead of adding too.
        d1.offerFirst(90);
        d1.offerLast(800);

        System.out.println(d1);

        System.out.println("*****************");
    }
}
