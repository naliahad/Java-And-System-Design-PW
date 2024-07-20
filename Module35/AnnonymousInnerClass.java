package Module35;
interface Car
{
    void drive(); //If we want to used interface just once we can used annonymous interface without using class.
}
public class AnnonymousInnerClass 
{
    public static void main(String[] args) 
    {
        Car obj =  new Car() // Annonymous Inner class -> without name.
        {
            public void drive()
            {
                System.out.println("Driving....");
            }
        };

        obj.drive();
    }
}
