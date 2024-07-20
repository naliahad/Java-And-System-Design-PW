package Module50.IO;

class student 
{
    private String name;
    private int age;
    private String city;

    public student(String name, int age, String city )
    {
        this.name =  name;
        this.age = age;
        this.city =  city;
    }

    @Override
    public String toString()
    {
        return "Name :"+ name + " Age :" + age + " City :" + city;
    }
}
class ioPackage
{
    public static void main(String[] args)
    {

        student st1 =  new student("Sonal", 25, "BLR");

        System.out.println(st1.toString());  

        
    }
}
