package Module35;

interface  computer
{
 public void compileCode(); 
}

class laptop implements computer 
{

    public void compileCode()
    {
        System.out.println(" Compiling code in laptop");                                                
    }
}
 class desktop implements computer
 {
    public void compileCode()
    {
        System.out.println(" Compile code in desktop");
    }
 }  
class developer 
{
    
    public void buildApp(computer obj1)
    {
        obj1.compileCode();
        System.out.println("Building App");
    }
}

class Main
{
    public static void main(String [] args)
    {
    
       // computer obj = new laptop();
        computer obj1 = new laptop();
        developer dev = new developer();
        //dev.buildApp(obj);
        dev.buildApp(obj1);
    }
}