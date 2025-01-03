package Module47;

import java.util.*;

class Student5
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
}


// class Alpha implements Comparator<Student5> //Cpmparator class implementation
// {
//     public  int compare(Student5 a, Student5 b)
//     {
//         if(a.age > b.age)
//         {
//             return 1;
//         }
//         else 
//         {
//             return -1;
//         }
//     }
// }
public class comparator
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
        
       // Collections.sort(l1); // Sorting cant be done here with colections because of complex data. We need Comparable & Comparator.
       //for both Comparable & Comparator we have to provide implemetation
       // Collections.sort(l1); s.sort will not work.

/*       Comparator<Student5> comp = new Comparator<Student5>() //Cpmparator class implementation using annonymous inner class
       {
            public  int compare(Student5 a, Student5 b)
            {
                if(a.age > b.age)
                {
                    return 1;
                }
                else 
                {
                    return -1;
                }
            }
       };
 */

/*        Comparator<Student5> comp = (Student5 a, Student5 b) -> //Cpmparator class implementation using lambda Expression
 
        {
             if(a.age > b.age)
             {
                 return 1;
             }
             else 
             {
                 return -1;
             }
         };
 */    


       //Alpha b = new Alpha();

       Collections.sort(l1, (Student5 a, Student5 b) ->  //Cpmparator class direct implementation.
       {
            if(a.age > b.age)
            {
                return 1;
            }
            else 
            {
                return -1;
            }
        }
    );
       System.out.println(l1);

    }
}
