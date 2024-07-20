package Module27;

 class Demo {
    
    private int age;
    private String name;

    // Setters and getters

    public void setAge(int age) // setters
    {
        //age = a; // creatin new variable more confusion - instead we must use int age instance variable 
      // "this"- Keyword is used to refer to instace varoiable.
      this.age = age; // local vairable age is used to assign value to instance vvariable. 
      //"this" will specify the current objrct being used.
    }

    public int getAge() // "getter" 
    {
        return age;
    }
    
    public void show()
    {
        System.out.println(age + " " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Demo obj = new Demo ();
        Demo obj1 = new Demo ();
        obj.setAge(18);
        obj.setName("Ahad");
        obj1.setAge(17);
        obj1.setName("Ashar");

        int studentAge = obj.getAge();
       String studentName =  obj.getName();
       int student1Age = obj1.getAge();
      String student1Name =  obj1.getName();

     System.out.print(studentAge+ " ");
     System.out.println(studentName);

       System.out.print(student1Age +" ");
       System.out.println(student1Name);

    }
    
}
