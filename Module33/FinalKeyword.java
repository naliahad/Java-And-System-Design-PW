package Module33;
final class Animal
{
    public void sleep()
    {
        System.out.println("Animal need sleep.");
    }
}

class Animal2
{
   final public void eat() //cannot be modified in child class.
    {
        System.out.println("Animal eats.");
    }
}
class Tiger extends Animal // Animal will not participate in Inheritance cause of final keyword.
{

}
public class FinalKeyword {
    
    public static void main(String[] args) {
        
    }
}
