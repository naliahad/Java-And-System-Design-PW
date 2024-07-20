package Module38;

// handling v/s ducking 

class demo 
{

    public void a () 
    {
        System.out.println("in a");
    try
        {
            b();
        }

 catch(Exception e)
 {
    System.out.println("error" + e.getMessage());
 }
    }

    public void b () throws Exception
    {
        int num1 = 9;
        int num2 = 0;
        int result = 0;

        result  = num1/num2;

        System.out.println(result);
    }
}

public class Ducking  
{
    public static void main(String[] args)  
    {
    demo obj = new demo();

    obj.a();
    
    }
}

