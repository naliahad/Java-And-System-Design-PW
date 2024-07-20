package Module34;
import java.util.Scanner;
//Inheritance Polymorphism Abstract
abstract class Shape 
{
    float area;
    abstract void input();
    abstract void compute();
    public void display()
     {
        System.out.println("Area " + area);
     }

}
class Rectangle extends Shape
{
    float length, breadth;
    public void input()
    {
        System.out.println("Area calc for rectangle.");
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter Length: ");
        length = sc.nextFloat();

        System.out.println("Enter Breadth: ");
        breadth = sc.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }
}


class Square extends Shape
{
    float length;
    
    public void input()
    {
        System.out.println("Area calc for Square.");
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Length: ");
        length = sc.nextFloat();
    }

    public void compute()
    {
        area = length*length;
    }
}


class Circle extends Shape
{
    float radius;

    public void input()
    {
       System.out.println("Area calc for circle.");
       Scanner scan = new Scanner(System.in) ;
       System.out.println("radius: ");
        radius = scan.nextFloat();
        
    }

    void compute() 
    {
        area = 2.141f * radius * radius;
    }
}

class geom
{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.display();
    }
}
public class OOPsRvsn 
{
    public static void main(String[] args) 
    {
        Rectangle rec  = new Rectangle();
        Square sq = new Square();
        Circle cr  = new Circle();
        
        geom g = new geom();
        g.poly(rec);
        g.poly(sq);
        g.poly(cr);
    }    
}
