package Module35;

interface A 
{
    public void show ();
    default void Config()
    /* 
    java 8 feature now can define method in interface using  "default". 
    All the classes already present can use this method without changing the code.
    object is required to call default method. 
    */
    {  
    System.out.println("in config");
    }

    static void abc()
    { // can be called directly
        System.out.println("in abc");
    }
}
interface C 
{
    
}
class B implements A
{
    public void show()
    {
        
    }
}

public class java8 
{
    public static void main(String[] args) 
    {
        A.abc();
        //A.Config(); give error.
        B obj = new B(); // or A obj = new B(); 
        obj.Config();
      

    }
}
