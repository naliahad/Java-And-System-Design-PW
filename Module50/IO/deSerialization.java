package Module50.IO;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer1 implements Serializable
{
    int runs;
    int age;
    String name;

    public Cricketer1(int runs, int age, String name)
    {
        this.age = age;  
        this.name = name;
        this.runs =  runs;

    }

    public void disp()
    {
        System.out.println(name+ "\n" + age+ "\n"+ runs);

    }
}
public class deSerialization { //decrryption
    public static void main(String[]args) throws IOException
    {
    //    Cricketer2 c=  new Cricketer2(44, 25, "virat"); 
    //     c.disp();
        // FileOutputStream fos = new FileOutputStream("pw.txt");
        // BufferedOutputStream bos = new BufferedOutputStream(fos);
        // ObjectOutputStream oos =  new ObjectOutputStream(bos);
        // oos.writeObject(c);
        // oos.flush();
        // oos.close();

        FileInputStream fis   =  new FileInputStream("pw.txt");
        ObjectInputStream ois  =  new ObjectInputStream(fis);
        Cricketer1 cr =(Cricketer1)ois.readObject();
        cr.disp();
        
        ois.close();
        


    }
}

