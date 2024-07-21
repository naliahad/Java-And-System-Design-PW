package Module50.IO;
import java.io.*;
public class LaunchFile2 
{
    public static void main(String[] args) throws IOException
    {
        File dir  =  new File("PWJAVA");
        System.out.println(dir.isDirectory());
        dir.mkdir();

        File file = new File(dir, "pwskill.txt");
        file.createNewFile(); 
        System.out.println(file.isFile());

        //To count number of file.

        int count = 0;

        File f = new File("PWJAVA");
        String str []= f.list();

        for(String name:str)
        {
            count++;
            System.out.println(name);
        }

        System.out.println("Number: " + count);
    }
}
