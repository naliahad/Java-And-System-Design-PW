package Module48;
import java.util.*;
import java.util.stream.*;
public class StreamAPi 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(2,4,7,9,5,6,8);

        /*If we want to operate on data inside collection wothout affecting the original collection,
         we can create a seperate stream. Operations performed on a stream will not affect the  orignal data.
        */
        Stream<Integer> streamData = list.stream();
        //streamData.forEach(i->System.out.println(i)); //With ine stream only 1 operation can be performed, post opetation stream will be consumed.
        Stream<Integer> sortedStream = streamData.sorted(); //A new stream from previous stream operation.
        //sortedStream.forEach(n->System.out.println(n));
        
        Stream <Integer> finalStream = sortedStream.sorted().filter(n->n%2==0).map(n->n*2);
        finalStream.forEach(i->System.out.println(i));

    }
}
