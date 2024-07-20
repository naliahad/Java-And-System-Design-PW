package Module33;

class Demo1
{
    void disp()
    {
        System.out.println("Disp method in Demo1");
    }

}

class Demo2 extends Demo1
{

}

class Demo3 extends Demo2
{

}
public class MultiLevel 
{
    public static void main(String[] args) 
    {
        Demo3 d = new Demo3();
        d.disp();
    }
    
}
