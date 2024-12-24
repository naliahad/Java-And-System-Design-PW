package Module47;

import java.util.*;

/* Comparable class is used when target class is accessible */
class Student5 implements Comparable<Student5>
{
    int marks;
    int age;
    String name;

    public Student5(int marks, int age, String name) // Constructor
    {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks() // getter
    {
        return marks;
    }

    public int getAge()
     {
        return age;
     }

     public String getName()
     {
        return name;
     }

     public String toString() // to print value as string, esle java will print refrence address.
     {
        return "" + marks  + "-" + age + "-" + name;
     }

     public int compareTo(Student5 b)
     {
        if(this.age > b.age)
        return 1;

        else 
        return-1;
     }

}
public class comparable 
{
    public static void main(String[] args) 
    {
        Student5 st1 = new Student5(45, 18, "Rohan");
        Student5 st2 = new Student5(50, 17, "Ramesh");
        Student5 st3 = new Student5(25, 19, "Rohit");

        List<Student5>  l1 =  new ArrayList<Student5>();
        l1.add(st1);
        l1.add(st2);
        l1.add(st3);
        
        System.out.println(l1);

        System.out.println("************************");

        Collections.sort(l1);
        System.out.println(l1);
        
    }
}
