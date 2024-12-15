     package Module26;

import java.util.*;

class Student
{
    int age =5; //instance variable, unique for each object, non static
    static String school; //non instance, shared by all onject, static

    static //static block
    {
        school = "pw";
    }

    public void show() //non static mehtod
    {
        System.out.println("in show " + age + " " + school); //school: static variable can be accessed in non static method
    }

    public static void study() //static method
    {
        System.out.println("studying" ); //age: non static variables cant be accessed inside static method
    }
}
class StaticKeyword
{
    static
    {
        System.out.println("in static block");
    }
    public static void main(String[] args) 
    {
        System.out.println("in main method");
        Student obj1 =  new Student();
        obj1.age = 19;
        obj1.school = "PW Skill";
        obj1.show(); //age=19, school=pw skill
        
        Student.study();//static method call with class name

        System.out.println(obj1.age); //use object refrence for instance variable
        System.out.println(Student.school);// class is used for calling instancr variable
        

        Student obj2 =  new Student();
        obj2.show(); // age=0, school=pw skill

    }
}