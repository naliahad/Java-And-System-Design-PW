package Module33;

abstract class Aeroplane3 //Iff a class have one or more abstract method, then class must be declared as "abstract".
{
     abstract public void takeOff(); //Whenever body is not required or present for a method only signature ("Method is required") it must be decalred as "abstract". 
    
    // {
    //     System.out.println("Taking Off"); // Body id not used by any of the child class. There is no use of havnig this body.
    // }

    abstract public void fly();
    
    // {
    //     System.out.println("Plane is flying"); // Body id not used by any of the child class. There is no use of havnig this body.
    // }
}

class Cargoplane3 extends Aeroplane3
{

    public void takeOff ()
    {
        System.out.println("Cargo plane need longer runway.");
    
    }

    public void fly()
    {
        System.out.println("Cargo plane flies at lower height.");

    }

    public void goods()// specialised method need down casting to acces with abstract parent class.
    {
        System.out.println("Cargo plane carry goods.");
    } 
}

class Passengerplane3 extends Aeroplane3
{

    public void takeOff ()
    {
        System.out.println("Passenger plane need medium runway for take Off.");
    }

    public void fly()
    {
        System.out.println("Passenger plane flies at medium height");
    }

    public void passenger()
     {
        System.out.println("Passenger plane carries passenger.");
    }
}

class Abstraction
{
    public static void main(String []args)
    {

        Aeroplane3 cp3 = new Cargoplane3();
        Passengerplane3 pp3 = new Passengerplane3();

        cp3.takeOff();
        cp3.fly();
        ((Cargoplane3) cp3).goods(); // Aeroplane3 refrence does not have goods mehtod inside it. "goods" cannot be accesed with Aeroplane reference.
                    // Casting is required here to acces goods mehtod/specialised method.


    }

}