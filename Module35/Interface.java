package Module35;
interface A
{
    void show();
}

interface X
{
    void abc();
}

/*  
    1. Diffrent from extends, interface implentes the method
    2. to use methods inside "Interface", class can be used.
*/

class B implements A,X 

{
    public void show()
    {
        System.out.println("In show.");
    }

    public void abc()
    {
        System.out.println("in X");
    }
}
public class Interface 
{
    public static void main(String[] args) 
    {
        // A obj = new B();
        // obj.show();   
        
        // X objX = new B();
        // objX.abc();

        B obj =new B();
        obj.show();
        obj.abc();

        X obj1 = new B();
        obj1.abc();
    }
}
