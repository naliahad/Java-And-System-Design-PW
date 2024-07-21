package Module50.IO;

import java.io.FileOutputStream;
import java.io.IOException;
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
}

public class serialization 
{
    public static void main(String[]args) throws IOException
    {
       Cricketer1 c=  new Cricketer1 (44, 25, "virat"); 
        
        FileOutputStream fos = new FileOutputStream("pw.txt");
        ObjectOutputStream oos =  new ObjectOutputStream(fos);
        
        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}
