package Module34;
class Car
{
    private Engine eng;
    public Car(Engine eng)
    {
        this.eng =  eng;
    }

    public void Start() 
    {
        eng.engineStart();
    }
}
class Engine
{   
    public void engineStart()
    {
        System.out.println("Car Started.");
    }
}
public class HasA 
{
    public static void main(String[] args) 
    {
        Engine eng =  new Engine();
        Car car = new Car(eng); // constructor injection.
        car.Start();
    }    
}
