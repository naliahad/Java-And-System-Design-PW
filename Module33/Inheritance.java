package Module33;

class Human{ //parent class// Suoer class// base class
    int age;

    void sleep()
    {
        age = 18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }

}
class student extends Human //CHILD class // sub cllass  // drived class
//inheritance student class using property of human class using "extends" keyword. Promoting reusability of code.  
{

}

 class Inheritance{
    public static void main(String[] args)
    {
    student st = new student();
    st.sleep();
    }
}