package Module28;

class Student
{
    private String name;
    private int age;
public Student(String name, int age) // constructor  special typr of setter, to initialize the value at time of obhect creation.
{
    this.name = name;
    this.age = age;
}
    public String getName() 
    {
        return name;
    }
    // public void setName(String name) 
    // {
    //     this.name = name;
    // }
    public int getAge() 
    {
        return age;
    }
    // public void setAge(int age) 
    // {
    //     this.age = age;
    // }

}
public class Constructor 
{
    public static void main(String[] args) 
    {
        Student st = new Student("Rahul", 23); // constructor = Student constructor is called when object is created.
        // st.setName("Rahul");
        // st.setAge(23);

        String name =  st.getName();
        int age = st.getAge();

        System.out.println(name +" " + age);
        
    }
}
