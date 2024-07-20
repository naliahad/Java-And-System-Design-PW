package Module33;

class Human1{ //parent class// Suoer class// base class
    int age;
    private String name;
    void sleep()
    {
        age = 18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }

}
class Student1 extends Human1 //CHILD class // sub cllass  // drived class
//inheritance student class using property of human class using "extends" keyword. Promoting reusability of code.  
{
void disp()
{    
    System.out.println("The age is " + age + ".");
 // System.out.println("The name is " + name); // Propetied described private in parent class cannot be used in child class.// to protect encapuslation.
}
}

 class InhertanceNencap 
 {
    public static void main(String[] args) 
    {
    Student1 st1 = new Student1();
    st1.sleep();
    st1.disp();
    }
}
