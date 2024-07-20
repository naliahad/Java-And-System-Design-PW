package Module33;

class Animal{
    public void eat(){
        System.out.println("Animals eat everyday");
    
    }

    public void age(){
        System.out.println("Age of animaal");
    }
}

class Tiger extends Animal
{
    public void eat(){ //visiblity must be more or same as of parent oever riden method. Cannot reduce the visibilty of inherited method.
        System.out.println("Tiger eats and hunts."); 
    }

   // public int  age () { // Return type must be same as parent class method inhertied.
   //     return 10;
    //}
//public void age (){ // Parametre must be same as parent class method. If differt it will not be overrind instead its a new mthod (Method overlaoding).
 //   System.out.println("10 age")
//}
}
class Rule {
    public static void main (String []args){
Tiger tg = new Tiger();
tg.eat();
tg.age();
    }
}