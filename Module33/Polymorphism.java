package Module33;
//Over-riding vs overloading

class Aeroplane {
    public void fly() {
        System.out.println("Plane is flying");
    }
 
    public void takeOff(){
        System.out.println("Plane taking off.");
    }
}
class CargoPlane extends Aeroplane{
public void fly (){ // Fly over ride. 
    System.out.println("Cargo fly at lower height"); //over-riding 

}

}

class PassengerPlane extends Aeroplane{
    public void fly (){
        System.out.println("PassengerPlane fly at Medium height");
    
    }

}

class Airport{
    public void poly(Aeroplane ref){

        ref.takeOff();
        ref.fly();
    }
}
class Polymorphism{
    public static void main(String []args){

        
PassengerPlane pp = new PassengerPlane();

CargoPlane cp  = new CargoPlane();

// Aeroplane ref; //ref is used for both cargo and passenger plane--polymorphism. ref (reference should be of parent calss {Aeroplane} )
// ref = PP;
// ref.fly();

// System.out.println("-------------------------");

// ref = CP;
// ref.fly();
Airport ref = new Airport();
ref.poly(cp);
System.out.println("-------------------------");
ref.poly(pp);


    }
}
