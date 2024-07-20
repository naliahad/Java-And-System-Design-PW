package Module45.Generics;

import java.util.*;

class Student 
{
    private String name;
    private int id;

    public Student (String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String toString ()
    {
        return name + " " + id;
    }
}

class Employee
{
    private String name;
    private int eid;
}

public class gen1
{
    public static void main(String[]args)
    {


        //  //Type safety only particular type of data can be saved.
        // String ar[] = new String[3];
        // ar[01] = "Ahad";
        

        // //No type safety can enter any type of data in collections
        // ArrayList<String> al = new ArrayList();//type saftey with collections, will only  accept string type of data.
        // // al.add(01);
        // // al.add(2.0);
        // // al.add("Ahad");
        // // String ad1 =  (String)al.get(0);
        // // String ad2 =  (String)al.get(1);
        // // String ad3 =  (String)al.get(2);
        // al.add("Ahad");
        // al.add("PW");
        // al.add("Skills");

        // String ad = al.get(0); // no need to do type casting.
        // System.out.println(ad);

        Student str1 = new Student("Ahad Ali", 1);
        
        Student str2 = new Student("Areeb Ali",2);
        Employee e1 = new Employee();

        ArrayList<Student> al1 = new ArrayList<Student>(); //type saftey will now accpet data of student type only.
        al1.add(str1);
        System.out.println(al1);
    
    }
}
