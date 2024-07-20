package Module28;
class Student
{
    //Multiple constructors with same name but different parameters
    private String name;
    private int age;

    public Student()
    {
        System.out.println("Default constructor");
        name = "Rohan";
        age = 18;
    }

    public Student(String name)
    {
        this.name = name;
        age = 19;
    }

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
        
    }

    public void show()
    {
        System.out.println(name + " " + age);
    }
}
public class thisVSsuper 
{
    public static void main(String[] args) 
    {
        Student st1 = new Student();
        st1.show();
        Student st2 = new Student("Mohan");
        st2.show();
        Student st3 = new Student("Sohan", 20);
        st3.show();

    }
}
