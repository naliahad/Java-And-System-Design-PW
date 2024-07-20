package Module28;

class Demo
{
    private int a, b;

/*    public Demo() // default constructor will be created within java if programmer has not created any.
    {

    }
 */
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class DefaultConstructor 
{
    public static void main(String[] args) 
    {
        Demo d = new Demo(); //Dem() in this line is call to constructor, there is no Demo() constructor given by programmer so java complier will include a default 0 parametere constructor behind by java.
        d.disp();
    }
}
