package Module33.MethodsType;

 // Ingerited methods  in java.
class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Plane Taking OFF");
    }
    public void fly()
    {
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Aeroplane 
{ //take off  method inherited in cargo paane wihtout doing any change. Reusing without any change. // Inherited Method
public void fly()
{
    System.out.println("Cargo flies at lower height"); //Changed fly mehthods after inheriting for parent class //Overriding mehtod
    
}
public void CarryGood()
    {
        System.out.println("Cargo Plane carry goods.");  //Methods not present in parent class ase called specialised mehtods. //Specialised Method
    }
}

class PassengerPlane extends Aeroplane 
{ //take off  method inherited in cargo paane wihtout doing any change. Reusing without any change.
    public void fly()
    {
        System.out.println("Pasenger flies at medium height"); //Changed fly mehthos after inheriting for parent class //Overriding mehtod
        
    }
    public void CarryPassenger()
    {
        System.out.println("Passenger Plane carry passenger.");  //Methods not present in parent class ase called specialised mehtods.
    }
}

public class Methods3Type 
{
    public static void main(String []args)
    {
        CargoPlane cp = new CargoPlane();
       
        PassengerPlane pp = new PassengerPlane();
        Aeroplane ref;
        ref = cp;
        ref.takeOff();
        pp.fly();
        pp.CarryPassenger();

        System.out.println("-------------------------------------------");

            ref  = cp;
        cp.takeOff(); // inherited method will be printed.
        cp.fly(); //Over-ride method will be printed.
        cp.CarryGood(); // Specialised method will be ptinted.

    }

}